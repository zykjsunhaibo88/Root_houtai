package com.java110.intf.common;

import com.java110.dto.msg.SmsDto;

/**
 * @ClassName IMsgInnerServiceSMO
 * @Description 发送短信接口
 * @Author wuxw
 * @Date 2019/4/24 9:04
 * @Version 1.0
 * add by wuxw 2019/4/24
 **/

public interface ISmsInnerServiceSMO {

    /**
     * <p>查询小区楼信息</p>
     *
     * @param smsDto 短信信息
     * @return MsgDto 对象数据
     */
    SmsDto send(SmsDto smsDto);

    /**
     * 查询<p>小区楼</p>总记录数
     *
     * @param smsDto 短信信息
     * @return 小区下的小区楼记录数
     */
    SmsDto validateCode(SmsDto smsDto);
}
