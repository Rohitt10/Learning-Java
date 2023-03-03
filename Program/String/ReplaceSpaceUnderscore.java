import java.util.Scanner;
class ReplaceSpaceUnderscore
{
	public static void main(String[] args)
	{
		String a;
		Scanner sc=new Scanner(System.in);
		System.out.print("Input Your Name:  ");
		a=sc.nextLine();
		a=a.replace(" ","_");
		System.out.print(a);
	}
}