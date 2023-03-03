import java.util.Scanner;
class Array
{
	public static void main(String[] args)
	{
		int [] marks=new int [5];
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter "+marks.length+" array element:  ");
		for(int i=0;i<marks.length;i++)
		{
			marks[i]=sc.nextInt();
		}
		for(int element: marks)
			System.out.print(element+" ");
	}
}

		