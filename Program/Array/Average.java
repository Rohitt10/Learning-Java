import java.util.Scanner;
class Average
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		float []a=new float[5];
		float sum=0;
		System.out.println("Enter your marks for all 5 subjects");
		for(int i=0;i<5;i++)
			a[i]=sc.nextFloat();
		for(float i:a)
			sum=sum+i;
		System.out.print("Average Marks: "+sum/5);
	}
}