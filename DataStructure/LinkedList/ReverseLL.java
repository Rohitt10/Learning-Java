import java.util.Scanner;
class ReverseLL
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
	Node head=null;
	public void create()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no of elements: ");
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
			}
		}
	}
	public void rList()
	{
		Node n=head;
		Node pre=null;
		Node f=n;
		while(n.next!=null)
		{
			f=n.next;
			n.next=pre;
			pre=n;
			n=f;
		}
		n.next=pre;
		head=n;
	}
	public void display()
	{
		Node n=head;
		while(n!=null)
		{
			System.out.print(n.data+" ");
			n=n.next;
		}
		System.out.println();
	}
	public static void main(String[] args)
	{
		ReverseLL obj=new ReverseLL();
		obj.create();
		obj.rList();
		obj.display();
	}
}