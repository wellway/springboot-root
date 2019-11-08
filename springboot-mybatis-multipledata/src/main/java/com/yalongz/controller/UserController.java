package com.yalongz.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yalongz.component.mapper.primary.IndustryInfoMapper;
import com.yalongz.component.mapper.secondary.userInfoMapper;
import com.yalongz.component.service.impl.IndustryImplService;
import com.yalongz.component.service.impl.UserImplService;
import com.yalongz.entity.NoticeInfo;
import com.yalongz.entity.users;

@RestController
@RequestMapping("/user")
public class UserController extends DefaultController {
	Logger						logger	= LoggerFactory.getLogger(UserController.class);

	@Autowired
	private IndustryInfoMapper	industryInfoMapper;

	@Autowired
	private userInfoMapper		userInfoMapper;

	@Autowired
	private IndustryImplService	industryService;
	@Autowired
	private UserImplService	userService;

	@RequestMapping("/test")
	public List<String> Test(HttpServletRequest request, HttpServletResponse response) {
		List<String> users = new ArrayList<String>();
		String id = getUrlParamDefaultNull(request, "id");

		NoticeInfo notice = industryInfoMapper.getOne("4246827015719928699");

		users user = userInfoMapper.getOne("123");
		NoticeInfo _notice = industryService.getNoticeInfo("4246827015719928699");
		
		userService.updateTwoRecord(user);
		
		
		logger.info("are you test?");
		users.add("122");
		users.add("ss");
		users.add("ee");
		users.add("errr");
		return users;
	}

}
