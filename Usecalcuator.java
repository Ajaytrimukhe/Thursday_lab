//Create a Method by using Object

class Calculation1
{
	int a;
	int b;
	int c1,c2,c3,c4;
	
	void additonData(int a1, int b1)
	{
	this.a=a1;
	this.b=b1;
	c1=a+b;
	}
	
	void substractionData(int a1, int b1)
	{
	this.a=a1;
	this.b=b1;
	c2=a-b;
	}
	
	void multiplicationData(int a1, int b1)
	{
	this.a=a1;
	this.b=b1;
	c3=a*b;
	}
	
	void divisionData(int a1, int b1)
	{
	this.a=a1;
	this.b=b1;
	c4=a / b;
	}
     
    void displayData()
    {
		System.out.println("Addition=" + c1);
		System.out.println("Substraction=" + c2);
		System.out.println("Multiplication=" + c3);
		System.out.println("Division=" + c4);
	}	
}

public class Usecalcuator
{
	public static void main(String args[])
	{
	Calculation1 c11=new Calculation1();
	c11.additonData(2,3);
	c11.substractionData(7,5);
	c11.multiplicationData(2,3);
	c11.divisionData(3,2);
	
	c11.displayData();
	}
}