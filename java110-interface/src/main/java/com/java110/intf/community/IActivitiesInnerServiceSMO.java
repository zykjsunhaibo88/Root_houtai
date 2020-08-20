package com.java110.intf.community;

import com.java110.dto.activities.ActivitiesDto;

import java.util.List;

/**
 * @ClassName IActivitiesInnerServiceSMO
 * @Description 活动接口类
 * @Author wuxw
 * @Date 2019/4/24 9:04
 * @Version 1.0
 * add by wuxw 2019/4/24
 **/

public interface IActivitiesInnerServiceSMO {

    /**
     * <p>查询小区楼信息</p>
     *
     * @param activitiesDto 数据对象分享
     * @return ActivitiesDto 对象数据
     */
    List<ActivitiesDto> queryActivitiess(ActivitiesDto activitiesDto);

    /**
     * 查询<p>小区楼</p>总记录数
     *
     * @param activitiesDto 数据对象分享
     * @return 小区下的小区楼记录数
     */
    int queryActivitiessCount(ActivitiesDto activitiesDto);
}
