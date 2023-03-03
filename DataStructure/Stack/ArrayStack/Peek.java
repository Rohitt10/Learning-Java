import java.util.Scanner;
class Peek
{
	public int creatArray(int[] a)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Creating Array\nEnter no of elements: ");
		int n=sc.nextInt();
		System.out.print("Enter the elements\n");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		return n;
	}
	public void peek(int[] a,int n)
	{
		System.out.println("Last Element: "+a[n-1]);
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[] a=new int[100];
		Peek obj=new Peek();
		int n=obj.creatArray(a);
		obj.peek(a,n);
	}
}
		