package com.java110.intf.common;

import com.java110.dto.auditMessage.AuditMessageDto;
import com.java110.dto.purchaseApply.PurchaseApplyDto;
import com.java110.entity.audit.AuditUser;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


public interface IPurchaseApplyUserInnerServiceSMO {

    /**
     * 启动流程
     *
     * @return
     */
    public PurchaseApplyDto startProcess(PurchaseApplyDto purchaseApplyDto);

    /**
     * 查询用户任务数
     *
     * @param user
     * @return
     */
    public long getUserTaskCount(AuditUser user);

    /**
     * 获取用户任务
     *
     * @param user 用户信息
     */
    public List<PurchaseApplyDto> getUserTasks(AuditUser user);

    /**
     * 查询用户处理任务数
     *
     * @param user
     * @return
     */
    public long getUserHistoryTaskCount(AuditUser user);

    /**
     * 获取用户处理审批的任务
     *
     * @param user 用户信息
     */
    public List<PurchaseApplyDto> getUserHistoryTasks(AuditUser user);


    /**
     * 处理任务
     *
     * @return true 为流程结束 false 为流程没有结束
     */
    @RequestMapping(value = "/completeTask", method = RequestMethod.POST)
    public boolean completeTask(@RequestBody PurchaseApplyDto purchaseApplyDto);

    /**
     * 查询批注信息
     *
     * @return
     */
    @RequestMapping(value = "/getAuditMessage", method = RequestMethod.POST)
    public List<AuditMessageDto> getAuditMessage(@RequestBody PurchaseApplyDto purchaseApplyDto);

    /**
     * 获取任务当前处理人
     *
     * @param purchaseApplyDto
     * @return
     */
    @RequestMapping(value = "/getTaskCurrentUser", method = RequestMethod.POST)
    public PurchaseApplyDto getTaskCurrentUser(@RequestBody PurchaseApplyDto purchaseApplyDto);

}
