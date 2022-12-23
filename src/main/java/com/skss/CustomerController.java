package com.skss;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

//import com.myhib.myfirst_hib.dto.Student;

public class CustomerController {
	
	//private static final Object customer = null;

	EntityManagerFactory emf=Persistence.createEntityManagerFactory("myfirst-hib");
	
	EntityManager entityManager=emf.createEntityManager();
	
	EntityTransaction entityTransaction=entityManager.getTransaction();
	

	public void save(Customer customer) {
		entityTransaction.begin();
	
	    entityManager.persist(customer);
	
	    entityTransaction.commit();
	
	}
	     public void updaate(Object customer) {
	    	 entityTransaction.begin();
	    	 entityManager.merge(customer);
	    	 entityTransaction.commit();
	     }
	
	     public void delete(int id) {
	    	 
	    	 Customer exist=entityManager.find(Customer.class,id);
	    	 
	    	 entityTransaction.begin();
	    	 entityManager.merge(exist);
	    	 entityTransaction.commit();
	    	 
	    	 System.out.println("The data is removed");
	     }
	     
	     public void getCustomerById(int id) {
	    	 Customer customer=entityManager.find(Customer.class,id);
	    	 
	    	 System.out.println(customer);
	     }
	
	public static void main(String args[]){
		
		Customer dto=new Customer();
		dto.setId(1);
		dto.setName("naveen");
		dto.setAccountNo(555767676765L);
		dto.setBalance(5000);
		
		CustomerController controller=new CustomerController();
		//ontroller.update(1);
	    //controller.delete(1);
		controller.getCustomerById(1);
		
		
	}

}
