package com.java110.intf.community;

import com.java110.dto.service.ServiceBusinessDto;

import java.util.List;

/**
 * @ClassName IServiceBusinessInnerServiceSMO
 * @Description 服务实现接口类
 * @Author wuxw
 * @Date 2019/4/24 9:04
 * @Version 1.0
 * add by wuxw 2019/4/24
 **/

public interface IServiceBusinessInnerServiceSMO {

    /**
     * <p>查询小区楼信息</p>
     *
     * @param serviceBusinessDto 数据对象分享
     * @return ServiceBusinessDto 对象数据
     */
    List<ServiceBusinessDto> queryServiceBusinesss(ServiceBusinessDto serviceBusinessDto);

    /**
     * 查询<p>小区楼</p>总记录数
     *
     * @param serviceBusinessDto 数据对象分享
     * @return 小区下的小区楼记录数
     */
    int queryServiceBusinesssCount(ServiceBusinessDto serviceBusinessDto);

    /**
     * 保存服务实现
     *
     * @param serviceBusinessDto 数据对象分享
     * @return 小区下的小区楼记录数
     */
    int saveServiceBusiness(ServiceBusinessDto serviceBusinessDto);

    /**
     * 修改服务实现
     *
     * @param serviceBusinessDto 数据对象分享
     * @return 小区下的小区楼记录数
     */
    int updateServiceBusiness(ServiceBusinessDto serviceBusinessDto);

    /**
     * 删除服务实现
     *
     * @param serviceBusinessDto 数据对象分享
     * @return 小区下的小区楼记录数
     */
    int deleteServiceBusiness(ServiceBusinessDto serviceBusinessDto);
}
