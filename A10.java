//010
class A10
{
	protected void m1()
	{
		System.out.println("A10 class Method");
	}
}
class B10 extends A10
{
	public static void main(String[] args)
	{
		A10 a=new A10();//A10 class object with A10 class reference
		a.m1();
		B10 b=new B10();//B10 class object with B10 class reference
		b.m1();
		A10 c=new B10();//B10 class object with A10 class reference
		c.m1();
	}
}