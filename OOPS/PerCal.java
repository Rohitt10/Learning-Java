import java.util.Scanner;
class PerCal
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		float sum1=0,p;
		float[] a=new float[5];
		System.out.print("Enter Marks for Five subjects:  ");
		for(int i =0;i<5;i++)
		{
			a[i]=sc.nextFloat();
			sum1+=a[i];
		}
		p=(sum1/5);
		System.out.println(p+"%");
	}
}