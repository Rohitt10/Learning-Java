import java.util.Scanner;
class DeleteAtBeginning
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
		System.out.print("Enter no of Elements: ");
		int n=sc.nextInt();
		System.out.print("Enter The Elements\n");
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
	public void deleteB()
	{
		System.out.println("Deleted Element: "+head.data);
		head=head.next;
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
		DeleteAtBeginning obj=new DeleteAtBeginning();
		obj.creatList();
		obj.deleteB();
		obj.display();
	}
}