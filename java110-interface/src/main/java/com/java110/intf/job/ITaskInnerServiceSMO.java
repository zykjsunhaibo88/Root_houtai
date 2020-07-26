package com.java110.intf.job;

import com.java110.dto.task.TaskDto;
import com.java110.dto.task.TaskTemplateDto;
import com.java110.dto.task.TaskTemplateSpecDto;

import java.util.List;

/**
 * @ClassName ITaskInnerServiceSMO
 * @Description 定时任务接口类
 * @Author wuxw
 * @Date 2019/4/24 9:04
 * @Version 1.0
 * add by wuxw 2019/4/24
 **/

public interface ITaskInnerServiceSMO {

    /**
     * <p>查询小区楼信息</p>
     *
     * @param taskDto 数据对象分享
     * @return TaskDto 对象数据
     */
    List<TaskDto> queryTasks(TaskDto taskDto);

    /**
     * 查询<p>小区楼</p>总记录数
     *
     * @param taskDto 数据对象分享
     * @return 小区下的小区楼记录数
     */
    int queryTasksCount(TaskDto taskDto);


    /**
     * <p>查询任务模板楼信息</p>
     *
     * @param taskTemplateDto 模板对象
     * @return TaskDto 对象数据
     */
    List<TaskTemplateDto> queryTaskTemplate(TaskTemplateDto taskTemplateDto);

    /**
     * 查询<p>任务模板</p>总记录数
     *
     * @param taskTemplateDto 模板对象
     * @return 小区下的小区楼记录数
     */
    int queryTaskTemplateCount(TaskTemplateDto taskTemplateDto);


    /**
     * 查询<p>任务模板</p>总记录数
     *
     * @param taskTemplateSpecDto 模板对象
     * @return 小区下的小区楼记录数
     */
    int queryTaskTemplateSpecCount(TaskTemplateSpecDto taskTemplateSpecDto);


    /**
     * 查询<p>任务模板</p>总记录数
     *
     * @param taskTemplateSpecDto 模板对象
     * @return 小区下的小区楼记录数
     */
    List<TaskTemplateSpecDto> queryTaskTemplateSpec(TaskTemplateSpecDto taskTemplateSpecDto);

    /**
     * 启动任务
     *
     * @param taskDto
     * @return
     */
    int startTask(TaskDto taskDto);

    /**
     * 停止任务
     *
     * @param taskDto
     * @return
     */
    int stopTask(TaskDto taskDto);
}
