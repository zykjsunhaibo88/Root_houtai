package com.java110.intf.store;

import com.java110.dto.businesstype.CbusinesstypeDto;

import java.util.List;

/**
 * @ClassName ICbusinesstypeInnerServiceSMO
 * @Description cbusinesstype接口类
 * @Author wuxw
 * @Date 2019/4/24 9:04
 * @Version 1.0
 * add by wuxw 2019/4/24
 **/

public interface ICbusinesstypeInnerServiceSMO {

    /**
     * <p>查询小区楼信息</p>
     *
     * @param cbusinesstypeDto 数据对象分享
     * @return CbusinesstypeDto 对象数据
     */
    List<CbusinesstypeDto> queryCbusinesstypes(CbusinesstypeDto cbusinesstypeDto);

    /**
     * 查询<p>小区楼</p>总记录数
     *
     * @param cbusinesstypeDto 数据对象分享
     * @return 小区下的小区楼记录数
     */
    int queryCbusinesstypesCount(CbusinesstypeDto cbusinesstypeDto);
}
