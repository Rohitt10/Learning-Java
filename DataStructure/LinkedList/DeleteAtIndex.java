import java.util.Scanner;
class DeleteAtIndex
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
	public void creatList()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Create Linked List\n");
		System.out.print("Enter no of Elements: ");
		int n=sc.nextInt();
		System.out.println("Enter The Elements");
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
				y .next=newNode;
			}
		}
	}
	public void deleteI()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter The Index: ");
		int index=sc.nextInt();
		Node n=head;
		Node pre=n;
		for(int i=0;i<index;i++)
		{
			pre=n;
			n=n.next;
		}
		System.out.println("Deleted Element: "+n.data);
		pre.next=n.next;
	}
	public void display()
	{
		Node n=head;
		System.out.println("Linked List");
		while(n!=null)
		{
			System.out.print(n.data+" ");
			n=n.next;
		}
	}
	public static void main(String[] args)
	{
		DeleteAtIndex obj=new DeleteAtIndex();
		obj.creatList();
		obj.deleteI();
		obj.display();
	}
}