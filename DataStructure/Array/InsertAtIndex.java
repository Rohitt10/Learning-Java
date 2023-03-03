import java.util.Scanner;
class InsertAtIndex
{
	static int insertI(int []a,int n,int key)
	{
		Scanner st=new Scanner(System.in);
		System.out.print("Enter Index: ");
		int index=st.nextInt();
		for(int i=n-1;i>=index;i--)
			a[i+1]=a[i];
		a[index]=key;
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
		System.out.print("Creating Array\nEnter no of Elements: ");
		int n=sc.nextInt();
		int []a=new int[100];
		System.out.print("Enter the Elements\n");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.print("Enter The Key Element: ");
		int key=sc.nextInt();
		n=insertI(a,n,key);
		display(a,n);
	}
}