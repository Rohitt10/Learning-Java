import java.util.Scanner;
class DeleteStart
{
	class Node
	{
		int data;
		Node pre,next;
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
		System.out.print("Enter the elements: ");
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
	public void deleteS()
	{
		if(head==null)
		{
			System.out.println("Empty");
			return;
		}
		System.out.println(head.data+" deleted");
		head=head.next;
		head.pre=null;
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
		DeleteStart obj=new DeleteStart();
		obj.create();
		obj.deleteS();
		obj.display();
	}
}