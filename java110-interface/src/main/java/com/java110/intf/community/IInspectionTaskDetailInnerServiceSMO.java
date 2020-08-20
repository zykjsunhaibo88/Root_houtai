package com.java110.intf.community;

import com.java110.dto.inspectionTaskDetail.InspectionTaskDetailDto;

import java.util.List;

/**
 * @ClassName IInspectionTaskDetailInnerServiceSMO
 * @Description 巡检任务明细接口类
 * @Author wuxw
 * @Date 2019/4/24 9:04
 * @Version 1.0
 * add by wuxw 2019/4/24
 **/

public interface IInspectionTaskDetailInnerServiceSMO {

    /**
     * <p>查询小区楼信息</p>
     *
     * @param inspectionTaskDetailDto 数据对象分享
     * @return InspectionTaskDetailDto 对象数据
     */
    List<InspectionTaskDetailDto> queryInspectionTaskDetails(InspectionTaskDetailDto inspectionTaskDetailDto);

    /**
     * 查询<p>小区楼</p>总记录数
     *
     * @param inspectionTaskDetailDto 数据对象分享
     * @return 小区下的小区楼记录数
     */
    int queryInspectionTaskDetailsCount(InspectionTaskDetailDto inspectionTaskDetailDto);
}
