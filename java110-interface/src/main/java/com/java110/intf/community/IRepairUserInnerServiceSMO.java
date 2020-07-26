package com.java110.intf.community;

import com.java110.dto.repair.RepairUserDto;

import java.util.List;

/**
 * @ClassName IRepairUserInnerServiceSMO
 * @Description 报修派单接口类
 * @Author wuxw
 * @Date 2019/4/24 9:04
 * @Version 1.0
 * add by wuxw 2019/4/24
 **/

public interface IRepairUserInnerServiceSMO {

    /**
     * <p>查询小区楼信息</p>
     *
     * @param repairUserDto 数据对象分享
     * @return RepairUserDto 对象数据
     */
    List<RepairUserDto> queryRepairUsers(RepairUserDto repairUserDto);

    /**
     * 查询<p>小区楼</p>总记录数
     *
     * @param repairUserDto 数据对象分享
     * @return 小区下的小区楼记录数
     */
    int queryRepairUsersCount(RepairUserDto repairUserDto);
}
