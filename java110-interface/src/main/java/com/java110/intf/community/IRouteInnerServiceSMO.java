package com.java110.intf.community;

import com.java110.dto.service.RouteDto;

import java.util.List;

/**
 * @ClassName IRouteInnerServiceSMO
 * @Description 路由接口类
 * @Author wuxw
 * @Date 2019/4/24 9:04
 * @Version 1.0
 * add by wuxw 2019/4/24
 **/

public interface IRouteInnerServiceSMO {

    /**
     * <p>查询小区楼信息</p>
     *
     * @param routeDto 数据对象分享
     * @return RouteDto 对象数据
     */
    List<RouteDto> queryRoutes(RouteDto routeDto);

    /**
     * 查询<p>小区楼</p>总记录数
     *
     * @param routeDto 数据对象分享
     * @return 小区下的小区楼记录数
     */
    int queryRoutesCount(RouteDto routeDto);

    /**
     * <p>修改APP信息</p>
     *
     * @param routeDto 数据对象分享
     * @return ServiceDto 对象数据
     */
    int updateRoute(RouteDto routeDto);


    /**
     * <p>添加APP信息</p>
     *
     * @param routeDto 数据对象分享
     * @return RouteDto 对象数据
     */
    int saveRoute(RouteDto routeDto);

    /**
     * <p>删除APP信息</p>
     *
     * @param routeDto 数据对象分享
     * @return RouteDto 对象数据
     */
    int deleteRoute(RouteDto routeDto);
}
