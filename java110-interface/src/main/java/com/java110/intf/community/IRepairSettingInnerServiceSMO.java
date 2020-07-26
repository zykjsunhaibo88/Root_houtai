package com.java110.intf.community;

import com.java110.dto.repair.RepairSettingDto;

import java.util.List;

/**
 * @ClassName IRepairSettingInnerServiceSMO
 * @Description 报修设置接口类
 * @Author wuxw
 * @Date 2019/4/24 9:04
 * @Version 1.0
 * add by wuxw 2019/4/24
 **/

public interface IRepairSettingInnerServiceSMO {

    /**
     * <p>查询小区楼信息</p>
     *
     * @param repairSettingDto 数据对象分享
     * @return RepairSettingDto 对象数据
     */
    List<RepairSettingDto> queryRepairSettings(RepairSettingDto repairSettingDto);

    /**
     * 查询<p>小区楼</p>总记录数
     *
     * @param repairSettingDto 数据对象分享
     * @return 小区下的小区楼记录数
     */
    int queryRepairSettingsCount(RepairSettingDto repairSettingDto);
}
