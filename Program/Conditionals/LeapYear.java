import java.util.Scanner;
class LeapYear
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Input A Year:  ");
		int year=sc.nextInt();
		if(year%100!=0 && year%4==0)
			System.out.print("Leap Year");
		else if(year%100==0 && year%400==0)
			System.out.print("Leap Year");
		else
			System.out.print("Not a Leap Year");
	}
}
		