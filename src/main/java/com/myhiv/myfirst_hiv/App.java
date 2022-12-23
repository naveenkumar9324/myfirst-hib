package com.myhiv.myfirst_hiv;


import com.myhib.myfirst_hib.dto.Student;
import com.myhib.myfirst_hib.service.impl.StudentServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Student dto=new Student();
        dto.setId(1);
        dto.setName("Naveen");
        dto.setEnglis(77);
        dto.setMaths(60);
        dto.setScience(77);
        dto.setResult(223);
        dto.setPercentage(74);
        dto.setGrade("B");
        
      StudentServiceImpl service=new  StudentServiceImpl();
      service.saveStudent(dto);
    }
}
