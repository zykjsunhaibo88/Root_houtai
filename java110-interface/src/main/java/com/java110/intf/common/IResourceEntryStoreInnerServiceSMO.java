package com.java110.intf.common;

import com.java110.config.feign.FeignConfiguration;
import com.java110.dto.purchaseApply.PurchaseApplyDto;
import com.java110.dto.resourceStore.ResourceOrderDto;
import com.java110.entity.audit.AuditUser;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


public interface IResourceEntryStoreInnerServiceSMO {


    /**
     * <p>启动流程</p>
     *
     *
     * @return CommunityDto 对象数据
     */
    public ResourceOrderDto startProcess( ResourceOrderDto resourceOrderDto);


    /**
     * 查询用户任务数
     * @param user
     * @return
     */
    public long getUserTaskCount( AuditUser user);

    /**
     *  获取用户任务
     * @param user 用户信息
     */
    public List<PurchaseApplyDto> getUserTasks( AuditUser user);

    /**
     * 同意
     * @param resourceOrderDto
     * @return
     */
    public boolean agreeCompleteTask( ResourceOrderDto resourceOrderDto);


    /**
     * 反驳
     * @param resourceOrderDto
     * @return
     */
    public boolean refuteCompleteTask( ResourceOrderDto resourceOrderDto);

    /**
     * 完成任务
     * @param resourceOrderDto
     */
    public boolean complete( ResourceOrderDto resourceOrderDto);

    /**
     * 查询用户任务数
     *
     * @param user
     * @return
     */
    public long getUserHistoryTaskCount( AuditUser user);

    /**
     * 获取用户审批的任务
     *
     * @param user 用户信息
     */
    public List<PurchaseApplyDto> getUserHistoryTasks( AuditUser user);
}
