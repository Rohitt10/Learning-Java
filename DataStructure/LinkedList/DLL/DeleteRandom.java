import java.util.Scanner;
class DeleteRandom
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
		System.out.print("Enter no of elements: ");
		int n=sc.nextInt();
		System.out.print("Enter the elements\n");
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
	public void deleteR()
	{
		if(head==null)
		{
			System.out.println("Empty");
			return;
		}
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the index: ");
		int index=sc.nextInt();
		Node n=head;
		Node prev=n;
		for(int i=0;i<index;i++)
		{
			prev=n;
			n=n.next;
		}
		prev.next=n.next;
		Node temp=n.next;
		temp.pre=prev;
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
		DeleteRandom obj=new DeleteRandom();
		obj.create();
		obj.deleteR();
		obj.display();
	}
}