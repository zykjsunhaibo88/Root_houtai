package com.java110.intf.user;

import com.java110.dto.owner.OwnerAttrDto;

import java.util.List;

/**
 * @ClassName IOwnerAttrInnerServiceSMO
 * @Description 业主属性接口类
 * @Author wuxw
 * @Date 2019/4/24 9:04
 * @Version 1.0
 * add by wuxw 2019/4/24
 **/

public interface IOwnerAttrInnerServiceSMO {

    /**
     * <p>查询小区楼信息</p>
     *
     * @param ownerAttrDto 数据对象分享
     * @return OwnerAttrDto 对象数据
     */
    List<OwnerAttrDto> queryOwnerAttrs( OwnerAttrDto ownerAttrDto);

    /**
     * 查询<p>小区楼</p>总记录数
     *
     * @param ownerAttrDto 数据对象分享
     * @return 小区下的小区楼记录数
     */

    int queryOwnerAttrsCount(OwnerAttrDto ownerAttrDto);
}
