package com.java110.intf.community;

import com.java110.dto.visit.VisitDto;

import java.util.List;

/**
 * @ClassName IVisitInnerServiceSMO
 * @Description 访客信息接口类
 * @Author wuxw
 * @Date 2019/4/24 9:04
 * @Version 1.0
 * add by wuxw 2019/4/24
 **/

public interface IVisitInnerServiceSMO {

    /**
     * <p>查询小区楼信息</p>
     *
     * @param visitDto 数据对象分享
     * @return VisitDto 对象数据
     */
    List<VisitDto> queryVisits(VisitDto visitDto);

    /**
     * 查询<p>小区楼</p>总记录数
     *
     * @param visitDto 数据对象分享
     * @return 小区下的小区楼记录数
     */
    int queryVisitsCount(VisitDto visitDto);
}
