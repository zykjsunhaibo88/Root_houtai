package com.java110.intf.order;

import com.java110.dto.order.BusinessDto;
import com.java110.dto.order.OrderDto;

import java.util.List;

/**
 * @ClassName IOrderInnerServiceSMO
 * @Description 组织接口类
 * @Author wuxw
 * @Date 2019/4/24 9:04
 * @Version 1.0
 * add by wuxw 2019/4/24
 **/

public interface IOrderInnerServiceSMO {

    /**
     * <p>查询小区楼信息</p>
     *
     * @param orderDto 数据对象分享
     * @return OrderDto 对象数据
     */
    List<OrderDto> queryOrders(OrderDto orderDto);

    /**
     * 查询<p>小区楼</p>总记录数
     *
     * @param orderDto 数据对象分享
     * @return 小区下的小区楼记录数
     */
    int queryOrdersCount(OrderDto orderDto);


    /**
     * <p>查询上级组织信息</p>
     *
     * @param orderDto 数据对象分享
     * @return OrderDto 对象数据
     */
    List<OrderDto> queryOwenrOrders(OrderDto orderDto);

    public List<OrderDto> queryOrderByBusinessType(OrderDto orderDto);

    int updateBusinessStatusCd(OrderDto orderDto);


    /**
     * <p>查询上级组织信息</p>
     *
     * @param orderDto 数据对象分享
     * @return OrderDto 对象数据
     */
    List<OrderDto> queryMachineOrders(OrderDto orderDto);

    /**
     * <p>查询上级组织信息</p>
     *
     * @param orderDto 数据对象分享
     * @return OrderDto 对象数据
     */
    List<OrderDto> queryApplicationKeyOrders(OrderDto orderDto);

    /**
     * 查询 同订单 订单项
     *
     * @param businessDto
     * @return
     */
    List<BusinessDto> querySameOrderBusiness(BusinessDto businessDto);
}
