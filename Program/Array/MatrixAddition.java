import java.util.Scanner;
class MatrixAddition
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements for");
		System.out.println("Matrix 1(2x3)");
		int mat1[][]=new int[2][3];
		int mat2[][]=new int[2][3];
		int mat3[][]=new int[2][3];
		for (int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
				mat1[i][j]=sc.nextInt();
		}
		System.out.println("Matrix 2(2x3)");
		for (int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
				mat2[i][j]=sc.nextInt();
		}
		for (int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
				mat3[i][j]=mat1[i][j]+mat2[i][j];
		}
		System.out.println("Matrix 1+Matrix 2");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
				System.out.print(mat3[i][j]+" ");
			System.out.println("");
		}
	}
}