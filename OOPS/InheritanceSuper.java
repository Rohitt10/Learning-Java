import java.util.Scanner;
class Vehicle
{
	protected int wheels;
	protected String model;
	public Vehicle()
	{
		System.out.print("Input Number of wheels:  ");
		Scanner sc =new Scanner(System.in);
		wheels=sc.nextInt();
		System.out.print("Input model:  ");
		model=sc.nextLine();
	}
	public Vehicle(int a,String b)
	{
		wheels=a;
		model=b;
	}
}
class Car extends Vehicle
{
	protected int price;
	public Car()
	{
		System.out.print("Input The Price: ");
		Scanner sc=new Scanner(System.in);
		price=sc.nextInt();
	}
	public Car(int a,int b,String c)
	{
		super(b,c);
		price=a;
	}
}
class Audi extends Car
{
	protected int hp;
	public Audi()
	{
		System.out.print("Input Horse power:  ");
		Scanner sc=new Scanner(System.in);
		hp=sc.nextInt();
	}
	public Audi(int a,int b,int c,String d)
	{
		super(b,c,d);
		hp=a;
	}
	public void display()
	{
		System.out.println("\tDetails");
		System.out.println("\tWheels:      "+wheels);
		System.out.println("\tModel:       "+model);
		System.out.println("\tPrice:       "+price);
		System.out.println("\tHorse Power: "+hp);
	}
}

class InheritanceSuper
{
	public static void main(String[] args)
	{
		Audi obj1=new Audi();
		Audi obj2=new Audi(750,50000,4,"Rohit");
		obj1.display();
		obj2.display();
	}
}

		