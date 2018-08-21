package com.cjp.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cjp.controller.UserController;

public class Test1 {
	@Test
	public void testDemo(){
		/*ApplicationContext act=new ClassPathXmlApplicationContext("application-zhujie.xml");
		UserController userController = (UserController) act.getBean("userController");
		System.out.println("ceshi:"+userController);
		*/
		long ss=System.currentTimeMillis();
	       System.out.println(String.valueOf(ss).substring(0,10));
	}
	
	public static void main(String[] args) {
		ApplicationContext act=new ClassPathXmlApplicationContext("application-zhujie.xml");
		UserController userController = (UserController) act.getBean("userController");
		System.out.println("ceshi:"+userController);
		System.out.println("nihao");
		System.out.println("yubyqy");
	}
}
