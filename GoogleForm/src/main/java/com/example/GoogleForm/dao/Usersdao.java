package com.example.GoogleForm.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.example.GoogleForm.entity.Usersdata;


@Repository
public class Usersdao {
	
	@Autowired
	SessionFactory factory;

public String addUsers(Usersdata d) {
	
	
		Session session=null;
		Transaction tx=null;
		String msg=null;
		try {		
		 session= factory.openSession();
		 tx=session.beginTransaction();
		 session.persist(d);
		 tx.commit();
		 msg="Record is Addedd Successfully";
		 
		 
		}catch (Exception e1) {
			if(tx!=null) {
				tx.rollback();
			}
						
			e1.printStackTrace();
		}finally {
			if(session!=null) {
				session.close();
			}
		}
		
		return msg;
		
	 }
}
