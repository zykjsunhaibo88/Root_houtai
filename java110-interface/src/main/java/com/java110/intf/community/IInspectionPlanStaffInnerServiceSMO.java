package com.java110.intf.community;

import com.java110.dto.inspectionPlanStaff.InspectionPlanStaffDto;

import java.util.List;

/**
 * @ClassName IInspectionPlanStaffInnerServiceSMO
 * @Description 执行计划人接口类
 * @Author wuxw
 * @Date 2019/4/24 9:04
 * @Version 1.0
 * add by wuxw 2019/4/24
 **/

public interface IInspectionPlanStaffInnerServiceSMO {

    /**
     * <p>查询小区楼信息</p>
     *
     * @param inspectionPlanStaffDto 数据对象分享
     * @return InspectionPlanStaffDto 对象数据
     */
    List<InspectionPlanStaffDto> queryInspectionPlanStaffs(InspectionPlanStaffDto inspectionPlanStaffDto);

    /**
     * 查询<p>小区楼</p>总记录数
     *
     * @param inspectionPlanStaffDto 数据对象分享
     * @return 小区下的小区楼记录数
     */
    int queryInspectionPlanStaffsCount(InspectionPlanStaffDto inspectionPlanStaffDto);
}
