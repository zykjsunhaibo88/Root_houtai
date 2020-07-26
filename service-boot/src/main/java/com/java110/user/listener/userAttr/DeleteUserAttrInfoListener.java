package com.java110.user.listener.userAttr;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.java110.po.userAttr.UserAttrPo;
import com.java110.utils.constant.BusinessTypeConstant;
import com.java110.utils.constant.ResponseConstant;
import com.java110.utils.constant.StatusConstant;
import com.java110.utils.exception.ListenerExecuteException;
import com.java110.utils.util.Assert;
import com.java110.core.annotation.Java110Listener;
import com.java110.core.context.DataFlowContext;
import com.java110.entity.center.Business;
import com.java110.user.dao.IUserAttrServiceDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 删除用户属性信息 侦听
 *
 * 处理节点
 * 1、businessUserAttr:{} 用户属性基本信息节点
 * 2、businessUserAttrAttr:[{}] 用户属性属性信息节点
 * 3、businessUserAttrPhoto:[{}] 用户属性照片信息节点
 * 4、businessUserAttrCerdentials:[{}] 用户属性证件信息节点
 * 协议地址 ：https://github.com/java110/MicroCommunity/wiki/%E5%88%A0%E9%99%A4%E5%95%86%E6%88%B7%E4%BF%A1%E6%81%AF-%E5%8D%8F%E8%AE%AE
 * Created by wuxw on 2018/5/18.
 */
@Java110Listener("deleteUserAttrInfoListener")
@Transactional
public class DeleteUserAttrInfoListener extends AbstractUserAttrBusinessServiceDataFlowListener {

    private final static Logger logger = LoggerFactory.getLogger(DeleteUserAttrInfoListener.class);
    @Autowired
    IUserAttrServiceDao userAttrServiceDaoImpl;

    @Override
    public int getOrder() {
        return 3;
    }

    @Override
    public String getBusinessTypeCd() {
        return BusinessTypeConstant.BUSINESS_TYPE_DELETE_USER_ATTR_INFO;
    }

    /**
     * 根据删除信息 查出Instance表中数据 保存至business表 （状态写DEL） 方便撤单时直接更新回去
     * @param dataFlowContext 数据对象
     * @param business 当前业务对象
     */
    @Override
    protected void doSaveBusiness(DataFlowContext dataFlowContext, Business business) {
        JSONObject data = business.getDatas();

        Assert.notEmpty(data,"没有datas 节点，或没有子节点需要处理");

            //处理 businessUserAttr 节点
            if(data.containsKey(UserAttrPo.class.getSimpleName())){
                Object _obj = data.get(UserAttrPo.class.getSimpleName());
                JSONArray businessUserAttrs = null;
                if(_obj instanceof JSONObject){
                    businessUserAttrs = new JSONArray();
                    businessUserAttrs.add(_obj);
                }else {
                    businessUserAttrs = (JSONArray)_obj;
                }
                //JSONObject businessUserAttr = data.getJSONObject(UserAttrPo.class.getSimpleName());
                for (int _userAttrIndex = 0; _userAttrIndex < businessUserAttrs.size();_userAttrIndex++) {
                    JSONObject businessUserAttr = businessUserAttrs.getJSONObject(_userAttrIndex);
                    doBusinessUserAttr(business, businessUserAttr);
                    if(_obj instanceof JSONObject) {
                        dataFlowContext.addParamOut("attrId", businessUserAttr.getString("attrId"));
                    }
                }

        }


    }

    /**
     * 删除 instance数据
     * @param dataFlowContext 数据对象
     * @param business 当前业务对象
     */
    @Override
    protected void doBusinessToInstance(DataFlowContext dataFlowContext, Business business) {
        String bId = business.getbId();
        //Assert.hasLength(bId,"请求报文中没有包含 bId");

        //用户属性信息
        Map info = new HashMap();
        info.put("bId",business.getbId());
        info.put("operate",StatusConstant.OPERATE_DEL);

        //用户属性信息
        List<Map> businessUserAttrInfos = userAttrServiceDaoImpl.getBusinessUserAttrInfo(info);
        if( businessUserAttrInfos != null && businessUserAttrInfos.size() >0) {
            for (int _userAttrIndex = 0; _userAttrIndex < businessUserAttrInfos.size();_userAttrIndex++) {
                Map businessUserAttrInfo = businessUserAttrInfos.get(_userAttrIndex);
                flushBusinessUserAttrInfo(businessUserAttrInfo,StatusConstant.STATUS_CD_INVALID);
                userAttrServiceDaoImpl.updateUserAttrInfoInstance(businessUserAttrInfo);
                dataFlowContext.addParamOut("attrId",businessUserAttrInfo.get("attr_id"));
            }
        }

    }

    /**
     * 撤单
     * 从business表中查询到DEL的数据 将instance中的数据更新回来
     * @param dataFlowContext 数据对象
     * @param business 当前业务对象
     */
    @Override
    protected void doRecover(DataFlowContext dataFlowContext, Business business) {
        String bId = business.getbId();
        //Assert.hasLength(bId,"请求报文中没有包含 bId");
        Map info = new HashMap();
        info.put("bId",bId);
        info.put("statusCd",StatusConstant.STATUS_CD_INVALID);

        Map delInfo = new HashMap();
        delInfo.put("bId",business.getbId());
        delInfo.put("operate",StatusConstant.OPERATE_DEL);
        //用户属性信息
        List<Map> userAttrInfo = userAttrServiceDaoImpl.getUserAttrInfo(info);
        if(userAttrInfo != null && userAttrInfo.size() > 0){

            //用户属性信息
            List<Map> businessUserAttrInfos = userAttrServiceDaoImpl.getBusinessUserAttrInfo(delInfo);
            //除非程序出错了，这里不会为空
            if(businessUserAttrInfos == null ||  businessUserAttrInfos.size() == 0){
                throw new ListenerExecuteException(ResponseConstant.RESULT_CODE_INNER_ERROR,"撤单失败（userAttr），程序内部异常,请检查！ "+delInfo);
            }
            for (int _userAttrIndex = 0; _userAttrIndex < businessUserAttrInfos.size();_userAttrIndex++) {
                Map businessUserAttrInfo = businessUserAttrInfos.get(_userAttrIndex);
                flushBusinessUserAttrInfo(businessUserAttrInfo,StatusConstant.STATUS_CD_VALID);
                userAttrServiceDaoImpl.updateUserAttrInfoInstance(businessUserAttrInfo);
            }
        }
    }



    /**
     * 处理 businessUserAttr 节点
     * @param business 总的数据节点
     * @param businessUserAttr 用户属性节点
     */
    private void doBusinessUserAttr(Business business,JSONObject businessUserAttr){

        Assert.jsonObjectHaveKey(businessUserAttr,"attrId","businessUserAttr 节点下没有包含 attrId 节点");

        if(businessUserAttr.getString("attrId").startsWith("-")){
            throw new ListenerExecuteException(ResponseConstant.RESULT_PARAM_ERROR,"attrId 错误，不能自动生成（必须已经存在的attrId）"+businessUserAttr);
        }
        //自动插入DEL
        autoSaveDelBusinessUserAttr(business,businessUserAttr);
    }
    @Override
    public IUserAttrServiceDao getUserAttrServiceDaoImpl() {
        return userAttrServiceDaoImpl;
    }

    public void setUserAttrServiceDaoImpl(IUserAttrServiceDao userAttrServiceDaoImpl) {
        this.userAttrServiceDaoImpl = userAttrServiceDaoImpl;
    }
}
