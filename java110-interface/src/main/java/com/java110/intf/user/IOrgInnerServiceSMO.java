package com.java110.intf.user;

import com.java110.dto.org.OrgDto;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @ClassName IOrgInnerServiceSMO
 * @Description 组织接口类
 * @Author wuxw
 * @Date 2019/4/24 9:04
 * @Version 1.0
 * add by wuxw 2019/4/24
 **/

public interface IOrgInnerServiceSMO {

    /**
     * <p>查询小区楼信息</p>
     *
     * @param orgDto 数据对象分享
     * @return OrgDto 对象数据
     */
    List<OrgDto> queryOrgs(OrgDto orgDto);

    /**
     * 查询<p>小区楼</p>总记录数
     *
     * @param orgDto 数据对象分享
     * @return 小区下的小区楼记录数
     */
    int queryOrgsCount(OrgDto orgDto);


    /**
     * <p>查询上级组织信息</p>
     *
     * @param orgDto 数据对象分享
     * @return OrgDto 对象数据
     */
    @RequestMapping(value = "/queryParentOrgs", method = RequestMethod.POST)
    List<OrgDto> queryParentOrgs(@RequestBody OrgDto orgDto);
}
