 package com.ict.ex05_Anotation;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class MYSQL_DAO implements DAO{
	
	public MYSQL_DAO() {
		System.out.println("SQL constructor");
	}
	
	@Override
	public void prn() {
		System.out.println("SQL method");
		
	}
}
