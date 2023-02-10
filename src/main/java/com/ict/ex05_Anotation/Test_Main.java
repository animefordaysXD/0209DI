package com.ict.ex05_Anotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test_Main {
	public static void main(String[] args) {

	ApplicationContext context = 
			new GenericXmlApplicationContext("com/ict/ex05_Anotation/config.xml");

	Service service =(Service)context.getBean("ser");
	
	service.biz();
	}
}
