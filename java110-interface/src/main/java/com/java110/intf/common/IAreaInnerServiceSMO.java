package com.java110.intf.common;

import com.java110.config.feign.FeignConfiguration;
import com.java110.dto.area.AreaDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
    public List<AreaDto> getArea( AreaDto areaDto);

    public List<AreaDto> getProvCityArea( AreaDto areaDto);


}
