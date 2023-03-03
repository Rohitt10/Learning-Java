import java.util.Scanner;
class Student
{
  private String name;
  private int id;
  public void setName()
  {
    System.out.print("Enter your Name");
	Scanner sc=new Scanner(System.in);
	name=sc.nextLine();
  }
  public String getName()
  {
    return name;
  }
    
  public void setId()
  {
	System.out.print("Enter Your Roll no: ");
	Scanner sc=new Scanner(System.in);
	id=sc.nextInt();
  }
  public int getId()
  {
    return id;
  }
}
class Obj1
{
	public static void main(String[] args)
	{
		Student s=new  Student();
		s.setName();
    	s.setId();
    	System.out.println(s.getName());
    	System.out.print(s.getId());
	}
}