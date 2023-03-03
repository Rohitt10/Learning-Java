  package Rohit.bc;
  interface Button
  {
	  public void switchOn();
  }
  class Tv implements Button
  {
	  int r;
	  String p;
	  public Tv()
	  {
		  r=14;
		  p="Tv Remote";
	  }
	  public void switchOn()
	  {
		  System.out.println("Tv Switched On");
	  }
	  public void display()
	  {
		  System.out.println(p);
		  System.out.println("Total Buttons:  "+r);
	  }
  }
  class Interface001
  {
	  public static void main(String[] args)
	  {
		  Button obj1=new Tv();
	      obj1.switchOn();
    	  Tv obj2=new Tv();
    	  obj2.display();
    	  obj2.switchOn();
	  }
  }
  
	  
  