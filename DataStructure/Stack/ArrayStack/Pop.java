import java.util.Scanner;
class Pop
{
	public int creatArray(int []a)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no of Elements: ");
		int n=sc.nextInt();
		System.out.print("Enter the Elements\n");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		return n;
	}
	public int pop(int []a,int n)
	{
		if(n==0)
		{
			System.out.print("Stack Empty\nCan not be deleted\n");
			return n;
		}
		System.out.println("Element deleted: "+a[n-1]);
		return --n;
	}
	public void display(int []a,int n)
	{
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}
	public static void main(String[] args)
	{
		Pop obj=new Pop();
		Scanner sc=new Scanner(System.in);
		int []a=new int[100];
		int n=obj.creatArray(a);
		n=obj.pop(a,n);
		obj.display(a,n);
	}
}