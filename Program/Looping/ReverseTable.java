import java.util.Scanner;
class ReverseTable
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Input a Number");
		int n=sc.nextInt();
		for(int i=10;i>0;i--)
			System.out.println(n+" * "+i+" = "+n*i);
	}
}