package com.java110.intf.user;

import com.java110.dto.org.OrgCommunityDto;

import java.util.List;

/**
 * @ClassName IOrgCommunityInnerServiceSMO
 * @Description 隶属小区接口类
 * @Author wuxw
 * @Date 2019/4/24 9:04
 * @Version 1.0
 * add by wuxw 2019/4/24
 **/

public interface IOrgCommunityInnerServiceSMO {

    /**
     * <p>查询小区楼信息</p>
     *
     * @param orgCommunityDto 数据对象分享
     * @return OrgCommunityDto 对象数据
     */
    List<OrgCommunityDto> queryOrgCommunitys(OrgCommunityDto orgCommunityDto);

    /**
     * 查询<p>小区楼</p>总记录数
     *
     * @param orgCommunityDto 数据对象分享
     * @return 小区下的小区楼记录数
     */
    int queryOrgCommunitysCount(OrgCommunityDto orgCommunityDto);
}
