
package com.java110.intf.community;

import com.java110.dto.RoomAttrDto;

import java.util.List;

/**
 * @ClassName IRoomAttrInnerServiceSMO
 * @Description 小区房屋属性接口类
 * @Author wuxw
 * @Date 2019/4/24 9:04
 * @Version 1.0
 * add by wuxw 2019/4/24
 **/

public interface IRoomAttrInnerServiceSMO {

    /**
     * <p>查询小区楼信息</p>
     *
     * @param roomAttrDto 数据对象分享
     * @return RoomAttrDto 对象数据
     */
    List<RoomAttrDto> queryRoomAttrs(RoomAttrDto roomAttrDto);

    /**
     * 查询<p>小区楼</p>总记录数
     *
     * @param roomAttrDto 数据对象分享
     * @return 小区下的小区楼记录数
     */
    int queryRoomAttrsCount(RoomAttrDto roomAttrDto);
}
