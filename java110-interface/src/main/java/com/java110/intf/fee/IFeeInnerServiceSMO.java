package com.java110.intf.fee;

import com.alibaba.fastjson.JSONArray;
import com.java110.dto.fee.BillDto;
import com.java110.dto.fee.BillOweFeeDto;
import com.java110.dto.fee.FeeAttrDto;
import com.java110.dto.fee.FeeDto;
import com.java110.po.fee.PayFeePo;

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
     * <p>从Business中查询</p>
     *
     * @param feeDto 数据对象分享
     * @return FeeDto 对象数据
     */
    List<FeeDto> queryBusinessFees(FeeDto feeDto);


    /**
     * 查询<p>小区楼</p>总记录数
     *
     * @param feeDto 数据对象分享
     * @return 小区下的小区楼记录数
     */
    int queryFeesCount(FeeDto feeDto);


    /**
     * <p>查询费用信息</p>
     *
     * @param feeAttrDto 数据对象分享
     * @return FeeDto 对象数据
     */
    List<FeeDto> queryFeeByAttr(FeeAttrDto feeAttrDto);


    /**
     * 查询<p>费用</p>总记录数
     *
     * @param feeAttrDto 数据对象分享
     * @return 小区下的小区楼记录数
     */
    int queryFeeByAttrCount(FeeAttrDto feeAttrDto);


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
     * 查询账单欠费
     *
     * @param feeDto 数据对象分享
     * @return 小区下的小区楼记录数
     */
    public int computeBillOweFeeCount(FeeDto feeDto);

    /**
     * 查询账单欠费
     *
     * @param feeDto 数据对象分享
     * @return 小区下的小区楼记录数
     */
    public List<FeeDto> computeEveryOweFee(FeeDto feeDto);


    /**
     * 查询账单欠费
     *
     * @param feeDto 数据对象分享
     * @return 小区下的小区楼记录数
     */
    public int computeEveryOweFeeCount(FeeDto feeDto);

    /**
     * 查询账单欠费
     *
     * @param feeDto 数据对象分享
     * @return 小区下的小区楼记录数
     */
    public List<FeeDto> computeBillOweFee(FeeDto feeDto);


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
     * 保存欠费
     *
     * @param billDto
     * @return
     */
    public int updateBillOweFees(BillOweFeeDto billDto);

    /**
     * 保存账单
     *
     * @param billDto
     * @return
     */
    public int insertBill(BillDto billDto);


    public int updateFee(PayFeePo payFeePo);

    int saveFee(List<PayFeePo> payFeePos);


    public JSONArray getAssetsFee(String communityId);
}
