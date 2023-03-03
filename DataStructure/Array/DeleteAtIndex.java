import java.util.Scanner;
class DeleteAtIndex
{
	static int deleteI(int []a,int n)
	{
		System.out.print("Enter Index: ");
		Scanner sc=new Scanner(System.in);
		int index=sc.nextInt();
		System.out.println(a[index]+" Deleted");
		for(int i=index;i<n-1;i++)
			a[i]=a[i+1];
		return --n;
	}
	static void display(int []a,int n)
	{
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}
	public static void main(String[] args)
	{
		Scanner st=new Scanner(System.in);
		System.out.println("Array Creation");
		System.out.print("Enter no of Elements: ");
		int n=st.nextInt();
		System.out.print("Enter The Elements\n");
		int []a=new int[100];
		for(int i=0;i<n;i++)
			a[i]=st.nextInt();
		n=deleteI(a,n);
		display(a,n);
	}
}