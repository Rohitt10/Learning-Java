import java.util.Scanner;
class Pop
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
		System.out.print("Enter the no of elements: ");
		int n=sc.nextInt();
		System.out.println("ENter the elements");
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
	public void pop()
	{
		if(head==null)
			System.out.print("Stack empty\nCan not pop\n");
		else
		{
			System.out.println(head.data+" Deleted\n");
			head=head.next;
		}
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
		Pop obj=new Pop();
		obj.creat();
		obj.pop();
		obj.display();
	}
}
	
		