interface Camera
{
	void takesnap();
	void recordVideo();
	default void portrait()
	{
		System.out.println("Portrait Mode");
	}
}
interface Wifi
{
	String[] getName();
	void networks(String network);
}
class CellPhone
{
	void callingNumber()
	{
		System.out.println("Calling");
	}
	void pickCall()
	{
		System.out.println("Connecting");
	}
}
class Smartphone extends CellPhone implements Camera,Wifi
{
	public void takesnap()
	{
		System.out.println("Picture Taken");
	}
	public void recordVideo()
	{
		System.out.println("Video Recording");
	}
	public String[] getName()
	{
		System.out.println("Getting list of Networks");
		String[] networklist={"Rohit","Virat","Sachin"};
		return networklist;
	}	
	public void networks(String network)
	{
		System.out.println("Connecting to: "+network);
	}
	public void portrait()
	{
		System.out.println("Picture in Portrait Mode");
	}
}
class InterfaceWithPolymorphism 
{
	public static void main(String[] args)
	{
		Camera obj1=new Smartphone();
		obj1.portrait();
		obj1.takesnap();
		obj1.recordVideo();
		
		/*String ar[]=obj1.getName();
		for (String item:ar)
		{
			System.out.println(item);
		}*/
		//Above method is not allowed since Camera reference
	} 
	