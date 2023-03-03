interface Parent
{
	void meth1();
}
interface Child extends Parent
{
	void meth2();
}
class Test implements Child
{
	public void meth1()
	{
		System.out.println("1");
	}
	public void meth2()
	{
		System.out.println("2");
	}
}
class InterfaceWithInheritance
{
	public static void main(String[] args)
	{
		Test obj1=new Test();
    	obj1.meth1();
    	obj1.meth2();
	}
	
	
}
