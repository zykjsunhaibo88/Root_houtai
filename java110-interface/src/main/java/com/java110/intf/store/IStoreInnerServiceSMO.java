package com.java110.intf.store;

import com.java110.config.feign.FeignConfiguration;
import com.java110.dto.store.StoreAttrDto;
import com.java110.dto.store.StoreDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * 商户 服务内部交互接口类
 * add by wuxw 2019-09-19
 */

public interface IStoreInnerServiceSMO {

    public List<StoreDto> getStores( StoreDto storeDto);

    public List<StoreAttrDto> getStoreAttrs( StoreAttrDto storeAttrDto);

    public int getStoreCount( StoreDto storeDto);
}
