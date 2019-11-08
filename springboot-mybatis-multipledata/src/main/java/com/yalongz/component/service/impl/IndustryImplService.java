package com.yalongz.component.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yalongz.component.mapper.primary.IndustryInfoMapper;
import com.yalongz.component.service.IindustryService;
import com.yalongz.entity.NoticeInfo;

@Service("industryService")
public class IndustryImplService implements IindustryService {

	@Autowired
	private IndustryInfoMapper	industryInfoMapper;

	@Override
	public NoticeInfo getNoticeInfo(String id) {

		return industryInfoMapper.getOne(id);
	}

	@Transactional
	public void insertTwoRecord(NoticeInfo notice) {
		industryInfoMapper.insert_NoticeInfo(notice);
	}

}
