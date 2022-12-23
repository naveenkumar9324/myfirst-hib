package com.myhib.myfirst_hib.service.impl;

import com.myhib.myfirst_hib.dao.impl.StudentDaoImpl;
import com.myhib.myfirst_hib.dto.Student;

public class StudentServiceImpl {
	
	public double result(Student s) {

		return s.getEnglis()+s.getMaths()+s.getScience();
	}
      
	
	public double percentage(double result) {
		return (result/300)*300;
		
	}
	public String grade(double percentage ) {
		if(percentage>=35) {
			
			if(percentage>75) {
				return "A+";
			}else if(percentage>60&&percentage<=75){
				return "A";
			}else if(percentage>45&&percentage<=60){
				return "B";
			}else if(percentage>35&&percentage<=45){
				return "C";
				
			}
		}
	
          return "FAIL";
}
	    public void saveStudent(Student s) {
	    	double res=result(s);
	    	double per=percentage(res);
	    	String g=grade(per);
	    	
	    	    s.setResult(res);
	            s.setPercentage(per); 
	            s.setGrade(g);
	            StudentDaoImpl dao=new StudentDaoImpl();
	            dao.save(s);
	            
	            
	    	    	
	    	    }
	    	    }

