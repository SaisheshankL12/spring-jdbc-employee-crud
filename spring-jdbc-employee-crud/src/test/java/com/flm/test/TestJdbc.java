package com.flm.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.flm.Dao.EmployeDao;
import com.flm.model.Employe;

public class TestJdbc {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		EmployeDao dao = ctx.getBean("dao", EmployeDao.class);
		//Employe emp = new Employe(null,35000D, 9L);
//		dao.saveEmploye(emp);
//		dao.deleteEmploye(27L);
//		System.out.println("insertion Done ");
		//forEach for all Employe
//		for(Employe emps : dao.getAllEmplot()) {
//			System.out.println(emps);
//		}
		dao.getAllEmplot("s%").forEach(emp -> System.out.println(emp));
		//System.out.println(dao.getOneEmploy(20L));
	}

}
