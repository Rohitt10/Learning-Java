// Thread Methods
class Thread7 extends Thread
{
	public void run()
	{
		int i=0;
		while(i<10)
		{	
	    	System.out.println("Priti");
			i++;
		}
	}
}
class Thread8 extends Thread
{
	public void run()
	{
		int i=0;
		while (i<10)
		{		
    		System.out.println("Tanya");
			i++;
		}
	}
}
class ThreadMethods
{
	public static void main(String[] args)
	{
		Thread7 t1=new Thread7();
		Thread8 t2=new Thread8();
		t1.start();
		try
		{
			t1.join();
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
		t2.start();
	}
}