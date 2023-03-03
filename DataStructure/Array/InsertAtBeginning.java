import java.util.Scanner;
class InsertAtBeginning
{
	int insertB(int []a,int key,int n)
	{
		for(int i=n-1;i>=0;i--)
		{
			a[i+1]=a[i];
		}
		a[0]=key;
		return ++n;
	}
	void display(int []a,int n)
	{
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Array Creation\nEnter No of Array Elements:  ");
		int n=sc.nextInt();
		int []a=new int[100];
		System.out.println("Enter The Array Elements");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.print("Enter element to insert element At Beginning: ");
		InsertAtBeginning obj=new InsertAtBeginning();
		int key=sc.nextInt();
		n=obj.insertB(a,key,n);
		System.out.println("New Array");
		obj.display(a,n);
	}
}