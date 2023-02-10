package com.ict.edu.ex02_DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test_Main {
	public static void main(String[] args) {
	// DI는 Spring Container에서 객체 생성(Bean)
	// Spring Container에게 필요한 정보를 제공하는 설정 정보 파일을 만들자 
	//config.xml 호출할 수 있는 클래스	
    // Spring Container: BeanFactory-> ApplicationContext
	//                              ->WebApplicationContext(Web)
	ApplicationContext context = 
			new GenericXmlApplicationContext("com/ict/edu/ex02_DI/config.xml");
    //config.xml 에서 사용할 Server Bean을 호출해서 biz()를 실행하자
	
	/* method 1 */
	//Service service = (Service)context.getBean("service");
	/* method 2 */
	Service service =context.getBean("service",Service.class);
	
	service.biz();
	}
}
