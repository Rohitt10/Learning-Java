import java.util.Scanner;
class ToLower
{
	public static void main(String[] args)
	{
		String a;
		Scanner sc=new Scanner(System.in);
		System.out.print("Input a string:  ");
		a=sc.nextLine();
	    a=a.toLowerCase();
		System.out.print(a);
	}
}