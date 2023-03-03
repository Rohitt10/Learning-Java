import java.util.Scanner;
class FirstEvenSum
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Input the Number for Even sum");
		int n=sc.nextInt();
		int sum=0;
		for(int i=2;i<=n;)
		{
			sum+=i;
			i+=2;
		}
		System.out.print("Sum of Even Numbers Upto "+n+" = "+sum);
	}
}
			