package com.ict.edu.ex02_DI;

public class OracleDAO implements DAO{
	
	public OracleDAO() {
		System.out.println("oracle constructor");
	}
	@Override
	public void prn() {
		System.out.println("Oracle method");
		
	}
}
