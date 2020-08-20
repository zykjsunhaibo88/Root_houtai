package com.java110.intf.user;

import com.java110.dto.owner.OwnerDto;

import java.util.List;

/**
 * @ClassName IOwnerInnerServiceSMO
 * @Description 业主接口类
 * @Author wuxw
 * @Date 2019/4/24 9:04
 * @Version 1.0
 * add by wuxw 2019/4/24
 **/

public interface IOwnerInnerServiceSMO {

    /**
     * <p>查询小区楼信息</p>
     *
     * @param ownerDto 数据对象分享
     * @return OwnerDto 对象数据
     */
    List<OwnerDto> queryOwners(OwnerDto ownerDto);

    /**
     * <p>查询业主成员</p>
     *
     * @param ownerDto 数据对象分享
     * @return OwnerDto 对象数据
     */
    List<OwnerDto> queryOwnerMembers(OwnerDto ownerDto);

    /**
     * 查询<p>小区楼</p>总记录数
     *
     * @param ownerDto 数据对象分享
     * @return 小区下的小区楼记录数
     */
    int queryOwnersCount(OwnerDto ownerDto);

    /**
     * 查询<p>小区楼</p>总记录数 根据条件查询
     *
     * @param ownerDto 数据对象分享
     * @return 小区下的小区楼记录数
     */
    int queryOwnerCountByCondition(OwnerDto ownerDto);


    /**
     * <p>查询小区楼信息</p> 根据条件查询
     *
     * @param ownerDto 数据对象分享 根据条件查询
     * @return OwnerDto 对象数据
     */
    List<OwnerDto> queryOwnersByCondition(OwnerDto ownerDto);


    /**
     * 查询<p>小区楼</p>总记录数
     *
     * @param ownerDto 数据对象分享
     * @return 小区下的小区楼记录数
     */
    int queryNoEnterRoomOwnerCount(OwnerDto ownerDto);

    /**
     * 根据房屋查询业主信息
     *
     * @param ownerDto 数据对象分享
     * @return 小区下的小区楼记录数
     */
    List<OwnerDto> queryOwnersByRoom(OwnerDto ownerDto);


    /**
     * 根据停车位查询业主信息
     *
     * @param ownerDto 数据对象分享
     * @return 小区下的小区楼记录数
     */
    List<OwnerDto> queryOwnersByParkingSpace(OwnerDto ownerDto);

}
