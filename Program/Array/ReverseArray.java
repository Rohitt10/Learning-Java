import java.util.Scanner;
class ReverseArray
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int []a=new int[5];
		System.out.println("Enter the Array of 5 integers");
		for(int i=0;i<5;i++)
			a[i]=sc.nextInt();
		int key=5/2;
		for(int i=0;i<key;i++)
		{
			int temp;
			temp=a[i];
			a[i]=a[5-i-1];
			a[5-i-1]=temp;
		}
		System.out.println("Reverse Array");
		for(int i:a)
			System.out.print(i+" ");
	}
}
		