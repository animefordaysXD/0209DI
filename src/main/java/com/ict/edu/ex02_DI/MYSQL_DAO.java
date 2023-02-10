 package com.ict.edu.ex02_DI;

public class MYSQL_DAO implements DAO{
	
	public MYSQL_DAO() {
		System.out.println("SQL constructor");
	}
	
	@Override
	public void prn() {
		System.out.println("SQL method");
		
	}
}
