package Exception;

import java.util.Scanner;

public class ExceptionDemo {
	
	public static void main(String[] args) 
	{
		ExceptionDemo e=new ExceptionDemo();
		e.divide();		
	}
public void divide()
{
try
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number:");
	int num1=sc.nextInt();
	int num2=sc.nextInt();
	System.out.println(num1/num2);
	
}
catch(Exception e)
{
	System.out.println(e.getMessage());
	System.out.println(e.getStackTrace());
	System.out.println("bye..");
}
finally
{
	System.out.println("hello..");
}
}
}
