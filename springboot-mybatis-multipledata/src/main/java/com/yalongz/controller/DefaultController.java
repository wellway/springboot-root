package com.yalongz.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;

@Controller
@SuppressWarnings("deprecation")
public abstract class DefaultController {
	
	/**
	 * 获取页面传来的参数，为空则为默认值
	 */
	protected String getUrlParam(HttpServletRequest request, String name,
			String defValue) {
		if (request.getParameter(name) == null
				|| StringUtils.isEmpty(request.getParameter(name))) {
			return defValue;
		} else {
			return request.getParameter(name).trim();
		}
	}

	/**
	 * 获取页面传来的参数，为空则为默认值
	 */
	protected String getUrlParamDefaultNull(HttpServletRequest request,
			String name) {
		if (request.getParameter(name) == null
				|| StringUtils.isEmpty(request.getParameter(name).trim())) {
			return null;
		} else {
			return request.getParameter(name);
		}
	}
	
	/**
	 * 获取一个Session属性对象
	 * 
	 * @param request
	 * @param sessionName
	 * @return
	 */
	protected Object getSessionAttribute(HttpServletRequest request, String sessionKey) {
		Object objSessionAttribute = null;
		HttpSession session = request.getSession(false);
		if (session != null) {
			objSessionAttribute = session.getAttribute(sessionKey);
		}
		return objSessionAttribute;
	}
	
	/**
	 * 设置一个Session属性对象
	 * 
	 * @param request
	 * @param sessionName
	 * @return
	 */
	protected void setSessionAttribute(HttpServletRequest request, String sessionKey, Object objSessionAttribute) {
		HttpSession session = request.getSession();
		if (session != null)
			session.setAttribute(sessionKey, objSessionAttribute);
	}

	/**
	 * 移除Session对象属性值
	 * 
	 * @param request
	 * @param sessionName
	 * @return
	 */
	protected void removeSessionAttribute(HttpServletRequest request, String sessionKey) {
		HttpSession session = request.getSession();
		if (session != null)
			session.removeAttribute(sessionKey);
	}
	
	
}
