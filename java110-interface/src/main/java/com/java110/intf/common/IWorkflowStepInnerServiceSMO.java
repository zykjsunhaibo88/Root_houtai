package com.java110.intf.common;

import com.java110.dto.workflow.WorkflowStepDto;

import java.util.List;

/**
 * @ClassName IWorkflowStepInnerServiceSMO
 * @Description 工作流节点接口类
 * @Author wuxw
 * @Date 2019/4/24 9:04
 * @Version 1.0
 * add by wuxw 2019/4/24
 **/

public interface IWorkflowStepInnerServiceSMO {

    /**
     * <p>查询小区楼信息</p>
     *
     * @param workflowStepDto 数据对象分享
     * @return WorkflowStepDto 对象数据
     */
    List<WorkflowStepDto> queryWorkflowSteps(WorkflowStepDto workflowStepDto);

    /**
     * 查询<p>小区楼</p>总记录数
     *
     * @param workflowStepDto 数据对象分享
     * @return 小区下的小区楼记录数
     */
    int queryWorkflowStepsCount(WorkflowStepDto workflowStepDto);
}
