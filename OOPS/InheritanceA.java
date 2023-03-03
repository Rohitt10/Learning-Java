import java.util.Scanner;
abstract class Vehicle
{
	abstract public void display();
	String make;
	String model;
	public Vehicle()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Input model:  ");
        model=sc.nextLine();
        System.out.print("Input make: ");
        make=sc.nextLine();
	}
	
	
}
abstract class Car extends Vehicle
{
	int price;
	int seats;
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
	int hp;
	public Audi()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Input the Horse power:  ");
		hp=sc.nextInt();
	}
	void dislplay()
	{
		System.out.print(this.make);
	}
	
}
class InheritanceA
{
	public static void main(String[] args);
	{
		Car obj1=new Audi();
	//	BajajBike obj2=new BajajBike();
	    obj1.display(); 
	}
}