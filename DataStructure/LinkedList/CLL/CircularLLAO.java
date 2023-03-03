import java.util.Scanner;
class CircularLLAO
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
				newNode.next=head;
			}
		}
	}
	public void insertB()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the data: ");
		int data=sc.nextInt();
		Node newNode=new Node(data);
		newNode.next=head;
		head=newNode;
		Node n=head;
		while(n.next!=head.next)
			n=n.next;
		n.next=head;
	}
	public void insertE()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the data: ");
		int data=sc.nextInt();
		Node newNode=new Node(data);
		Node n=head;
		while(n.next!=head)
			n=n.next;
		n.next=newNode;
		newNode.next=head;
	}
	public void insertR()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the index: ");
		int index=sc.nextInt();
		System.out.print("Enter the data: ");
		int data=sc.nextInt();
		Node newNode=new Node(data);
		Node n=head;
		Node pre=n;
		if(index==0)
		{
			newNode.next=head;
	    	head=newNode;
		    Node n=head;
	    	while(n.next!=head.next)
	    		n=n.next;
	    	n.next=head;
			return;
		}
		for(int i=0;i<index;i++)
		{
			pre=n;
			n=n.next;
		}
		pre.next=newNode;
		newNode.next=n;
	}ccc
		
	public void display()
	{
		if(head==null)
			return;
		Node temp=head;
		while(temp.next!=head)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println(temp.data+" ");
	}
			
	public void insertB()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the element: ");
		int data=sc.nextInt();
		