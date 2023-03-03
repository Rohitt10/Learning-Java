import java.util.Scanner;
class Array2D
{
	public static void main(String[] args)
	{
		System.out.print("2D Array Creation\nEnter row and column size: ");
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int column=sc.nextInt();
		int[][] a=new int[row][column];
		int count=1;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
				a[i][j]=count++;
		}
		System.out.println("Matrix ");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
	}
}