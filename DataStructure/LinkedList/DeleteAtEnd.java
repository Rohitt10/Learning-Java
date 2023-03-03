import java.util.Scanner;
class DeleteAtEnd
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
		System.out.println("Creat Linked List");
		System.out.print("Enter No of Elements: ");
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
				y.next=newNode;
			}
		}
	}
	public void deleteE()
	{
		Node n=head;
		Node pre=n;
		while(n.next!=null)
		{
			pre=n;
			n=n.next;
		}
		System.out.println("Deleted Element: "+n.data);
		pre.next=null;
	}
	public void display()
	{
		Node n=head;
		while(n!=null)
		{
			System.out.print(n.data+" ");
			n=n.next;
		}
	}
	public static void main(String[] args)
	{
		DeleteAtEnd obj=new DeleteAtEnd();
		obj.creatList();
		obj.deleteE();
		obj.display();
	}
}