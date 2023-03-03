import java.util.Scanner;
class InsertRandom
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
		System.out.print("Enter no of Elements: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter the Elements");
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
	public void insertR()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the index:");
		int index=sc.nextInt();
		System.out.print("Enter the data: ");
		int data=sc.nextInt();
		Node newNode=new Node(data);
		if(index==0)
		{
			newNode.next=head;
			head.pre=newNode;
			head=newNode;
		}
		Node n=head;
		Node prev=n;
		for(int i=0;i<index;i++)
		{
			prev=n;
			n=n.next;
		}
		prev.next=newNode;
		newNode.pre=prev;
		newNode.next=n;
		n.pre=newNode;
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
		InsertRandom obj=new InsertRandom();
		obj.create();
		obj.insertR();
		obj.display();
	}
}