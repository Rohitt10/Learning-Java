import java.util.Scanner;
class LargestNumber
{
	public static int large(int a,int b,int c)
	{
		if(a>b)
		{
			if(a>c)
				return a;
			else
				return c;
		}
		else
		{
			if(b>c)
				return b;
			else
				return c;
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
		int l=large(a,b,c);
		System.out.print("Largest num: "+l);
	}
}