class Thread2 implements Runnable
{
	@Override
	public void run()
	{
		System.out.println("Thread2 class method");
	}
	public static void main(String[] args)
	{
		Runnable obj=new Thread2();
		Thread task=new Thread(obj);
		task.start();
	}
}