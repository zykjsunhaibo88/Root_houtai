package com.java110.intf.fee;

import com.java110.dto.fee.BillDto;
import com.java110.dto.fee.BillOweFeeDto;
import com.java110.dto.fee.FeeDto;

import java.util.List;

/**
 * @ClassName IFeeInnerServiceSMO
 * @Description 费用接口类
 * @Author wuxw
 * @Date 2019/4/24 9:04
 * @Version 1.0
 * add by wuxw 2019/4/24
 **/

public interface IFeeInnerServiceSMO {

    /**
     * <p>查询小区楼信息</p>
     *
     * @param feeDto 数据对象分享
     * @return FeeDto 对象数据
     */
    List<FeeDto> queryFees(FeeDto feeDto);

    /**
     * 查询<p>小区楼</p>总记录数
     *
     * @param feeDto 数据对象分享
     * @return 小区下的小区楼记录数
     */
    int queryFeesCount(FeeDto feeDto);


    /**
     * 查询 账期信息 总数
     *
     * @param billDto 数据对象分享
     * @return 小区下的小区楼记录数
     */
    public int queryBillCount(BillDto billDto);

    /**
     * 查询 账期信息
     *
     * @param billDto 数据对象分享
     * @return 小区下的小区楼记录数
     */
    public List<BillDto> queryBills(BillDto billDto);

    /**
     * 查询 欠费数量
     *
     * @param billDto 数据对象分享
     * @return 小区下的小区楼记录数
     */
    public int queryBillOweFeeCount(BillOweFeeDto billDto);

    /**
     * 查询 欠费信息
     *
     * @param billDto 数据对象分享
     * @return 小区下的小区楼记录数
     */
    public List<BillOweFeeDto> queryBillOweFees(BillOweFeeDto billDto);

    /**
     * 保存欠费
     *
     * @param billDto
     * @return
     */
    public int insertBillOweFees(BillOweFeeDto billDto);

    /**
     * 保存账单
     *
     * @param billDto
     * @return
     */
    public int insertBill(BillDto billDto);
}
