import java.util.Scanner;
class TaxPayment
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		float income,tax=0;	
		System.out.println("Input Your Income");
		income=sc.nextFloat();
		if(income>250000 && income<500000)
		{
			tax=(income*5)/100;
		}
		else if(income>=500000 && income<1000000)
		{
			tax=(income*20)/100;
		}
		else if(income>1000000)
		{
			tax=(income*30)/100;
		}
		System.out.print("Tax:  "+tax);
	}
}