package com.java110.intf.common;

import com.java110.dto.msg.MsgDto;

import java.util.List;

/**
 * @ClassName IMsgInnerServiceSMO
 * @Description 消息接口类
 * @Author wuxw
 * @Date 2019/4/24 9:04
 * @Version 1.0
 * add by wuxw 2019/4/24
 **/

public interface IMsgInnerServiceSMO {

    /**
     * <p>查询小区楼信息</p>
     *
     * @param msgDto 数据对象分享
     * @return MsgDto 对象数据
     */
    List<MsgDto> queryMsgs(MsgDto msgDto);

    /**
     * 查询<p>小区楼</p>总记录数
     *
     * @param msgDto 数据对象分享
     * @return 小区下的小区楼记录数
     */
    int queryMsgsCount(MsgDto msgDto);
}
