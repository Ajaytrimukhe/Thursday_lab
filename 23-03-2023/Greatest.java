import java.util.Scanner;
class Greatest
{
	public static void main(String args[])
	{
     Scanner s1=new scanner(System.in); 	
	
	 System.out.println("Enter the value od a,b,c");
	 
	 
	int a=4;
	int b=2;
	int c=9;
	
	if(a>b && a>c)
	{
		System.out.println("a is greater than b and c");
	}
	
	else if(b>a && b>c)
	{
		System.out.println("b is greater than b and c");
	}
	
	else
	{
		System.out.println("c is greater than a and c");
	}
	
	}
	
}