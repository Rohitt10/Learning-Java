import java.util.Scanner;
class CLInsertEnd
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
		System.out.println("Enter the elements");
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
	public void insertE()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the element: ");
		int data=sc.nextInt();
		Node newNode=new Node(data);
		newNode.next=tail.next;
		tail.next=newNode;
		tail=tail.next;
	}
	public void display()
	{
		Node n=tail.next;
		while(n.next!=tail.next)
		{
			System.out.print(n.data+" ");
			n=n.next;
		}
		System.out.println(n.data+" ");
		System.out.println();
	}
	public static void main(String[] args)
	{
		CLInsertEnd obj=new CLInsertEnd();
		obj.create();
		obj.insertE();
		obj.display();
	}
	}