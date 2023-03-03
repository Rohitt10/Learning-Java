import java.util.Scanner;
class AllOp_006
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.print("Input first number: ");
		a=sc.nextInt();
		System.out.print("Input second number: ");
		b=sc.nextInt();
		System.out.println(a+" + "+b+" = "+(a+b));
		System.out.println(a+" - "+b+" = "+(a-b));
		System.out.println(a+" X "+b+" = "+a*b);
		System.out.println(a+" / "+b+" = "+a/b);
		System.out.print(a+" mod "+b+" = "+a%b);
	}
}