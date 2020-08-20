package com.java110.intf.common;

import com.java110.dto.machine.MachineAttrDto;

import java.util.List;

/**
 * @ClassName IMachineAttrInnerServiceSMO
 * @Description 设备属性接口类
 * @Author wuxw
 * @Date 2019/4/24 9:04
 * @Version 1.0
 * add by wuxw 2019/4/24
 **/

public interface IMachineAttrInnerServiceSMO {

    /**
     * <p>查询小区楼信息</p>
     *
     * @param machineAttrDto 数据对象分享
     * @return MachineAttrDto 对象数据
     */
    List<MachineAttrDto> queryMachineAttrs(MachineAttrDto machineAttrDto);

    /**
     * 查询<p>小区楼</p>总记录数
     *
     * @param machineAttrDto 数据对象分享
     * @return 小区下的小区楼记录数
     */
    int queryMachineAttrsCount(MachineAttrDto machineAttrDto);
}
