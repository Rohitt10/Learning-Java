class Thread5 extends Thread
{
	public Thread5(String name)
	{
		super(name);
	}
	public void run()
	{
		System.out.println("Thank You");
	}
	

		
}
class ThreadConstructor
{
	public static void main(String[] args)
	{
		Thread5 obj1=new Thread5("Rohit");
		Thread5 obj2=new Thread5("Deep");
		obj1.start();
		obj2.start();
		System.out.println(obj1.getName());
		System.out.println(obj1.getId());
		System.out.println(obj2.getName());
		System.out.println(obj2.getId());
	}
}