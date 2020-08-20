package com.java110.intf.common;

import com.java110.dto.machine.CarInoutDetailDto;

import java.util.List;

/**
 * @ClassName ICarInoutDetailInnerServiceSMO
 * @Description 进出场详情接口类
 * @Author wuxw
 * @Date 2019/4/24 9:04
 * @Version 1.0
 * add by wuxw 2019/4/24
 **/

public interface ICarInoutDetailInnerServiceSMO {

    /**
     * <p>查询小区楼信息</p>
     *
     * @param carInoutDetailDto 数据对象分享
     * @return CarInoutDetailDto 对象数据
     */
    List<CarInoutDetailDto> queryCarInoutDetails(CarInoutDetailDto carInoutDetailDto);

    /**
     * 查询<p>小区楼</p>总记录数
     *
     * @param carInoutDetailDto 数据对象分享
     * @return 小区下的小区楼记录数
     */
    int queryCarInoutDetailsCount(CarInoutDetailDto carInoutDetailDto);
}
