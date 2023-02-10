package com.ict.ex01_nonDI;

public class Test_Main {
	public static void main(String[] args) {
		//방법 1
		/*
		 * Service service = new Service();
		 *  service.biz();
		 */
		//방법 2: 생성자를 이용해 객체 삽입
		  Service service = new Service(new OracleDAO());
		   service.biz();
		   System.out.println("=============");
		 //방법 3: setter를 이용하는 방법
		   service.setDao(new MYSQL_DAO());
		   service.biz();
		   
		   
	}
	
	 

}
