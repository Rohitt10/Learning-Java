import java.util.Scanner;
class InsertAtEnd
{
	static int insertE(int []a,int n,int key)
	{
		a[n]=key;
		return ++n;
	}
	static void display(int []a,int n)
	{
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Creating Array\n");
		System.out.print("Enter no of Elements: ");
		int n=sc.nextInt();
		System.out.print("Enter Elements\n");
		int []a=new int[100];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.print("Enter element To Insert At last: ");
		int key=sc.nextInt();
		n=insertE(a,n,key);
		display(a,n);
	}
}