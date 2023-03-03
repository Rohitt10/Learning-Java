import java.util.Scanner;
class KiloToMile
{
	public static void main(String[] srgs)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Input length in Kilometer");
		float val=sc.nextFloat();
		System.out.print(0.62*val+" Miles");
	}
}