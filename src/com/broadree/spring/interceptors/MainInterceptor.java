package com.broadree.spring.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class MainInterceptor implements HandlerInterceptor {
	//最后执行，可用于释放资源
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		//可以根据arg3是否为null判断是否发生了异常，进行日志记录。
		System.out.println("action拦截器结束");
		
	}
	//生成视图之前执行
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		System.out.println("action拦截器开始生成视图");
	}
	//Action之前执行
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object arg2) throws Exception {
		System.out.println("还没进入action拦截器");
		return true;
	}
	
}
