import java.util.Scanner;
class MaxElement
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array of 5 elements");
		int []a=new int[5];
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		int max=a[0];
		for(int i=0;i<5;i++)
		{
			if(a[i]>max)
				max=a[i];
		}
		System.out.print("Maximum element is "+max);
	}
}