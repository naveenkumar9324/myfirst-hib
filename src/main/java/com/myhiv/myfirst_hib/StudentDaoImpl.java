package com.myhiv.myfirst_hib;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.myhib.dto.StudentDto;

public class StudentDaoImpl {
	
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("myfirsthib");
		
		EntityManager entityManager=emf.createEntityManager();
		
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		StudentDto dto=new StudentDto();
		dto.setId(1);
		
		entityTransaction.begin();
		entityManager.persist(dto);
		
		entityTransaction.commit();
	}

}
