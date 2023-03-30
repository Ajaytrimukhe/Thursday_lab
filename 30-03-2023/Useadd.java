class Add
{



void dis(int a1,int b1)
{
System.out.println(a1+b1);
}

void dis(int a1,double b1,int c1)
{
System.out.println(a1+b1+c1);
}

}

public class Useadd
{
	public static void main(String args[])
	{
	Add a1=new Add();
	a1.dis(11,11);
	a1.dis(11,11,11);
	}
}