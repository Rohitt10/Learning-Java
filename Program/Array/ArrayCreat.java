import java.util.Scanner;
class ArrayCreat
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		float []a=new float[5];
		float sum=0;
		System.out.println("Input any 5 Numbers");
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextFloat();
			sum+=a[i];
		}
		System.out.print("The of all 5 Numbers is "+sum);
	}
}
			