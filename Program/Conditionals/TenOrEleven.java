import java.util.Scanner;
class TenOrEleven
{
	public static void main(String[] args)
	{
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.print("Input a Number: ");
		a=sc.nextInt();
		if(a==10)
			System.out.print("I am 10");
		else if(a==11)
			System.out.print("I am 11");
		else
			System.out.print("I am neither 10 nor 11");
	}
}