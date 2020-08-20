package com.java110.intf.common;

import com.java110.dto.machine.MachineDto;

import java.util.List;

/**
 * @ClassName IMachineInnerServiceSMO
 * @Description 设备接口类
 * @Author wuxw
 * @Date 2019/4/24 9:04
 * @Version 1.0
 * add by wuxw 2019/4/24
 **/

public interface IMachineInnerServiceSMO {

    /**
     * <p>查询小区楼信息</p>
     *
     * @param machineDto 数据对象分享
     * @return MachineDto 对象数据
     */
    List<MachineDto> queryMachines(MachineDto machineDto);

    /**
     * 查询<p>小区楼</p>总记录数
     *
     * @param machineDto 数据对象分享
     * @return 小区下的小区楼记录数
     */
    int queryMachinesCount(MachineDto machineDto);
}
