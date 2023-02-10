package com.ict.edu.ex03_DI;

public class TestMain_nonDI {
	 public static void main(String[] args) {
		 //인자 있는 constructor
		MyProcess mp = new MyProcess("둘리",15);
		mp.prn();
		
		//인자없이 get/set해서 만드는 constructor
		MyProcess mp2 = new MyProcess();
		mp.setAge(45);
		mp.setName("희동이");
		mp.prn();
	}

}
