package Rohit.bc;
interface Camera
{
	void print();
}
interface MusicPlayer
{
	void show();
}
class SmartPhone implements Camera,MusicPlayer
{
	public void show()
	{
		System.out.println("Music");
	}
	public void print()
	{
		System.out.println("Camera");
	}
}
class MultiInterface
{
	public static void main(String[] args)
	{
		SmartPhone realme=new SmartPhone();
		realme.show();
		realme.print();
	}
}