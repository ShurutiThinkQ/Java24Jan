package com.ifelse;

import java.util.Scanner;

public class BmiCalculator {

	public static void main(String[] args) {
    
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your height in feet");
        
		float height= sc.nextFloat();
		
        System.out.println("Enter your weight in kg");
        
		float weight= sc.nextFloat();
		
		height= height*0.3048f;  // converting height into metre
		
		float bmi= weight/(height*height);
		
		System.out.println("Your bmi is :"+bmi);
		
		if(bmi<=18)
		{
			System.out.println("Underweight");
		}
		else if(bmi<=25)
		     {
			 System.out.println("Normal");
		     }
		     else
		     {
		    	 System.out.println("Overweight");
		     }
		
		sc.close();
		
		
       		

	}

}
