package com.broadree.spring.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class MainInterceptor implements HandlerInterceptor {
	//���ִ�У��������ͷ���Դ
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		//���Ը���arg3�Ƿ�Ϊnull�ж��Ƿ������쳣��������־��¼��
		System.out.println("action����������");
		
	}
	//������ͼ֮ǰִ��
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		System.out.println("action��������ʼ������ͼ");
	}
	//Action֮ǰִ��
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object arg2) throws Exception {
		System.out.println("��û����action������");
		return true;
	}
	
}
