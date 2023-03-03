import java.util.Scanner;
abstract class Vehicle
{
	protected String make;
	protected String model;
	public Vehicle()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Input model:  ");
        model=sc.nextLine();
        System.out.print("Input make: ");
        make=sc.nextLine();
	}
	public abstract void display();
	
}
abstract class Car extends Vehicle
{
	protected int price;
	protected int seats;
	public Car()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Input price:  ");
        price=sc.nextInt();
		System.out.print("Input no of seats");
        seats=sc.nextInt();
	}
}
class Audi extends Car
{
	protected int hp;
	public Audi()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Input the Horse power:  ");
		hp=sc.nextInt();
	}
	public void dislplay()
	{
		System.out.println(make);
		System.out.println(model);
	}
	
}
class Inheritance
{
	 public static void main(String args[]);
	{
		Car obj1=new Audi();
	//	BajajBike obj2=new BajajBike();
	    obj1.display(); 
	}
}