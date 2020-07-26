package com.java110.intf.user;

import com.java110.dto.user.UserAttrDto;
import com.java110.dto.user.UserDto;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * 用户服务接口类（供服务间调用）
 */

public interface IUserInnerServiceSMO {

    /**
     * 查询用户服务版本
     *
     * @param code 编码 没有任何意义 随便传一个字符串就可以
     * @return 编码 + 版本号
     */
    String getUserServiceVersion(@RequestParam("code") String code);

    /**
     * 查询用户信息
     *
     * @param userIds 用户ID
     *                支持 多个查询
     * @return 用户封装信息
     */
    List<UserDto> getUserInfo(@RequestParam("userIds") String[] userIds);


    /**
     * 查询员工总数
     *
     * @param userDto 用户ID
     *                支持 多个查询
     * @return 用户封装信息
     */
    int getStaffCount(UserDto userDto);


    /**
     * 查询员工信息
     *
     * @param userDto 用户ID
     *                支持 多个查询
     * @return 用户封装信息
     */
    List<UserDto> getStaffs(UserDto userDto);


    /**
     * 查询用户总数
     *
     * @param userDto 用户ID
     *                支持 多个查询
     * @return 用户封装信息
     */
    int getUserCount(UserDto userDto);


    /**
     * 查询员工信息
     *
     * @param userDto 用户ID
     *                支持 多个查询
     * @return 用户封装信息
     */
    List<UserDto> getUsers(UserDto userDto);

    List<UserDto> getUserHasPwd(UserDto userDto);

    /**
     * 查询用户属性
     *
     * @param userAttrDto 用户ID
     *                    支持 多个查询
     * @return 用户封装信息
     */
    List<UserAttrDto> getUserAttrs(UserAttrDto userAttrDto);
}
