package com.java110.intf.common;

import com.java110.dto.machine.MachineRecordDto;

import java.util.List;

/**
 * @ClassName IMachineRecordInnerServiceSMO
 * @Description 设备上报接口类
 * @Author wuxw
 * @Date 2019/4/24 9:04
 * @Version 1.0
 * add by wuxw 2019/4/24
 **/

public interface IMachineRecordInnerServiceSMO {

    /**
     * <p>查询小区楼信息</p>
     *
     * @param machineRecordDto 数据对象分享
     * @return MachineRecordDto 对象数据
     */
    List<MachineRecordDto> queryMachineRecords(MachineRecordDto machineRecordDto);

    /**
     * 查询<p>小区楼</p>总记录数
     *
     * @param machineRecordDto 数据对象分享
     * @return 小区下的小区楼记录数
     */
    int queryMachineRecordsCount(MachineRecordDto machineRecordDto);
}
