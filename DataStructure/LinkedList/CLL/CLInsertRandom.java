import java.util.Scanner;
class CLInsertRandom
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
		System.out.println("Enter the element");
		while(n-->0)
		{
			int data=sc.nextInt();
			Node newNode=new Node(data);
			if(tail==null)
			{
				tail=newNode;
				newNode.next=tail;
				continue;
			}
			newNode.next=tail.next;
			tail.next=newNode;
			tail=tail.next;
		}
	}
	public  int length()
	{
		if(tail==null)
			return -1;
		Node n=tail;
		int count=0;
		while(n.next!=tail)
		{
			n=n.next;
			count++;
		}
		return ++count;
	}
	public void insertR()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the index: ");
		int index=sc.nextInt();
		int l=this.length();
		if(index>l)
		{
			System.out.println("Not Possible");
			return;
		}
		System.out.print("Enter the element: ");
		int data=sc.nextInt();
		Node newNode=new Node(data);
		if(index==0)
		{
			newNode.next=tail.next;
			tail.next=newNode;
		}
		else if(index==l)
		{
			newNode.next=tail.next;
			tail.next=newNode;
			tail=tail.next;
		}
		else
		{
			Node n=tail.next;
			Node pre=n;
			while(index-->0)
			{
				pre=n;
				n=n.next;
			}
			newNode.next=pre.next;
			pre.next=newNode;
		}
	}
	public void display()
	{
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
		CLInsertRandom obj=new CLInsertRandom();
		obj.create();
		obj.insertR();
		obj.display();
	}
}