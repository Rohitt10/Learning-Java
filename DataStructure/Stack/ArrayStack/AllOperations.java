import java.util.Scanner;
class AllOperations
{
	final static int MAX=5;
	public int push(int[] a,int n)
	{
		
		Scanner sc=new Scanner(System.in);
		if(n>=MAX)
		{
			System.out.print("Stack full\nCan not be Inserted\n");
			return n;
		}
		else
		{
			System.out.print("Enter the ELement: ");
			int ele=sc.nextInt();
			a[n]=ele;
			return ++n;
		}
	}
	public boolean isEmpty(int n)
	{
		if(n==0)
		{
			System.out.print("Stack Empty\n");
			return true;
		}
		else
		{
			System.out.print("Stack Not Empty\n");
			return false;
		}
	}
	public int pop(int[] a,int n)
	{
		AllOperations obj=new AllOperations();
		if(obj.isEmpty(n)==true)
		{
			System.out.print("Can not perform pop\n");
			return n;
		}
		else
		{
			System.out.print(a[n-1]+" Deleted\n");
			return --n;
		}
	}
	public void peek(int[] a,int n)
	{
		System.out.println("Last Element: "+a[n-1]);
	}
	public void display(int[] a,int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		AllOperations obj=new AllOperations();
		int[] a=new int[MAX];
		int n=0;
		boolean t;
		do
		{
			System.out.print("1.Push\n2.Pop\n3.Peep\n4.isEmpty\n5.Display\n6.Exit\nChoose your operation: ");
			int ch1=sc.nextInt();
			if(ch1==6)
				break;
			switch(ch1)
			{
				case 1:
				        n=obj.push(a,n);
						break;
				case 2:
				        n=obj.pop(a,n);
						break;
				case 3:
				        obj.peek(a,n);
						break;
				case 4:
				        t=obj.isEmpty(n);
						break;
				case 5:
				        obj.display(a,n);
						break;
				default:
				        System.out.print("Enter Correct choice\n");
						break;
			}
		}while(true);
	}
}