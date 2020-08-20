package com.java110.intf.store;

import com.java110.dto.wechatMenu.WechatMenuDto;

import java.util.List;

/**
 * @ClassName IWechatMenuInnerServiceSMO
 * @Description 公众号菜单接口类
 * @Author wuxw
 * @Date 2019/4/24 9:04
 * @Version 1.0
 * add by wuxw 2019/4/24
 **/

public interface IWechatMenuInnerServiceSMO {

    /**
     * <p>查询小区楼信息</p>
     *
     * @param wechatMenuDto 数据对象分享
     * @return WechatMenuDto 对象数据
     */
    List<WechatMenuDto> queryWechatMenus(WechatMenuDto wechatMenuDto);

    /**
     * 查询<p>小区楼</p>总记录数
     *
     * @param wechatMenuDto 数据对象分享
     * @return 小区下的小区楼记录数
     */
    int queryWechatMenusCount(WechatMenuDto wechatMenuDto);
}
