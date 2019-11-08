package com.yalongz.entity;

import java.io.Serializable;

public class UserEntity implements Serializable {

	private static final long	serialVersionUID	= 1L;
	private Long				id;
	private String				userName;
	private String				passWord;
	private String				userSex;
	private String				nickName;

	public UserEntity() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getUserSex() {
		return userSex;
	}

	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", userName=" + userName + ", passWord=" + passWord + ", userSex=" + userSex + ", nickName=" + nickName + "]";
	}

}