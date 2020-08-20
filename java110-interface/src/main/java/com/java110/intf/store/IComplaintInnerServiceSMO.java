package com.java110.intf.store;

import com.java110.dto.complaint.ComplaintDto;

import java.util.List;

/**
 * @ClassName IComplaintInnerServiceSMO
 * @Description 投诉建议接口类
 * @Author wuxw
 * @Date 2019/4/24 9:04
 * @Version 1.0
 * add by wuxw 2019/4/24
 **/

public interface IComplaintInnerServiceSMO {

    /**
     * <p>查询小区楼信息</p>
     *
     * @param complaintDto 数据对象分享
     * @return ComplaintDto 对象数据
     */
    List<ComplaintDto> queryComplaints(ComplaintDto complaintDto);

    /**
     * 查询<p>小区楼</p>总记录数
     *
     * @param complaintDto 数据对象分享
     * @return 小区下的小区楼记录数
     */
    int queryComplaintsCount(ComplaintDto complaintDto);
}
