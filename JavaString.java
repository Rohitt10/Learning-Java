import java.util.*;
import java.lang.*;
class JavaString
{
	public static void main(String[] args)
	{
		String s1="Rohit";
		String s2=new String("Shivam");
		char[] c={'D','e','e','p'};
		String s3=new String(c);
		System.out.println(s1+"\n"+s2+"\n"+s3);
		System.out.println(s1.equals(s2));
		System.out.println(s2.length());
		System.out.println(s3.toUpperCase());
		System.out.println(s2.toLowerCase());
		System.out.println(s1.indexOf('o'));
		System.out.println(s1.startsWith("R"));
	}
}
		