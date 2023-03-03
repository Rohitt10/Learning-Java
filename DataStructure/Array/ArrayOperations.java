import java.util.Scanner;
class ArrayOperations
{
	static int insertB(int []a,int key,int n)
	{
		for(int i=n-1;i>=0;i--)
		{
			a[i+1]=a[i];
		}
		a[0]=key;
		return ++n;
	}
	static int insertE(int []a,int n,int key)
	{
		a[n]=key;
		return ++n;
	}
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
	static int deleteS(int []a,int n)
	{
		System.out.print(a[0]+" Deleted\n");
		for(int i=0;i<n-1;i++)
			a[i]=a[i+1];
		return --n;
	}
	static int deleteE(int []a,int n)
	{
		System.out.print(a[n-1]+" Deleted\n");
		return --n;
	}
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
		System.out.println();
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
		do
		{
			System.out.println("Enter Your Choice\n1.Insert\n2.Delete\n3.Display\n4.Exit");
			int choice=st.nextInt();
			if(choice==4)
				break;
			switch(choice)
			{
				case 1: 
				        System.out.print("Enter The key Element: ");
						int key=st.nextInt();
				        System.out.print("Enter your choice\n1.Insert At Start\n2.Insert At Last\n3.Insert At Index\n");
						int ch=st.nextInt();
						switch(ch)
						{
							case 1:
							        n=insertB(a,n,key);
									break;
							case 2:
							        n=insertE(a,n,key);
									break;
							case 3:
							        n=insertI(a,n,key);
									break;
							default:
							        System.out.print("Enter Valid choice\n");
									break;
						}
						break;
				case 2:
				        System.out.print("Enter your choice\n1.Delete At Start\n2.Delete At Last\n3.Delete At Index\n");
						int ch2=st.nextInt();
						switch(ch2)
						{
							case 1:
							        n=deleteS(a,n);
									break;
							case 2:
							        n=deleteE(a,n);
									break;
							case 3:
							        n=deleteI(a,n);
									break;
							default:
							        System.out.print("Enter Valid choice\n");
									break;
						}
						break;
				case 3:
				        display(a,n);
						break;
				default:
				        System.out.print("Enter Valid Choice\n");
						break;
			}
		}while(true);
	}
}