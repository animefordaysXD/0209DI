package com.ict.ex01_nonDI;

public class OracleDAO implements DAO{
	
	public OracleDAO() {
		System.out.println("oracle constructor");
	}
	@Override
	public void prn() {
		System.out.println("Oracle method");
		
	}
}
