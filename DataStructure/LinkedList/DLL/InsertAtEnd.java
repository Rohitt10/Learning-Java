import java.util.Scanner;
class InsertAtEnd
{
	class Node
	{
		int data;
		Node next,pre;
		public Node(int data)
		{
			this.data=data;
			this.next=null;
			this.pre=null;
		}
	}
	Node head=null;
	public void create()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no of elements: ");
		int n=sc.nextInt();
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
			int data=sc.nextInt();
			Node newNode=new Node(data);
			if(head==null)
				head=newNode;
			else
			{
				Node y=head;
				while(y.next!=null)
					y=y.next;
				y.next=newNode;
				newNode.pre=y;
			}
		}
	}
	public void insertE()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the element: ");
		int data=sc.nextInt();
		Node newNode=new Node(data);
		Node n=head;
		while(n.next!=null)
			n=n.next;
		n.next=newNode;
		newNode.pre=n;
	}
	public void display()
	{
		Node n=head;
		while(n!=null)
		{
			System.out.print(n.data+" ");
			n=n.next;
		}
	}
	public static void main(String[] args)
	{
		InsertAtEnd obj=new InsertAtEnd();
		obj.create();
		obj.insertE();
		obj.display();
	}
}