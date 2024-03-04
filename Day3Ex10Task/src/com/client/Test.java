 package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Student;

public class Test {

	public static void main(String[] args) {
		ApplicationContext a=new ClassPathXmlApplicationContext("bean.xml");
		Student stu=a.getBean("s1",Student.class);
		System.out.println(stu.getCities());
		System.out.println(stu.getMobiles());
		System.out.println(stu.getContrycode());
		
	}
}