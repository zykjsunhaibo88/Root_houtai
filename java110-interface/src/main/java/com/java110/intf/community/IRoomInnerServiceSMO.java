package com.java110.intf.community;

import com.java110.dto.RoomDto;

import java.util.List;

/**
 * @ClassName IRoomInnerServiceSMO
 * @Description 小区房屋接口类
 * @Author wuxw
 * @Date 2019/4/24 9:04
 * @Version 1.0
 * add by wuxw 2019/4/24
 **/

public interface IRoomInnerServiceSMO {

    /**
     * <p>查询小区楼信息</p>
     *
     * @param roomDto 数据对象分享
     * @return RoomDto 对象数据
     */
    List<RoomDto> queryRooms(RoomDto roomDto);

    /**
     * 查询<p>小区楼</p>总记录数
     *
     * @param roomDto 数据对象分享
     * @return 小区下的小区楼记录数
     */
    int queryRoomsCount(RoomDto roomDto);

    /**
     * 查询<p>小区楼</p>总记录数
     *
     * @param roomDto 数据对象分享
     * @return 小区下的小区楼记录数
     */
    int queryRoomsWithOutSellCount(RoomDto roomDto);

    /**
     * 查询<p>小区楼</p>总记录数
     *
     * @param roomDto 数据对象分享
     * @return 小区下的小区楼记录数
     */
    int queryRoomsWithSellCount(RoomDto roomDto);

    /**
     * <p>查询小区楼信息</p>
     *
     * @param roomDto 数据对象分享
     * @return RoomDto 对象数据
     */
    List<RoomDto> queryRoomsWithOutSell(RoomDto roomDto);

    /**
     * <p>查询小区楼信息</p>
     *
     * @param roomDto 数据对象分享
     * @return RoomDto 对象数据
     */
    List<RoomDto> queryRoomsWithSell(RoomDto roomDto);


    /**
     * <p>根据业主查询房屋信息</p>
     *
     * @param roomDto 数据对象分享
     * @return RoomDto 对象数据
     */
    List<RoomDto> queryRoomsByOwner(RoomDto roomDto);
}
