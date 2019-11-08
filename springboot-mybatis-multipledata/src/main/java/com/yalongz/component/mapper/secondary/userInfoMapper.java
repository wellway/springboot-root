package com.yalongz.component.mapper.secondary;

import com.yalongz.entity.users;

public interface userInfoMapper {

	public users getOne(String reqid);

	public int update(users user);

	public int insert(users user);

}
