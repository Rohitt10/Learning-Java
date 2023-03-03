import java.util.Scanner;
class SpecificExceptionHandling
{
	public static void main(String[] args)
	{
		int[] marks=new int[3];
		marks[0]=90;
		marks[1]=100;
		marks[2]=95;
		System.out.println("Enter the index of the marks");
		Scanner sc=new Scanner(System.in);
		int c=sc.nextInt();
		System.out.println("Enter the Number:  ");
		int d=sc.nextInt();
		try
		{
			System.out.println("The value at Index: "+marks[c]);
			System.out.println("The value after dividing with the number is: "+marks[c]/d);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception  Occured  ");
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Index Out Of Bounds Exception    ");
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println("Some other Exception ");
		}
	}
}