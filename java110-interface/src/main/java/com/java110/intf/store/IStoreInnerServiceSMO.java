package com.java110.intf.store;

import com.java110.dto.store.StoreAttrDto;
import com.java110.dto.store.StoreDto;

import java.util.List;

/**
 * 商户 服务内部交互接口类
 * add by wuxw 2019-09-19
 */

public interface IStoreInnerServiceSMO {

    public List<StoreDto> getStores(StoreDto storeDto);

    public List<StoreAttrDto> getStoreAttrs(StoreAttrDto storeAttrDto);

    public int getStoreCount(StoreDto storeDto);
}
