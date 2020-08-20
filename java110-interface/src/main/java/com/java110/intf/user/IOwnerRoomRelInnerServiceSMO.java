package com.java110.intf.user;

import com.java110.dto.owner.OwnerRoomRelDto;

import java.util.List;

/**
 * @ClassName IOwnerRoomRelInnerServiceSMO
 * @Description 业主房屋接口类
 * @Author wuxw
 * @Date 2019/4/24 9:04
 * @Version 1.0
 * add by wuxw 2019/4/24
 **/

public interface IOwnerRoomRelInnerServiceSMO {

    /**
     * <p>查询小区楼信息</p>
     *
     * @param ownerRoomRelDto 数据对象分享
     * @return OwnerRoomRelDto 对象数据
     */
    List<OwnerRoomRelDto> queryOwnerRoomRels(OwnerRoomRelDto ownerRoomRelDto);

    /**
     * 查询<p>小区楼</p>总记录数
     *
     * @param ownerRoomRelDto 数据对象分享
     * @return 小区下的小区楼记录数
     */
    int queryOwnerRoomRelsCount(OwnerRoomRelDto ownerRoomRelDto);
}
