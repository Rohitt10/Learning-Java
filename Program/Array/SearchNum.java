import java.util.Scanner;
class SearchNum
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int []a={33,10,100,11,7};
		System.out.println("Input Number You want to search");
		int key=sc.nextInt();
		int count=0;
		for(int i=0;i<5;i++)
		{
			if(a[i]==key)
			{
				System.out.print("Element Found in the Array");
				break;
			}
			count++;
		}
		if(count==5)
			System.out.print("Element not found in the Array");
	}
}
		