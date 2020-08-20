package com.java110.intf.fee;

import com.java110.dto.fee.FeeAttrDto;

import java.util.List;

/**
 * @ClassName IFeeAttrInnerServiceSMO
 * @Description 费用属性接口类
 * @Author wuxw
 * @Date 2019/4/24 9:04
 * @Version 1.0
 * add by wuxw 2019/4/24
 **/

public interface IFeeAttrInnerServiceSMO {

    /**
     * <p>查询小区楼信息</p>
     *
     * @param feeAttrDto 数据对象分享
     * @return FeeAttrDto 对象数据
     */
    List<FeeAttrDto> queryFeeAttrs(FeeAttrDto feeAttrDto);

    /**
     * 查询<p>小区楼</p>总记录数
     *
     * @param feeAttrDto 数据对象分享
     * @return 小区下的小区楼记录数
     */
    int queryFeeAttrsCount(FeeAttrDto feeAttrDto);
}
