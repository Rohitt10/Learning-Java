import java.util.Scanner;
class PassOrFail
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		float a[]=new float[5];
		float sum=0;
		int flag=0;
		System.out.println("Input The Marks for 5 subjects: ");
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
			sum+=a[i];
			if(a[i]<33)
				flag=-1;
		}
		if((sum/5)<40 || flag==-1)
			System.out.print("Fail");
		else
			System.out.print("Pass");
	}
}