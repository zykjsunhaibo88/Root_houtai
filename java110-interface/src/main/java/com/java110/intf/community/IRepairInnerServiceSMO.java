package com.java110.intf.community;

import com.java110.dto.repair.RepairDto;

import java.util.List;

/**
 * @ClassName IRepairInnerServiceSMO
 * @Description 报修信息接口类
 * @Author wuxw
 * @Date 2019/4/24 9:04
 * @Version 1.0
 * add by wuxw 2019/4/24
 **/

public interface IRepairInnerServiceSMO {

    /**
     * <p>查询小区楼信息</p>
     *
     * @param repairDto 数据对象分享
     * @return RepairDto 对象数据
     */
    List<RepairDto> queryRepairs(RepairDto repairDto);

    /**
     * 查询<p>小区楼</p>总记录数
     *
     * @param repairDto 数据对象分享
     * @return 小区下的小区楼记录数
     */
    int queryRepairsCount(RepairDto repairDto);


    /**
     * <p>查询小区楼信息</p>
     *
     * @param repairDto 数据对象分享
     * @return RepairDto 对象数据
     */
    List<RepairDto> queryStaffRepairs(RepairDto repairDto);

    /**
     * 查询<p>小区楼</p>总记录数
     *
     * @param repairDto 数据对象分享
     * @return 小区下的小区楼记录数
     */
    int queryStaffRepairsCount(RepairDto repairDto);


    /**
     * <p>查询小区楼信息</p>
     *
     * @param repairDto 数据对象分享
     * @return RepairDto 对象数据
     */
    List<RepairDto> queryStaffFinishRepairs(RepairDto repairDto);

    /**
     * 查询<p>小区楼</p>总记录数
     *
     * @param repairDto 数据对象分享
     * @return 小区下的小区楼记录数
     */
    int queryStaffFinishRepairsCount(RepairDto repairDto);
}
