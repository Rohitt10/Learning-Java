import java.util.Scanner;
class CLDeleteStart
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
		System.out.print("Enter no of elements: ");
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
	public void deleteB()
	{
		if(tail==null)
		{
			System.out.println("Empty\nNot possible");
			return;
		}
		Node n=tail.next;
		System.out.println(n.data+" deleted");
		tail.next=n.next;
		n.next=null;
	}
	public void display()
	{
		if(tail==null)
		{
			System.out.println("Empty List");
			return;
		}
		Node n=tail.next;
		while(n.next!=tail.next)
		{
			System.out.print(n.data+" ");
			n=n.next;
		}
		System.out.println(n.data);
	}
	public static void main(String[] args)
	{
		CLDeleteStart obj=new CLDeleteStart();
		obj.create();
		obj.deleteB();
		obj.display();
	}
}