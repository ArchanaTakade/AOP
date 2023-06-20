package com.archana;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext ac = new ClassPathXmlApplicationContext("configure.xml");
   
      Teacher thr = ac.getBean("thr",Teacher.class);
      thr.TeacherMethod();
    
    }
}
