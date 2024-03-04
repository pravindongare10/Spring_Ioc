 package com.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext a=new ClassPathXmlApplicationContext("bean.xml");
		Student stu=a.getBean("s1",Student.class);
		System.out.println(stu.getId());
		System.out.println(stu.getName());
		System.out.println(stu.getAdr());
	//setter based injection bean class object mutable
		stu.setId(1);
		stu.setName("rahul");
		stu.setAdr("panagari");
		System.out.println(stu.getId());
		System.out.println(stu.getName());
		System.out.println(stu.getAdr());
	}
}