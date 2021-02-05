package com.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.config.Configuration;
import com.model.Student;

public class SpringMain_Test_Annotation_Based {

	public static void main( String[] args )
    {
		
		//XML
		/*
		 * Loading from class path
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		 */
		
		//Loading from class path
		ApplicationContext ac = new AnnotationConfigApplicationContext(Configuration.class);
		
        Student student = (Student) ac.getBean("student-101");
        System.out.println("Student No:" + student.getSno());
        System.out.println("Student Name:" + student.getSname());
        
        
    }
}
