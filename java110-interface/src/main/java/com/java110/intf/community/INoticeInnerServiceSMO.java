package com.java110.intf.community;

import com.java110.dto.notice.NoticeDto;

import java.util.List;

/**
 * @ClassName INoticeInnerServiceSMO
 * @Description 通知接口类
 * @Author wuxw
 * @Date 2019/4/24 9:04
 * @Version 1.0
 * add by wuxw 2019/4/24
 **/

public interface INoticeInnerServiceSMO {

    /**
     * <p>查询小区楼信息</p>
     *
     * @param noticeDto 数据对象分享
     * @return NoticeDto 对象数据
     */
    List<NoticeDto> queryNotices(NoticeDto noticeDto);

    /**
     * 查询<p>小区楼</p>总记录数
     *
     * @param noticeDto 数据对象分享
     * @return 小区下的小区楼记录数
     */
    int queryNoticesCount(NoticeDto noticeDto);

    int updateNotice(NoticeDto noticeDto);
}
