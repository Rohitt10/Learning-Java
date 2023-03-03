abstract class Bike
{
	abstract void run();
}
class Honda extends Bike
{
	void run()
	{
		System.out.print("Running");
	}
}
class test
{
	public static void main(String[] args)
	{
		Bike obj=new Honda();
		obj.run();
	}
}
