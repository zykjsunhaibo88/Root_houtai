package com.java110.intf.community;

import com.java110.dto.mapping.MappingDto;

import java.util.List;

/**
 * @ClassName IMappingInnerMappingSMO
 * @Description 映射接口类
 * @Author wuxw
 * @Date 2019/4/24 9:04
 * @Version 1.0
 * add by wuxw 2019/4/24
 **/

public interface IMappingInnerServiceSMO {

    /**
     * <p>查询小区楼信息</p>
     *
     * @param mappingDto 数据对象分享
     * @return MappingDto 对象数据
     */
    List<MappingDto> queryMappings(MappingDto mappingDto);

    /**
     * 查询<p>小区楼</p>总记录数
     *
     * @param mappingDto 数据对象分享
     * @return 小区下的小区楼记录数
     */
    int queryMappingsCount(MappingDto mappingDto);


    /**
     * <p>修改APP信息</p>
     *
     * @param serviceDto 数据对象分享
     * @return MappingDto 对象数据
     */
    int updateMapping(MappingDto serviceDto);


    /**
     * <p>添加APP信息</p>
     *
     * @param serviceDto 数据对象分享
     * @return MappingDto 对象数据
     */
    int saveMapping(MappingDto serviceDto);

    /**
     * <p>删除APP信息</p>
     *
     * @param serviceDto 数据对象分享
     * @return MappingDto 对象数据
     */
    int deleteMapping(MappingDto serviceDto);
}
