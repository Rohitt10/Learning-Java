// Implementing Runnable Interface for using Thread
class Thread3 implements Runnable
{
	public void run()
	{
		int i=0;
		while(i<10000)
		{
			System.out.println("Rohit");
		}
	}
}
class Thread4 implements Runnable
{
	public void run()
	{
		int i=0;
		while (i<10000)
		{
			System.out.println("Priti ");
		}
	}
}
class ThreadRunnable
{
	public static void main(String[] args)
	{
		Thread3 bullet1=new Thread3();
		Thread4 bullet2=new Thread4();
		Thread gun1=new Thread(bullet1);
		Thread gun2=new Thread(bullet2);
		gun1.start();
		gun2.start();
	}
}
