package com.java110.intf.common;

import com.java110.dto.auditMessage.AuditMessageDto;
import com.java110.dto.complaint.ComplaintDto;
import com.java110.entity.audit.AuditUser;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


public interface IComplaintUserInnerServiceSMO {

    /**
     * 启动流程
     *
     * @return
     */
    public ComplaintDto startProcess(ComplaintDto complaintDto);

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
    public List<ComplaintDto> getUserTasks( AuditUser user);

    /**
     * 查询用户处理任务数
     *
     * @param user
     * @return
     */
    public long getUserHistoryTaskCount( AuditUser user);

    /**
     * 获取用户处理审批的任务
     *
     * @param user 用户信息
     */
    public List<ComplaintDto> getUserHistoryTasks( AuditUser user);


    /**
     * 处理任务
     *
     * @param complaintDto
     * @return true 为流程结束 false 为流程没有结束
     */
    public boolean completeTask( ComplaintDto complaintDto);

    /**
     * 查询批注信息
     *
     * @param complaintDto
     * @return
     */
    public List<AuditMessageDto> getAuditMessage( ComplaintDto complaintDto);

    /**
     * 获取任务当前处理人
     *
     * @param complaintDto
     * @return
     */
    public ComplaintDto getTaskCurrentUser( ComplaintDto complaintDto);

}
