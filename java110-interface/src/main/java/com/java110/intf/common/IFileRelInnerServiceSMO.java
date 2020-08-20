package com.java110.intf.common;

import com.java110.dto.file.FileRelDto;

import java.util.List;

/**
 * @ClassName IFileRelInnerServiceSMO
 * @Description 文件存放接口类
 * @Author wuxw
 * @Date 2019/4/24 9:04
 * @Version 1.0
 * add by wuxw 2019/4/24
 **/

public interface IFileRelInnerServiceSMO {

    /**
     * <p>查询小区楼信息</p>
     *
     * @param fileRelDto 数据对象分享
     * @return FileRelDto 对象数据
     */
    List<FileRelDto> queryFileRels(FileRelDto fileRelDto);

    /**
     * 查询<p>小区楼</p>总记录数
     *
     * @param fileRelDto 数据对象分享
     * @return 小区下的小区楼记录数
     */
    int queryFileRelsCount(FileRelDto fileRelDto);
}
