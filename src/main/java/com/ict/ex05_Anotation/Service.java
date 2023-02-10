package com.ict.ex05_Anotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("ser")
	public class Service {
		//클래스를 자료형으로 사용
	
		//autowired: 변수 이름이랑 참조하는 클래스의 id가 같을때 사용
	
        @Autowired
        //같은 이름이 없을때 원하는 참조 클래스의 아이디를 입력함
        //@Qualifier("MYSQL_DAO")
	
		//@AutoWired +@Qualifier("MYSQL_DAO")
		
		private DAO dao;
		public Service() {
			
		}
		public Service(DAO dao) {
			this.dao = dao;
			System.out.println("service constructor");
		}
        public DAO getDao() {
			return dao;
		}
		public void setDao(DAO dao) {
			this.dao = dao;
		}
		
		public void biz() {
			dao.prn();
		}
		 
	}
