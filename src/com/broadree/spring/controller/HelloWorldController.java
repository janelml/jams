package com.broadree.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.broadree.spring.cache.MemCached;
import com.broadree.spring.dao.StudentDao;
import com.broadree.spring.dao.impl.StudentDaoImpl;
import com.broadree.spring.pojo.Student;


@Controller
public class HelloWorldController {
	private static StudentDao studentDao= new StudentDaoImpl();
	private static int cachedNumber=0;
	
    @RequestMapping("/web/hello")
	public ModelAndView helloworld(int id,String str){
    	System.out.println(str);
    	Student student = (Student)MemCached.getInstance().get("Student-id-"+id);
    	if(student!=null){
    		cachedNumber++;
    		System.out.println("ª∫¥Ê√¸÷– "+cachedNumber+"¥Œ  Student:"+student.getId());
    		
    	}else{
    		student=studentDao.selectStudentById(id);
    		MemCached.getInstance().add("Student-id-1", student);
    	}
    	
		return new ModelAndView("hello","message",student.getName());
	}
    
    @RequestMapping("/jquery")
	public ModelAndView jquery(){
		return new ModelAndView("jquery","message",null);
	}
	 
	 
}
