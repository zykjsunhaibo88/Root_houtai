package com.java110.intf.community;

import com.java110.dto.service.ServiceDto;
import com.java110.dto.service.ServiceProvideDto;

import java.util.List;

/**
 * @ClassName IServiceInnerServiceSMO
 * @Description 服务接口类
 * @Author wuxw
 * @Date 2019/4/24 9:04
 * @Version 1.0
 * add by wuxw 2019/4/24
 **/

public interface IServiceInnerServiceSMO {

    /**
     * <p>查询小区楼信息</p>
     *
     * @param serviceDto 数据对象分享
     * @return ServiceDto 对象数据
     */
    List<ServiceDto> queryServices(ServiceDto serviceDto);

    /**
     * 查询<p>小区楼</p>总记录数
     *
     * @param serviceDto 数据对象分享
     * @return 小区下的小区楼记录数
     */
    int queryServicesCount(ServiceDto serviceDto);


    /**
     * <p>修改APP信息</p>
     *
     * @param serviceDto 数据对象分享
     * @return ServiceDto 对象数据
     */
    int updateService(ServiceDto serviceDto);


    /**
     * <p>添加APP信息</p>
     *
     * @param serviceDto 数据对象分享
     * @return ServiceDto 对象数据
     */
    int saveService(ServiceDto serviceDto);

    /**
     * <p>删除APP信息</p>
     *
     * @param serviceDto 数据对象分享
     * @return ServiceDto 对象数据
     */
    int deleteService(ServiceDto serviceDto);


    /**
     * <p>查询小区楼信息</p>
     *
     * @param serviceDto 数据对象分享
     * @return ServiceDto 对象数据
     */
    List<ServiceProvideDto> queryServiceProvides(ServiceProvideDto serviceDto);

    /**
     * 查询<p>小区楼</p>总记录数
     *
     * @param serviceDto 数据对象分享
     * @return 小区下的小区楼记录数
     */
    int queryServiceProvidesCount(ServiceProvideDto serviceDto);


    /**
     * <p>修改APP信息</p>
     *
     * @param serviceDto 数据对象分享
     * @return ServiceProvideDto 对象数据
     */
    int updateServiceProvide(ServiceProvideDto serviceDto);


    /**
     * <p>添加APP信息</p>
     *
     * @param serviceDto 数据对象分享
     * @return ServiceProvideDto 对象数据
     */
    int saveServiceProvide(ServiceProvideDto serviceDto);

    /**
     * <p>删除APP信息</p>
     *
     * @param serviceDto 数据对象分享
     * @return ServiceProvideDto 对象数据
     */
    int deleteServiceProvide(ServiceProvideDto serviceDto);


}
