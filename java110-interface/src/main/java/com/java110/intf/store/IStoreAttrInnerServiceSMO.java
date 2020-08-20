package com.java110.intf.store;

import com.java110.dto.store.StoreAttrDto;

import java.util.List;

/**
 * @ClassName IStoreAttrInnerServiceSMO
 * @Description 商户属性接口类
 * @Author wuxw
 * @Date 2019/4/24 9:04
 * @Version 1.0
 * add by wuxw 2019/4/24
 **/

public interface IStoreAttrInnerServiceSMO {

    /**
     * <p>查询小区楼信息</p>
     *
     * @param storeAttrDto 数据对象分享
     * @return StoreAttrDto 对象数据
     */
    List<StoreAttrDto> queryStoreAttrs(StoreAttrDto storeAttrDto);

    /**
     * 查询<p>小区楼</p>总记录数
     *
     * @param storeAttrDto 数据对象分享
     * @return 小区下的小区楼记录数
     */
    int queryStoreAttrsCount(StoreAttrDto storeAttrDto);
}
