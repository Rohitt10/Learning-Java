import java.util.Scanner;
class Pattern1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Input n For pattern");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=n;j>i;j--)
				System.out.print("*");
			System.out.print("\n");
		}
	}
}