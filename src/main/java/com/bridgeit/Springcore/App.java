package com.bridgeit.Springcore;

//import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
  //Here we have to change classes and references each time as per requirement
    	/*Car car=new Car();
    	car.drive();*/
    	
    	/*Bike bike=new Bike();
    	bike.drive();*/
    	
 //Here we have to change only classe each time as per requirement
    	/*Vehical obj=new Bike();
    	obj.drive();*/
    	
    	ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
    	/*Vehical obj=(Vehical) context.getBean("bike");
    	obj.drive();*/
    	
    	//Tyre t=new Tyre();
    	/*Tyre obj=(Tyre) context.getBean("tyre");
    	System.out.println(obj);
    	*/
    	
    	Car obj=(Car)context.getBean("car");
    	obj.drive();
    	
    }
}
