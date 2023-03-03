import java.util.Scanner;
class AllOperations
{
	class Node
	{
		int data;
		Node next;
		public Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	Node rear=null;
	Node front=null;
	public void enqueue()
	{
		System.out.print("Enter the Element: ");
		Scanner sc=new Scanner(System.in);
		int data=sc.nextInt();
		Node newNode=new Node(data);
		if(rear==null)
		{
			rear=newNode;
			front=rear;
		}
		else
		{
			rear.next=newNode;
			rear=newNode;
		}
	}
	public void dequeue()
	{
		if(front==null)
			System.out.print("Empty queue\nDequeue not possible\n");
		else
		{
			System.out.println(front.data+" deleted");
			if(front.next==null)
			{
				front=null;
				rear=null;
			}
			else
				front=front.next;
		}
	}
	public void peek()
	{
		if(rear==null)
			System.out.print("Empty queue\n");
		else
			System.out.println(rear.data);
	}
	public void isEmpty()
	{
		if(front==null)
			System.out.println("Empty");
		else
			System.out.println("Not Empty");
	}
	public void display()
	{
		Node n=front;
		while(n!=null)
		{
			System.out.print(n.data+" ");
			n=n.next;
		}
		System.out.println();
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		AllOperations obj=new AllOperations();
		do
		{
			System.out.print("1.Enqueue\n2.Dequeue\n3.Peek\n4.isEmpty\n5.Display\n6.Exit\nEnter your choice: ");
			int ch1=sc.nextInt();
			if(ch1==6)
				break;
			switch(ch1)
			{
				case 1:  obj.enqueue();
				         break;
				case 2:  obj.dequeue();
				         break;
				case 3:  obj.peek();
				         break;
				case 4:  obj.isEmpty();
				         break;
				case 5:  obj.display();
				         break;
				default: System.out.println("Enter correct choice");
				         break;
			}
		}while(true);
	} 
}