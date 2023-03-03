import java.util.Scanner;
class Enqueue
{
	final static int MAX=10;
	public int creatArray(int []a)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Creating Array\nEnter no of Elements: ");
		int n=sc.nextInt();
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		return n;
	}
	public int enqueue(int []a,int n)
	{
		Scanner sc=new Scanner(System.in);
																						
		if(n>=MAX)
		{
			System.out.print("Queue full\nEnqueue not Possible\n");
			return n;
		}
		else
		{
			System.out.print("Enter the Element: ");
			int ele=sc.nextInt();
			a[n]=ele;
			return ++n;
		}
	}
	public void display(int []a,int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args)
	{
		Enqueue obj=new Enqueue();
		int[] a=new int[MAX];
		int n=obj.creatArray(a);
		n=obj.enqueue(a,n);
		obj.display(a,n);
	}
}