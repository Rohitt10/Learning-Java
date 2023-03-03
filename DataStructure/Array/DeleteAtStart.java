import java.util.Scanner;
class DeleteAtStart
{
	int deleteS(int []a,int n)
	{
		System.out.print(a[0]+" Deleted\n");
		for(int i=0;i<n-1;i++)
			a[i]=a[i+1];
		return --n;
	}
	void display(int []a,int n)
	{
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Creating Array\n");
		System.out.print("Enter No of Elements: ");
		int n=sc.nextInt();
		System.out.println("Enter Elements");
		int []a=new int[100];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		DeleteAtStart obj=new DeleteAtStart();
		n=obj.deleteS(a,n);
		obj.display(a,n);
	}
}