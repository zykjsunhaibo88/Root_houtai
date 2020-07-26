package com.java110.intf.fee;

import com.java110.dto.fee.FeeDetailDto;

import java.util.List;

/**
 * @ClassName IFeeDetailInnerServiceSMO
 * @Description 费用明细接口类
 * @Author wuxw
 * @Date 2019/4/24 9:04
 * @Version 1.0
 * add by wuxw 2019/4/24
 **/

public interface IFeeDetailInnerServiceSMO {

    /**
     * <p>查询小区楼信息</p>
     *
     * @param feeDetailDto 数据对象分享
     * @return FeeDetailDto 对象数据
     */
    List<FeeDetailDto> queryFeeDetails(FeeDetailDto feeDetailDto);

    /**
     * 查询<p>小区楼</p>总记录数
     *
     * @param feeDetailDto 数据对象分享
     * @return 小区下的小区楼记录数
     */
    int queryFeeDetailsCount(FeeDetailDto feeDetailDto);
}
