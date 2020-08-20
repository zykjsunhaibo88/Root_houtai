package com.java110.intf.community;


import com.java110.dto.CommunityMemberDto;
import com.java110.dto.community.CommunityAttrDto;
import com.java110.dto.community.CommunityDto;

import java.util.List;

/**
 * @ClassName IFloorInnerServiceSMO
 * @Description 小区楼接口类
 * @Author wuxw
 * @Date 2019/4/24 9:04
 * @Version 1.0
 * add by wuxw 2019/4/24
 **/

public interface ICommunityInnerServiceSMO {


    /**
     * <p>查询小区楼信息</p>
     *
     * @param communityDto 数据对象分享
     * @return CommunityDto 对象数据
     */

    List<CommunityDto> queryCommunitys(CommunityDto communityDto);

    /**
     * 查询<p>小区楼</p>总记录数
     *
     * @param communityDto 数据对象分享
     * @return 小区下的小区楼记录数
     */
    int queryCommunitysCount(CommunityDto communityDto);

    /**
     * 查询小区成员表
     *
     * @param communityMemberDto 小区成员数据封装
     * @return CommunityMemberDto 数据
     */
    List<CommunityMemberDto> getCommunityMembers(CommunityMemberDto communityMemberDto);

    /**
     * 查询小区成员数量
     *
     * @param communityMemberDto 小区成员数据封装
     * @return CommunityMemberDto 数据
     */
    int getCommunityMemberCount(CommunityMemberDto communityMemberDto);

    /**
     * <p>查询小区楼信息</p>
     *
     * @param communityAttrDto 数据对象分享
     * @return CommunityDto 对象数据
     */
    List<CommunityAttrDto> getCommunityAttrs(CommunityAttrDto communityAttrDto);

    /**
     * 查询<p>小区楼</p>总记录数
     *
     * @param communityAttrDto 数据对象分享
     * @return 小区下的小区楼记录数
     */
    int getCommunityAttrsCount(CommunityAttrDto communityAttrDto);

}
