package com.java110.intf.store;

import com.java110.dto.purchaseApply.PurchaseApplyDetailDto;
import com.java110.dto.purchaseApply.PurchaseApplyDto;
import com.java110.po.purchase.PurchaseApplyPo;

import java.util.List;

/**
 * @ClassName IPurchaseApplyInnerServiceSMO
 * @Description 采购申请接口类
 * @Author wuxw
 * @Date 2019/4/24 9:04
 * @Version 1.0
 * add by wuxw 2019/4/24
 **/

public interface IPurchaseApplyInnerServiceSMO {


    /**
     * <p>保存 采购申请</p>
     *
     * @param purchaseApplyPo 数据对象分享
     * @return PurchaseApplyDto 对象数据
     */
    int savePurchaseApply(PurchaseApplyPo purchaseApplyPo);

    /**
     * <p>查询小区楼信息</p>
     *
     * @param purchaseApplyDto 数据对象分享
     * @return PurchaseApplyDto 对象数据
     */
    List<PurchaseApplyDto> queryPurchaseApplys(PurchaseApplyDto purchaseApplyDto);


    List<PurchaseApplyDto> queryPurchaseApplyAndDetails(PurchaseApplyDto purchaseApplyDto);

    /**
     * 查询<p>小区楼</p>总记录数
     *
     * @param purchaseApplyDto 数据对象分享
     * @return 小区下的小区楼记录数
     */
    int queryPurchaseApplysCount(PurchaseApplyDto purchaseApplyDto);


    //查询采购明细表
    List<PurchaseApplyDetailDto> queryPurchaseApplyDetails(PurchaseApplyDetailDto purchaseApplyDetailDto);

}
