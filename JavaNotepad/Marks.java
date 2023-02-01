
import java.util.Scanner;

class Marks
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		float sub1,sub2,sub3;
		float per;
		String name;
		
		System.out.println("Enter your name :");
		name =sc.next();
		
		System.out.println("Enter your marks of subject1 :");
		sub1= sc.nextFloat(); 
		
		System.out.println("Enter your marks of subject2 :");
		sub2= sc.nextFloat(); 
		
		System.out.println("Enter your marks of subject3 :");
		sub3= sc.nextFloat(); 
		
		per = (sub1+sub2+sub3)/3;
		
		System.out.println("------------------------------------------");
		System.out.println(name+" has secured "+per+"%");
		System.out.println("------------------------------------------");
		
		
		
		
	}
	
	
}