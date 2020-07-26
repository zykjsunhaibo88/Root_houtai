package com.java110.intf.fee;

import com.java110.dto.returnPayFee.ReturnPayFeeDto;

import java.util.List;


/**
 * @ClassName IReturnPayFeeInnerServiceSMO
 * @Description 退费表接口类
 * @Author wuxw
 * @Date 2019/4/24 9:04
 * @Version 1.0
 * add by wuxw 2019/4/24
 **/

public interface IReturnPayFeeInnerServiceSMO {

    /**
     * <p>查询小区楼信息</p>
     *
     * @param returnPayFeeDto 数据对象分享
     * @return ReturnPayFeeDto 对象数据
     */
    List<ReturnPayFeeDto> queryReturnPayFees(ReturnPayFeeDto returnPayFeeDto);

    /**
     * 查询<p>小区楼</p>总记录数
     *
     * @param returnPayFeeDto 数据对象分享
     * @return 小区下的小区楼记录数
     */
    int queryReturnPayFeesCount(ReturnPayFeeDto returnPayFeeDto);
}
