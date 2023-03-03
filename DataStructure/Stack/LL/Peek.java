import java.util.Scanner;
class Peek
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
	public void creat()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("ENter the No of Elements: ");
		int n=sc.nextInt();
		System.out.println("Enter the Elements");
		for(int i=0;i<n;i++)
		{
			int a=sc.nextInt();
			Node newNode=new Node(a);
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
	public void peek()
	{
		System.out.print(head.data+"\n");
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
		Peek obj=new Peek();
		obj.creat();
		obj.peek();
		obj.display();
	}
}