package com.java110.intf.community;

import com.java110.dto.app.AppDto;

import java.util.List;

/**
 * @ClassName IAppInnerServiceSMO
 * @Description 应用接口类
 * @Author wuxw
 * @Date 2019/4/24 9:04
 * @Version 1.0
 * add by wuxw 2019/4/24
 **/

public interface IAppInnerServiceSMO {

    /**
     * <p>查询小区楼信息</p>
     *
     * @param appDto 数据对象分享
     * @return AppDto 对象数据
     */
    List<AppDto> queryApps(AppDto appDto);

    /**
     * 查询<p>小区楼</p>总记录数
     *
     * @param appDto 数据对象分享
     * @return 小区下的小区楼记录数
     */
    int queryAppsCount(AppDto appDto);


    /**
     * <p>修改APP信息</p>
     *
     * @param appDto 数据对象分享
     * @return AppDto 对象数据
     */
    int updateApp(AppDto appDto);


    /**
     * <p>添加APP信息</p>
     *
     * @param appDto 数据对象分享
     * @return AppDto 对象数据
     */
    int saveApp(AppDto appDto);

    /**
     * <p>删除APP信息</p>
     *
     * @param appDto 数据对象分享
     * @return AppDto 对象数据
     */
    int deleteApp(AppDto appDto);
}
