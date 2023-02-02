package com.ifelse;

import java.util.Scanner;

public class GradingSystem {

	public static void main(String[] args) {

    Scanner sc= new Scanner(System.in);
    
    System.out.println("Enter the marks of five subjects:");
    float sub1= sc.nextFloat();
    float sub2= sc.nextFloat();
    float sub3= sc.nextFloat();
    float sub4= sc.nextFloat();
    float sub5= sc.nextFloat();
    
    float per = (sub1+sub2+sub3+sub4+sub5)/5;
    
    System.out.println("Percentage:"+per+"%");
    if(per>=85)
    	System.out.println("Outstanding");
    else if(per>=70)
    	  System.out.println("Very Good"); 
         else if(per>=55)
        	    System.out.println("Good");
               else if(per>=40)
            	     System.out.println("Satisfactory");
                     else
                    	 System.out.println("Need to work hard");
    
    sc.close();
    
	}

}
