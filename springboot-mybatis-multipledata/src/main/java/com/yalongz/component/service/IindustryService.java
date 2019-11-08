package com.yalongz.component.service;

import com.yalongz.entity.NoticeInfo;

public interface IindustryService {

	public NoticeInfo getNoticeInfo(String id);

	public void insertTwoRecord(NoticeInfo notice);
}
