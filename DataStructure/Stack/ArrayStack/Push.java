import java.util.Scanner;
class Push
{
	public int push(int []a,int n,int data)
	{
		if(n>=100)
			System.out.print("Stack Full Push not possible\n");
		else
			a[n]=data;
		return ++n;
	}
	public int creatArray(int []a)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Array Creation\nEnter No of Elements: ");
		int n=sc.nextInt();
		System.out.print("Enter the Elements\n");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		return n;
	}
	public void display(int []a,int n)
	{
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int []a=new int[100];
		Push obj=new Push();
		int n;
		n=obj.creatArray(a);
		System.out.print("To perform push operation\nEnter the element: ");
		int ele=sc.nextInt();
		n=obj.push(a,n,ele);
		obj.display(a,n);
	}
}