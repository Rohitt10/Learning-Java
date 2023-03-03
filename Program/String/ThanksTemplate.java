import java.util.Scanner;
class ThanksTemplate
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String a;
		System.out.print("Input Your Name: ");
		a=sc.nextLine();
		System.out.print("Dear "+a+", Thanks a Lot");
	}
}