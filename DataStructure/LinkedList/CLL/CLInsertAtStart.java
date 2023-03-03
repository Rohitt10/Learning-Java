import java.util.Scanner;
class CLInsertAtStart
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
	Node tail=null;
	public void create()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no of Elements: ");
		int n=sc.nextInt();
		System.out.println("Enter the Elements");
		while(n-->0)
		{
			int data=sc.nextInt();
			Node newNode=new Node(data);
			if(tail==null)
			{
				tail=newNode;
				tail.next=newNode;
				continue;
			}
			newNode.next=tail.next;
			tail.next=newNode;
			tail=tail.next;
		}
	}
	public void insertB()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the element: ");
		int data=sc.nextInt();
		Node newNode=new Node(data);
		newNode.next=tail.next;
		tail.next=newNode;
	}
	public void display()
	{
		if(tail==null)
		{
			System.out.println("Empty list");
			return;
		}
		Node n=tail.next;
		while(n.next!=tail.next)
		{
			System.out.print(n.data+" ");
			n=n.next;
		}
		System.out.print(n.data);
		System.out.println();
	}
	public static void main(String[] args)
	{
		CLInsertAtStart obj=new CLInsertAtStart();
		obj.create();
		obj.insertB();
		obj.display();
	}
}
		
			