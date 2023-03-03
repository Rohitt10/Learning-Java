import java.util.Scanner;
class CQUsingLL
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
		Scanner sc=new Scanner(System.in);
		System.out.print("Eneter the data\n");
		int data=sc.nextInt();
		Node newNode=new Node(data);
		if(rear==null)
		{
			rear=newNode;
			front=rear;
			rear.next=front;
		}
		else
		{
			rear=newNode
			rear.next=front;
		}
	}
	public void dequeue()
	{
		if(front==null)
			System.out.println("Empty Stack\n");
		else if(rear==front)
		{
			front=null;
			rear=front;
		}
		else
		{
			front=front.next();
			rear.next=front;
		}
	}
	public void peek()
	{
		if(front==null)
			System.out.print("Queue empty\n");
		else
			System.out.println(front.data);
	}
	public void isEmpty()
	{
		if(front==null)
			System.out.println("Empty Queue");
		else
			System.out.println("Not empty");
	}
	public void display()
	{
		Node n=front;
		while(n.next!=front)
		{
			System.out.print(n.data+" ");
			n=n.next;
		}
		System.out.println();
	}	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);