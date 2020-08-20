package com.java110.intf.common;

import com.java110.dto.workflow.WorkflowStepStaffDto;

import java.util.List;

/**
 * @ClassName IWorkflowStepStaffInnerServiceSMO
 * @Description 工作流节点接口类
 * @Author wuxw
 * @Date 2019/4/24 9:04
 * @Version 1.0
 * add by wuxw 2019/4/24
 **/

public interface IWorkflowStepStaffInnerServiceSMO {

    /**
     * <p>查询小区楼信息</p>
     *
     * @param workflowStepStaffDto 数据对象分享
     * @return WorkflowStepStaffDto 对象数据
     */
    List<WorkflowStepStaffDto> queryWorkflowStepStaffs(WorkflowStepStaffDto workflowStepStaffDto);

    /**
     * 查询<p>小区楼</p>总记录数
     *
     * @param workflowStepStaffDto 数据对象分享
     * @return 小区下的小区楼记录数
     */
    int queryWorkflowStepStaffsCount(WorkflowStepStaffDto workflowStepStaffDto);
}
