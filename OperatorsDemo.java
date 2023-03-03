import java.util.Scanner;
class OperatorsDemo
{
	public void shiftOperatorExample()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num=sc.nextInt();
		int num2=num;
		int ans=num >> 1;
		System.out.println("1bit Right shift of "+num+" = "+ans);
		ans=num2 << 1;
		System.out.println("1bit left shift of "+num2+" = "+ans);
	}
	public void logicalOperator()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number: ");
		int num=sc.nextInt();
		if(num%2==0 && num%3==0)
			System.out.println("Divisible by 6");
		else if(num%2==0 || num%3==0)
		{
			if(num%2==0)
				System.out.println("Divisible by 2");
			else
				System.out.println("Divisible by 3");
		}
		else
			System.out.println("Not divisble by 2 or 3");
		System.out.println("Bitwise | and & opertion");
		System.out.print("Enter 1st number: ");
		int num1=sc.nextInt();
		System.out.print("Enter 2nd number: ");
		int num2=sc.nextInt();
		System.out.println(num1+" | "+num2+" = "+(num1|num2));
		System.out.println(num1+" & "+num2+" = "+(num1&num2));
	}
	public static void main(String[] args)
	{
		OperatorsDemo obj=new OperatorsDemo();
		obj.shiftOperatorExample();
		obj.logicalOperator();
	}
}
	
		