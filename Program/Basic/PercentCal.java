import java.util.Scanner;
class PercentCal
{
	public static void main(String[] args)
	{
		float a[]=new float[5];
		float sum=0.0f;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your marks for 5 Subjects");
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextFloat();
			sum+=a[i];
		}
		System.out.print("Percentage:  "+(sum/5));
	}
}