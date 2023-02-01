/*WAP to calculate years , weeks and days 
*/

import java.util.Scanner;

 class YearWeekDemo
 {
	 public static void main(String args[])
	 {
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Enter days :");
		 int days= sc.nextInt();
		 
		 int years= days/365;
		 System.out.println("Years:"+years);
		 days= days%365;
		//System.out.println("Remaining days:"+days);
		
		int weeks= days/7;
		days= days%7;
		System.out.println("Weeks:"+weeks);
		System.out.println("Days:"+days);
		
		
		
		 
		 
	 }
 }