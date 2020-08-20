package com.java110.intf.community;

import com.java110.dto.inspectionPoint.InspectionDto;

import java.util.List;

/**
 * @ClassName IInspectionInnerServiceSMO
 * @Description 巡检点接口类
 * @Author wuxw
 * @Date 2019/4/24 9:04
 * @Version 1.0
 * add by wuxw 2019/4/24
 **/

public interface IInspectionInnerServiceSMO {

    /**
     * <p>查询小区楼信息</p>
     *
     * @param inspectionDto 数据对象分享
     * @return InspectionDto 对象数据
     */
    List<InspectionDto> queryInspections(InspectionDto inspectionDto);

    /**
     * 查询<p>小区楼</p>总记录数
     *
     * @param inspectionDto 数据对象分享
     * @return 小区下的小区楼记录数
     */
    int queryInspectionsCount(InspectionDto inspectionDto);

    public List<InspectionDto> getInspectionRelationShip(InspectionDto inspectionDto);

    public int queryInspectionsRelationShipCount(InspectionDto inspectionDto);

    List<InspectionDto> queryInspectionsByPlan(InspectionDto inspectionDto);
}
