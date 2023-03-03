import java.util.Scanner;
class UserDefinedException extends Exception
{
	public UserDefinedException(String str)
	{
		super(str);
	}
}
class TestThrow
{
	public static void main(String[] args)
	{
		System.out.print("Enter your Age: ");
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		try
		{
			if(age>0)
				System.out.println("Welcome");
			else
			throw new UserDefinedException("Age can not be negative");
		}
		catch(UserDefinedException e)
		{
			System.out.println("Caught the Exception");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}