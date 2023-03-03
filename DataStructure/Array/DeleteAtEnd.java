import java.util.Scanner;
class DeleteAtEnd
{
	static int deleteE(int []a,int n)
	{
		System.out.print(a[n-1]+" Deleted\n");
		return --n;
	}
	static void display(int []a,int n)
	{
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Creating Array\nEnter no of Elements: ");
		int n=sc.nextInt();
		int []a=new int[100];
		System.out.print("Enter the Elements\n");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		n=deleteE(a,n);
		display(a,n);
	}
}