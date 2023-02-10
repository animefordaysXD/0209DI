package com.ict.edu.ex03_DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test_Main_DI {
	public static void main(String[] args) {
		ApplicationContext context =
				new GenericXmlApplicationContext("com/ict/edu/ex03_DI/config.xml");
		MyProcess mp = (MyProcess)context.getBean("mp3");
		mp.prn();
	}

}
