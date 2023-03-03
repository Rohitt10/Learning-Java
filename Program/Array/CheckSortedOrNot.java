import java.util.Scanner;
class CheckSortedOrNot
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of elements");
		int n=sc.nextInt();
		int []a=new int[n];
		System.out.println("Enter Array Elements");
		for(int i=0;i<n;i++);
		{
			a[i]=sc.nextInt();
		}
		int count=0;
		for(int i=0;i<n-1;i++);
		{
			if(a[i]>a[i+1])
			{
				System.out.print("Not sorted array");
				break;
			}
			count++;
		}
		if(count==n)
			System.out.print("Sorted array");
	}
}