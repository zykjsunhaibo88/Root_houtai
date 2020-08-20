package com.java110.intf.community;

import com.java110.dto.FloorDto;

import java.util.List;

/**
 * @ClassName IFloorInnerServiceSMO
 * @Description 小区楼接口类
 * @Author wuxw
 * @Date 2019/4/24 9:04
 * @Version 1.0
 * add by wuxw 2019/4/24
 **/

public interface IFloorInnerServiceSMO {

    /**
     * <p>查询小区楼信息</p>
     *
     * @param page        页数
     * @param row         行数
     * @param communityId 小区ID
     * @return FloorDto 对象数据
     */
    List<FloorDto> queryFloors(int page,
                               int row,
                               String communityId);

    /**
     * 查询<p>小区楼</p>总记录数
     *
     * @param communityId 小区ID
     * @return 小区下的小区楼记录数
     */
    int queryFloorsCount(String communityId);


    /**
     * <p>查询小区楼信息</p>
     *
     * @param floorDto 数据对象分享
     * @return UnitDto 对象数据
     */

    List<FloorDto> queryFloors(FloorDto floorDto);

    /**
     * 查询<p>小区楼</p>总记录数
     *
     * @param floorDto 数据对象分享
     * @return 小区下的小区楼记录数
     */
    int queryFloorsCount(FloorDto floorDto);
}
