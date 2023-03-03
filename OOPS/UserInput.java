import java.util.Scanner;
class UserInput
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int a,b,sum1;
		float c,d,sum2;
		System.out.print("Enter First integer:  ");
		a=sc.nextInt();
		System.out.print("Enter Second integer:  ");
		b=sc.nextInt();
		sum1=a+b;
		System.out.println("\n"+sum1);
		System.out.print("Enter First float value:  ");
		c=sc.nextFloat();
		System.out.print("Enter Second float value:  ");
		d=sc.nextFloat();
		sum2=c+d;
		System.out.println("\n"+sum2);
	}
}

		