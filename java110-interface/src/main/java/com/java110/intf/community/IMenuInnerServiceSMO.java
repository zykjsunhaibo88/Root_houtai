package com.java110.intf.community;

import com.java110.dto.basePrivilege.BasePrivilegeDto;
import com.java110.dto.menu.MenuDto;
import com.java110.dto.menuGroup.MenuGroupDto;

import java.util.List;

/**
 * @ClassName IMenuGroupInnerServiceSMO
 * @Description 路由接口类
 * @Author wuxw
 * @Date 2019/4/24 9:04
 * @Version 1.0
 * add by wuxw 2019/4/24
 **/

public interface IMenuInnerServiceSMO {

    /**
     * <p>查询小区楼信息</p>
     *
     * @param routeDto 数据对象分享
     * @return MenuGroupDto 对象数据
     */
    List<MenuGroupDto> queryMenuGroups(MenuGroupDto routeDto);

    /**
     * 查询<p>小区楼</p>总记录数
     *
     * @param routeDto 数据对象分享
     * @return 小区下的小区楼记录数
     */
    int queryMenuGroupsCount(MenuGroupDto routeDto);

    /**
     * <p>修改APP信息</p>
     *
     * @param routeDto 数据对象分享
     * @return ServiceDto 对象数据
     */
    int updateMenuGroup(MenuGroupDto routeDto);


    /**
     * <p>添加APP信息</p>
     *
     * @param routeDto 数据对象分享
     * @return MenuGroupDto 对象数据
     */
    int saveMenuGroup(MenuGroupDto routeDto);

    /**
     * <p>删除APP信息</p>
     *
     * @param routeDto 数据对象分享
     * @return MenuGroupDto 对象数据
     */
    int deleteMenuGroup(MenuGroupDto routeDto);


    /**
     * <p>查询小区楼信息</p>
     *
     * @param routeDto 数据对象分享
     * @return MenuGroupDto 对象数据
     */
    List<BasePrivilegeDto> queryBasePrivileges(BasePrivilegeDto routeDto);

    /**
     * 查询<p>小区楼</p>总记录数
     *
     * @param routeDto 数据对象分享
     * @return 小区下的小区楼记录数
     */
    int queryBasePrivilegesCount(BasePrivilegeDto routeDto);


    /**
     * 查询<p>小区楼</p>总记录数
     *
     * @param routeDto 数据对象分享
     * @return 小区下的小区楼记录数
     */
    boolean checkUserHasResource(BasePrivilegeDto routeDto);


    /**
     * <p>修改APP信息</p>
     *
     * @param routeDto 数据对象分享
     * @return ServiceDto 对象数据
     */
    int updateBasePrivilege(BasePrivilegeDto routeDto);


    /**
     * <p>添加APP信息</p>
     *
     * @param routeDto 数据对象分享
     * @return BasePrivilegeDto 对象数据
     */
    int saveBasePrivilege(BasePrivilegeDto routeDto);

    /**
     * <p>删除APP信息</p>
     *
     * @param routeDto 数据对象分享
     * @return BasePrivilegeDto 对象数据
     */
    int deleteBasePrivilege(BasePrivilegeDto routeDto);


    /**
     * <p>查询菜单信息</p>
     *
     * @param routeDto 数据对象分享
     * @return MenuGroupDto 对象数据
     */
    List<MenuDto> queryMenus(MenuDto routeDto);

    /**
     * 查询<p>菜单</p>总记录数
     *
     * @param routeDto 数据对象分享
     * @return 菜单记录数
     */
    int queryMenusCount(MenuDto routeDto);

    /**
     * <p>修改菜单信息</p>
     *
     * @param routeDto 数据对象分享
     * @return ServiceDto 对象数据
     */
    int updateMenu(MenuDto routeDto);


    /**
     * <p>添加菜单信息</p>
     *
     * @param routeDto 数据对象分享
     * @return MenuDto 对象数据
     */
    int saveMenu(MenuDto routeDto);

    /**
     * <p>删除菜单信息</p>
     *
     * @param routeDto 数据对象分享
     * @return MenuDto 对象数据
     */
    int deleteMenu(MenuDto routeDto);


}
