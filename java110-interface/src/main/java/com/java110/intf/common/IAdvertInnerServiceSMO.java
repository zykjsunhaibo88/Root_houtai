package com.java110.intf.common;

import com.java110.dto.advert.AdvertDto;

import java.util.List;

/**
 * @ClassName IAdvertInnerServiceSMO
 * @Description 广告信息接口类
 * @Author wuxw
 * @Date 2019/4/24 9:04
 * @Version 1.0
 * add by wuxw 2019/4/24
 **/

public interface IAdvertInnerServiceSMO {

    /**
     * <p>查询小区楼信息</p>
     *
     * @param advertDto 数据对象分享
     * @return AdvertDto 对象数据
     */
    List<AdvertDto> queryAdverts(AdvertDto advertDto);

    /**
     * 查询<p>小区楼</p>总记录数
     *
     * @param advertDto 数据对象分享
     * @return 小区下的小区楼记录数
     */

    int queryAdvertsCount(AdvertDto advertDto);
}
