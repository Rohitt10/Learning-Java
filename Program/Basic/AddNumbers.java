import java.util.Scanner;
class AddNumbers
{
	public static void main(String[] args)
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.print("Input a Number:  ");
		a=sc.nextInt();
		System.out.print("Input Another Number:  ");
		b=sc.nextInt();
		int z=a+b;
		System.out.print(a+b);
	}
}
