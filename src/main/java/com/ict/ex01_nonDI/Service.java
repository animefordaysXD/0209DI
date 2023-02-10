package com.ict.ex01_nonDI;

	public class Service {
		//method 1
		/*
		 * OracleDAO oracleDAO = new OracleDAO(); MYSQL_DAO mysqlDAO= new MYSQL_DAO();
		 * 
		 * public void biz() { 
		 * oracleDAO.prn(); 
		 * //mysqlDAO.prn();
		 * }*/
		
		
		//클래스를 자료형으로 사용
		private DAO dao;
		public Service() {
			
		}
        public DAO getDao() {
			return dao;
		}
		public void setDao(DAO dao) {
			this.dao = dao;
		}
		public Service(DAO dao) {
			this.dao = dao;
		}
		public void biz() {
			dao.prn();
		}
		 
	}
