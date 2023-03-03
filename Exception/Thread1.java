public class Thread1 extends Thread
{
	public void run()
	{
		System.out.println("Thread1 class run method");
	}
	public static void main(String[] args)
	{
		Thread1 obj=new Thread1();
		obj.start();
	}
}
