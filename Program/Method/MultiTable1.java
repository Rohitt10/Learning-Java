import java.util.Scanner;
class MultiTable1
{
	static void table(int n)
	{
		for(int i=1;i<11;i++)
		{
			System.out.println(n+" * "+i+" = "+n*i);
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
		int n=sc.nextInt();
		table(n);
	}
}