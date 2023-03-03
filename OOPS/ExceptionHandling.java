import java.util.Scanner;
class ExceptionHandling
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
		catch(Exception e)
		{
			System.out.println("Exception ,Reason:   "+e);
		}
	}
}