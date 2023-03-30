class vechicle
{
String brand;
String model;
int year;

	public Vechicle(String brand, String model, int year)
	{
	this.brand=brand;
	this.model=model;
	this.year=year;
	}
	
	public void drive()
	{
	 System.out.println("Driving"+ brand + model + year);
	}
}

class Car extends Vechicle
{
private String color;

public Car(String brand,String model, int year, String color)
{
super(brand, model, year);
this.color=color;
}

	public void type()
	{
	 System.out.println("Type: Car"+ brand + model + year + color);
	}
}

public class Usecar
{
 public static void main(String args[])
 {
 Car c1=new Car("Indica","Vista",2010,"white");
 c1.drive();
 c1.type();
 }
}