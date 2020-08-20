package com.java110.intf.common;

import com.java110.dto.area.AreaDto;

import java.util.List;

/**
 * 查询地区信息
 */

public interface IAreaInnerServiceSMO {

    /**
     * <p>查询地区</p>
     *
     * @return AreaDto 对象数据
     */
    public List<AreaDto> getArea(AreaDto areaDto);

    public List<AreaDto> getProvCityArea(AreaDto areaDto);


}
