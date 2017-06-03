package com.tedu.service;

import com.tedu.pojo.Notice;

import java.util.List;

/**
 * Created by bigjsd on 2017/6/2.
 */
public interface NoticeService {
    //查询所有的公告
    public List<Notice> findNoticeAll();
    //删除公告
    public void deleteNotice(String[] noticeIds);
    //查询一条公告信息
    public Notice findOne(String id);
    //修改公告
    public void updateNotice(Notice notice);
    //添加公告
    public void saveNotice(Notice notice);
}
