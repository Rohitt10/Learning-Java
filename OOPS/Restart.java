import java.util.Scanner;
class Restart
{
	public static void main(String []args)
	{
		int n;
		System.out.println("Enter a Number");
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		for(int i=1;i<11;i++)
		{
			System.out.println(n+" * "+i+"="+n*i);
		}
	}
	
}