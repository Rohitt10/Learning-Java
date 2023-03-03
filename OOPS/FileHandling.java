import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
class FileHandling
{
	public static void main(String[] args)
	{
		//code to Create a New File
		//File myFile=new File("Rohit.txt");
		/*try
		{
			myFile.createNewFile();
		}
		catch(Exception e)
		{
			System.out.println("Can not Created");
			e.printStackTrace();
		}
		//code to write in a file
		try
		{
			FileWriter  fileWriter=new FileWriter("Rohit.txt");
			fileWriter.write("It is 20th October  Shivam's Birthday.Today on 20th october Messi scored two Goals");
			fileWriter.close();
		}
		catch(Exception e)
		{
			System.out.print("Can not make File");
		}*/
		File myFile=new File("Rohit.txt");
	    try
    	{
			Scanner sc=new Scanner(myFile);
	    	while(sc.hasNextLine())
	    	{
				String line=sc.nextLine();
	    		System.out.println(line);
	    	}
			sc.close();
		}
	    catch(Exception e)
    	{
	    	System.out.print("Can not read");
		    e.printStackTrace();
    	}
		File myFile1=new File("Rohit.txt");
		if(myFile.delete())
		{
			System.out.println("File Deleted");
		}
		else
		{
			System.out.print("Error Occured");
		}
	}
	
}