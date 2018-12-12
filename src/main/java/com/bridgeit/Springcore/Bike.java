package com.bridgeit.Springcore;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehical{
	
	public void drive()
	{
		System.out.println("Bike is Running");
	}

}
