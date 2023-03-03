import java.util.Scanner;
class Greet
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Input Your Name");
	String name=sc.nextLine();
	System.out.print("Hello! "+name);
	}
}