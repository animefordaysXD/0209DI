package com.ict.ex04_DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;



public class TestMain_DI {
	public static void main(String[] args) {
		ApplicationContext context =
				new GenericXmlApplicationContext("com/ict/ex04_DI/config.xml");
		MyProcess mp = (MyProcess)context.getBean("mp");
		mp.prn();
		System.out.println("5555555555555555555555");
		MyProcess mp2 = (MyProcess)context.getBean("mp2");
		mp2.prn();
	}
}
