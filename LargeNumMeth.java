import java.util.Scanner;
class LargeNumMeth
{
	public static void large(int a,int b,int c)
	{
		int big;
		if(a>b)
			big=(a>c)?a:c;
		else
			big=(b>c)?b:c;
		System.out.print(big);
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
		large(a,b,c);
	}
}