//Thread class using extends 
class MyThread extends Thread
{
	public void run()
	{
		int i=0;
		while(i<1000)
		{
			System.out.println("Rohit");
			i++;
		}
	}
}
class MyThread2 extends Thread
{
	public void run()
	{
		int i=0;
		while(i<1000)
		{
			System.out.println("Shivam");
			i++;
		}
	}
}
class ThreadClass
{
	public static void main(String[] args)
	{
		MyThread obj1=new MyThread();
		MyThread2 obj2=new MyThread2();
		obj1.start();
		obj2.start();
	}
}