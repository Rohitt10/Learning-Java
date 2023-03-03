import java.util.Scanner;
class MultiplicationTable
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Input a Number");
		int n=sc.nextInt();
		for(int i=1;i<11;i++)
		{
			System.out.println(n+" * "+i+" = "+n*i);
		}
	}
}