import java.util.Scanner;
class SumNatural
{
	static int sum(int n)
	{
		if(n==1)
			return 1;
		return n+sum(n-1);
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Any Number");
		int n=sc.nextInt();
		int sumv=sum(n);
	}
}