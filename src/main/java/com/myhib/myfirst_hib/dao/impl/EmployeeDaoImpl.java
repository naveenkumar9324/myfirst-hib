package com.myhib.myfirst_hib.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.myhib.myfirst_hib.dto.Employee;

public class EmployeeDaoImpl {

	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("student");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public void createEmployeeDaoImpl(Employee employee) {
		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();
		
		System.out.println("Successfully saved");

	}
	
	public void getEmployeeById(int id) {
		Employee employee=entityManager.find(Employee.class, id);
		
		System.out.println(employee);
	}
	
	public void getAllEmployee() {
		Query query=entityManager.createQuery("select e from Employee");
		java.util.List employees=query.getResultList();
	}
	public void deleteEmployee(int id) {
		Employee employee=entityManager.find(Employee.class,id);
		entityTransaction.begin();
		entityManager.remove(employee);
		entityTransaction.commit();
		System.out.println("Employee deleted successefully");
	}
	  
}
