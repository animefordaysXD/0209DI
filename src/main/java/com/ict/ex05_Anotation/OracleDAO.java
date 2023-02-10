package com.ict.ex05_Anotation;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component("oracleDAO")
public class OracleDAO implements DAO{
	
	public OracleDAO() {
		System.out.println("oracle constructor");
	}
	@Override
	public void prn() {
		System.out.println("Oracle method");
		
	}
}
