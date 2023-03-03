import java.util.*;
class Student
{
	int  rollNo;
	String name;
	public Student()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter roll no: ");
		this.rollNo=sc.nextInt();
		System.out.print("Enter Name: ");
		this.name=sc.next();
	}
}
class Boys extends Student 
{
	String hostelName;
	public Boys()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter hostel name: ");
		hostelName=sc.next();
	}
	public void show()
	{
		System.out.println(this.name+"\n"+this.rollNo+"\n"+this.hostelName);
	}
}
class JCInheritance
{
	public static void main(String[] args)
	{
		Boys obj=new Boys();
		obj.show();
	}
}
		
