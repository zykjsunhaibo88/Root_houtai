package com.java110.intf.community;

import com.java110.dto.fastuser.FastuserDto;

import java.util.List;

/**
 * @ClassName IFastuserInnerServiceSMO
 * @Description 活动接口类
 * @Author wuxw
 * @Date 2019/4/24 9:04
 * @Version 1.0
 * add by wuxw 2019/4/24
 **/

public interface IFastuserInnerServiceSMO {

    /**
     * <p>查询用户测试信息</p>
     *
     * @param fastuserDto 数据对象分享
     * @return ActivitiesDto 对象数据
     */
    List<FastuserDto> queryFastuser(FastuserDto fastuserDto);

    /**
     * 查询<p>小区楼</p>总记录数
     *
     * @param fastuserDto 数据对象分享
     * @return 小区下的小区楼记录数
     */
    int queryFastuserCount(FastuserDto fastuserDto);
}
