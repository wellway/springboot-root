package com.yalongz.entity;

import java.io.Serializable;

import com.yalongz.commons.Constants;



public class Result implements Serializable {
	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	private int					code;
	private String				message;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Result getResultCode(int code) {
		this.code = code;
		switch (code) {
		case Constants.FAIL_CODE:
			this.message = Constants.FAIL_NAME;
			break;
		case Constants.SUSSCUSS_CODE:
			this.message = Constants.SUSSCUSS_NAME;
			break;
		case Constants.SIGNATURE_FAIL_CODE:
			this.message = Constants.SIGNATURE_FAIL_NAME;
			break;
		case Constants.PARSE__FAIL_CODE:
			this.message = Constants.PARSE__FAIL_NAME;
			break;
		default:
			this.message = Constants.DEFAULT_NAME;
			break;
		}
		return this;
	}
}
