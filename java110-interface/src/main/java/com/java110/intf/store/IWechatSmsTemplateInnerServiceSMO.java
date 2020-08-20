package com.java110.intf.store;

import com.java110.dto.wechatSmsTemplate.WechatSmsTemplateDto;
import com.java110.po.wechatSmsTemplate.WechatSmsTemplatePo;

import java.util.List;

/**
 * @ClassName IWechatSmsTemplateInnerServiceSMO
 * @Description 微信消息模板接口类
 * @Author wuxw
 * @Date 2019/4/24 9:04
 * @Version 1.0
 * add by wuxw 2019/4/24
 **/

public interface IWechatSmsTemplateInnerServiceSMO {


    public int saveWechatSmsTemplate(WechatSmsTemplatePo wechatSmsTemplatePo);

    public int updateWechatSmsTemplate(WechatSmsTemplatePo wechatSmsTemplatePo);

    public int deleteWechatSmsTemplate(WechatSmsTemplatePo wechatSmsTemplatePo);

    /**
     * <p>查询小区楼信息</p>
     *
     * @param wechatSmsTemplateDto 数据对象分享
     * @return WechatSmsTemplateDto 对象数据
     */
    List<WechatSmsTemplateDto> queryWechatSmsTemplates(WechatSmsTemplateDto wechatSmsTemplateDto);

    /**
     * 查询<p>小区楼</p>总记录数
     *
     * @param wechatSmsTemplateDto 数据对象分享
     * @return 小区下的小区楼记录数
     */
    int queryWechatSmsTemplatesCount(WechatSmsTemplateDto wechatSmsTemplateDto);
}
