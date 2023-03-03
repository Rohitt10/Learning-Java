import java.util.Scanner;
class DetectDoubTripSpaces
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s;
		System.out.print("Input any String:  ");
		s=sc.nextLine();
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
				count++;
		}
		if(count==2 || count==3)
			System.out.print("Double or Triple space Detected");
		else
			System.out.print("No Double or Triple Spaces detected");
	}
}