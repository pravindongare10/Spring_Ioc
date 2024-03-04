 package com.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext a=new ClassPathXmlApplicationContext("bean.xml");
		Student stu=a.getBean("s1",Student.class);
		//Partial injection of dependency  is possible
		System.out.println(stu.getId());
		System.out.println(stu.getName());
		System.out.println(stu.getAdr());

	}
}