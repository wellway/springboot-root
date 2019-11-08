package com.yalongz.component.mapper.primary;

import com.yalongz.entity.NoticeInfo;

public interface IndustryInfoMapper {

	public NoticeInfo getOne(String reqid);

	public int update(NoticeInfo notice);

	public int insert(NoticeInfo notice);

	public int insert_NoticeInfo(NoticeInfo notice);

}
