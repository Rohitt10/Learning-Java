import java.util.Scanner;
class CLDeleteEnd
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
		System.out.println("Enter the elements");
		while(n-->0)
		{
			int data=sc.nextInt();
			Node newNode=new Node(data);
			if(tail==null)
			{
				tail=newNode;
				tail.next=newNode;
			}
			else
			{
				newNode.next=tail.next;
				tail.next=newNode;
				tail=tail.next;
			}
		}
	}
	public void deleteE()
	{
		if(tail==null)
		{
			System.out.println("Empty Queue\nDeletion not possible");
			return;
		}
		else if(tail.next==tail)
		{
			System.out.println(tail.data+" deleted");
			tail=null;
			return;
		}
		Node c=tail.next;
		Node pre=c;
		while(c.next!=tail.next)
		{
			pre=c;
			c=c.next;
		}
		System.out.println(c.data+" deleted");
		pre.next=c.next;
		tail=pre;
	}
	public void display()
	{
		if(tail==null)
			System.out.println("Empty Queue");
		else
		{
			Node n=tail.next;
			while(n.next!=tail.next)
			{
				System.out.print(n.data+" ");
				n=n.next;
			}
			System.out.println(n.data);
		}
	}
	public static void main(String[] args)
	{
		CLDeleteEnd obj=new CLDeleteEnd();
		obj.create();
		obj.deleteE();
		obj.display();
	}
}