package com.myhib.myfirst_hib.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.hibernate.mapping.List;

//import com.myhib.dto.StudentDto;
import com.myhib.myfirst_hib.dto.Student;

public class StudentDaoImpl {
	
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("myfirst-hib"); 
	
	EntityManager em=emf.createEntityManager();
	
	EntityTransaction et=em.getTransaction();
	
	public void save(Student s) {
		et.begin();
		em.persist(s);
		et.commit();
		System.out.println("Hello the student with " +s.getName()+" is successful ");
	}

	public List getAll(){
		 Query query=em.createQuery("select * from student s");
		return (List) query.getResultList();
	}
	
}	


