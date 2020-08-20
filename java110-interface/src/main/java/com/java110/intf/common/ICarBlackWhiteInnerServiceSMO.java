package com.java110.intf.common;

import com.java110.dto.machine.CarBlackWhiteDto;

import java.util.List;

/**
 * @ClassName ICarBlackWhiteInnerServiceSMO
 * @Description 黑白名单接口类
 * @Author wuxw
 * @Date 2019/4/24 9:04
 * @Version 1.0
 * add by wuxw 2019/4/24
 **/

public interface ICarBlackWhiteInnerServiceSMO {

    /**
     * <p>查询小区楼信息</p>
     *
     * @param carBlackWhiteDto 数据对象分享
     * @return CarBlackWhiteDto 对象数据
     */
    List<CarBlackWhiteDto> queryCarBlackWhites(CarBlackWhiteDto carBlackWhiteDto);

    /**
     * 查询<p>小区楼</p>总记录数
     *
     * @param carBlackWhiteDto 数据对象分享
     * @return 小区下的小区楼记录数
     */
    int queryCarBlackWhitesCount(CarBlackWhiteDto carBlackWhiteDto);
}
