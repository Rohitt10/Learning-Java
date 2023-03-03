// Threads with priorities
class Thread6 extends Thread
{
	public Thread6(String name)
	{
		super(name);
	}
	public void run()
	{
		int i=0;
		while(i<100 )
		{
			System.out.println(this.getName());
			i++;
		}
	}	
}
class ThreadPriority
{
	public static void main(String[] args)
	{
    	Thread6 obj1=new Thread6("Priti");
    	Thread6 obj2=new Thread6("Tanya");
    	Thread6 obj3=new Thread6("Anamika");
		Thread6 obj4=new Thread6("Yashi");
		obj1.setPriority(Thread.MAX_PRIORITY);
		obj2.setPriority(Thread.MIN_PRIORITY);
		obj3.setPriority(5);
		obj4.setPriority(Thread.MIN_PRIORITY);
		obj1.start();
		obj2.start();
		obj3.start();
		obj4.start();
	}
}