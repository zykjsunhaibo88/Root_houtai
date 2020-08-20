package com.java110.intf.store;

import com.java110.dto.purchaseApplyDetail.PurchaseApplyDetailDto;
import com.java110.po.purchase.PurchaseApplyDetailPo;

import java.util.List;


/**
 * @ClassName IPurchaseApplyDetailInnerServiceSMO
 * @Description 订单明细接口类
 * @Author wuxw
 * @Date 2019/4/24 9:04
 * @Version 1.0
 * add by wuxw 2019/4/24
 **/

public interface IPurchaseApplyDetailInnerServiceSMO {

    /**
     * <p>查询小区楼信息</p>
     *
     * @param purchaseApplyDetailDto 数据对象分享
     * @return PurchaseApplyDetailDto 对象数据
     */
    List<PurchaseApplyDetailDto> queryPurchaseApplyDetails(PurchaseApplyDetailDto purchaseApplyDetailDto);

    /**
     * 查询<p>小区楼</p>总记录数
     *
     * @param purchaseApplyDetailDto 数据对象分享
     * @return 小区下的小区楼记录数
     */
    int queryPurchaseApplyDetailsCount(PurchaseApplyDetailDto purchaseApplyDetailDto);

    /**
     * 修改采购申请明细
     *
     * @param purchaseApplyDetailPo 数据对象分享
     * @return 小区下的小区楼记录数
     */
    int updatePurchaseApplyDetail(PurchaseApplyDetailPo purchaseApplyDetailPo);
}
