package com.java110.intf.community;

import com.java110.dto.parking.ParkingAreaDto;

import java.util.List;

/**
 * @ClassName IParkingAreaInnerServiceSMO
 * @Description 停车场接口类
 * @Author wuxw
 * @Date 2019/4/24 9:04
 * @Version 1.0
 * add by wuxw 2019/4/24
 **/

public interface IParkingAreaInnerServiceSMO {

    /**
     * <p>查询小区楼信息</p>
     *
     * @param parkingAreaDto 数据对象分享
     * @return ParkingAreaDto 对象数据
     */
    List<ParkingAreaDto> queryParkingAreas(ParkingAreaDto parkingAreaDto);

    /**
     * 查询<p>小区楼</p>总记录数
     *
     * @param parkingAreaDto 数据对象分享
     * @return 小区下的小区楼记录数
     */
    int queryParkingAreasCount(ParkingAreaDto parkingAreaDto);
}
