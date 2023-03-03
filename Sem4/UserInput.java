import java.util.Scanner;
class UserInput
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter two numbers: ");
		int a=sc.nextInt(),b=sc.nextInt(),sum=a+b;
		System.out.print("Sum of Numbers: "+sum);
	}
}