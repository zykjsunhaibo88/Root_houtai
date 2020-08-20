package com.java110.intf.community;

import com.alibaba.fastjson.JSONObject;
import com.java110.dto.inspectionTask.InspectionTaskDto;
import com.java110.po.inspection.InspectionTaskDetailPo;
import com.java110.po.inspection.InspectionTaskPo;

import java.util.List;

/**
 * @ClassName IInspectionTaskInnerServiceSMO
 * @Description 活动接口类
 * @Author wuxw
 * @Date 2019/4/24 9:04
 * @Version 1.0
 * add by wuxw 2019/4/24
 **/

public interface IInspectionTaskInnerServiceSMO {

    /**
     * <p>查询小区楼信息</p>
     *
     * @param inspectionTaskDto 数据对象分享
     * @return InspectionTaskDto 对象数据
     */
    List<InspectionTaskDto> queryInspectionTasks(InspectionTaskDto inspectionTaskDto);

    /**
     * 查询<p>小区楼</p>总记录数
     *
     * @param inspectionTaskDto 数据对象分享
     * @return 小区下的小区楼记录数
     */
    int queryInspectionTasksCount(InspectionTaskDto inspectionTaskDto);

    /**
     * 生成巡检任务
     *
     * @param param
     * @return
     */
    JSONObject generateInspectionTask(JSONObject param);

    int saveInspectionTask(List<InspectionTaskPo> inspectionTaskPos);

    int saveInspectionTaskDetail(List<InspectionTaskDetailPo> inspectionTaskDetailPos);
}
