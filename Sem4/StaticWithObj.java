class StaticWithObj
{
	void show()
	{
		System.out.println("Hello! Java");
	}
	public static void main(String[] args)
	{
		StaticWithObj obj=new StaticWithObj();
		System.out.println("Welcome");
		obj.show();
	}
}