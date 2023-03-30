class Rectangle
{
double length;
double breadth;

public Rectangle(double length,double breadth)
{
 this.length=length;
 this.breadth=breadth;
}

void dis1()
{
	System.out.println("Area of rectangle="+ length*breadth);
}

void dis2()
{
	System.out.println("Area of rectangle="+ 2*(length + breadth));
}

}

public class Userect
{
	public static void main(String args[])
	{
	Rectangle r1=new Rectangle(7,5);
	
	r1.dis1();
	r1.dis2();
	}
}