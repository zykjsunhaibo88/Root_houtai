package com.java110.intf.user;

import com.java110.dto.junkRequirement.JunkRequirementDto;

import java.util.List;

/**
 * @ClassName IJunkRequirementInnerServiceSMO
 * @Description 旧货市场接口类
 * @Author wuxw
 * @Date 2019/4/24 9:04
 * @Version 1.0
 * add by wuxw 2019/4/24
 **/

public interface IJunkRequirementInnerServiceSMO {

    /**
     * <p>查询小区楼信息</p>
     *
     * @param junkRequirementDto 数据对象分享
     * @return JunkRequirementDto 对象数据
     */
    List<JunkRequirementDto> queryJunkRequirements(JunkRequirementDto junkRequirementDto);

    /**
     * 查询<p>小区楼</p>总记录数
     *
     * @param junkRequirementDto 数据对象分享
     * @return 小区下的小区楼记录数
     */
    int queryJunkRequirementsCount(JunkRequirementDto junkRequirementDto);
}
