import java.util.Scanner;
class ArithmeticOperation
{
	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
	public void sub(int a,int b)
	{
		System.out.println(a-b);
	}
	public void mult(int a,int b)
	{
		System.out.println(a*b);
	}
	public void div(int a,int b)
	{
		System.out.println(a/b);
	}
	public void mod(int a,int b)
	{
		System.out.println(a%b);
	}
	public static void main(String[] args)
	{
		ArithmeticOperation obj=new ArithmeticOperation();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1st number: ");
		int a=sc.nextInt();
		System.out.print("Enter 2nd number: ");
		int b=sc.nextInt();
		obj.add(a,b);
		obj.sub(a,b);
		obj.mult(a,b);
		obj.div(a,b);
		obj.mod(a,b);
	}
}
			