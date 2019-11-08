package com.yalongz.component.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yalongz.component.mapper.secondary.userInfoMapper;
import com.yalongz.component.service.IuserService;
import com.yalongz.entity.users;

@Service("userService")
public class UserImplService implements IuserService {

	@Autowired
	private userInfoMapper	userInfoMapper;

	@Transactional(value="secondaryTransactionManager",rollbackFor = Exception.class,timeout=36000)
	public void updateTwoRecord(users user) {
		user.setId(251971);
//		userInfoMapper.insert(user);
		userInfoMapper.equals(user);
//		user.setId(251981);
//		userInfoMapper.insert(user);
	}
}
