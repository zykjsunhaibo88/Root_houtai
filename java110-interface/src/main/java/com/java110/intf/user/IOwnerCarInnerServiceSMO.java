package com.java110.intf.user;

import com.java110.config.feign.FeignConfiguration;
import com.java110.dto.owner.OwnerCarDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @ClassName IOwnerCarInnerServiceSMO
 * @Description 车辆管理接口类
 * @Author wuxw
 * @Date 2019/4/24 9:04
 * @Version 1.0
 * add by wuxw 2019/4/24
 **/

public interface IOwnerCarInnerServiceSMO {

    /**
     * <p>查询小区楼信息</p>
     *
     *
     * @param ownerCarDto 数据对象分享
     * @return OwnerCarDto 对象数据
     */
    List<OwnerCarDto> queryOwnerCars( OwnerCarDto ownerCarDto);

    /**
     * 查询<p>小区楼</p>总记录数
     *
     * @param ownerCarDto 数据对象分享
     * @return 小区下的小区楼记录数
     */
    int queryOwnerCarsCount( OwnerCarDto ownerCarDto);
}
