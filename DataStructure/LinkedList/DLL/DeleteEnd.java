import java.util.Scanner;
class DeleteEnd
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
	public void deleteE()
	{
		if(head==null)
		{
			System.out.println("Empty");
			return;
		}
		Node n=head;
		Node pre=n;
		while(n.next!=null)
		{
			pre=n;
			n=n.next;
		}
		System.out.println(n.data+" deleted");
		pre.next=null;
		n.pre=null;
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
		DeleteEnd obj=new DeleteEnd();
		obj.create();
		obj.deleteE();
		obj.display();
	}
}