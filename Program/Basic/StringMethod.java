import java.util.Scanner;
class StringMethod
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String a,b,c;
		System.out.print("Input your Name:  ");
		a=sc.next();
		System.out.print("Input another Name:  ");
		Scanner s=new Scanner(System.in);
		b=s.nextLine();
		System.out.println("length of a="+a.length());
		System.out.println("Length of b="+b.length());
		//Strings are immutable and can not be changed
		System.out.println("Lowercase:  "+a.toLowerCase());
		System.out.println("Uppercase:  "+a.toUpperCase());
		System.out.print("Input new String:  ");
		Scanner ct=new Scanner(System.in);
		c=ct.nextLine();
		System.out.println(c+"\n"+c.trim());
		System.out.println("Substring:  "+a.substring(2));
		System.out.println("Substring b:  "+b.substring(1,8));
		System.out.println("Replace b:  "+b.replace("i","!"));
		System.out.println("Replace b:  "+b.replace("i","ii"));
		System.out.println("Starts with R for A:  "+a.startsWith("R"));
		System.out.println("Starts with R for C:  "+c.startsWith("R"));
		System.out.println("Ends with R for A:  "+a.endsWith("R"));
		System.out.println("Char at for A:   "+a.charAt(2));
		System.out.println("Index of oh for a,b,c  "+a.indexOf("oh")+" "+b.indexOf("oh")+"  "+c.indexOf("oh"));
		System.out.println("Index of with Start index  for b"+b.indexOf("i",3));
		System.out.println("Last index of for b  "+b.lastIndexOf("i"));
		System.out.println("Equality check of A with \"Rohit "+a.equals("Rohit"));
		System.out.println("Equality check of Ignoring Case for A with ROHIT: "+a.equalsIgnoreCase("ROHIT"));
	}
}