import java.util.Scanner;
class Push
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
		System.out.print("List Creation\nEnter no of Elements: ");
		int n=sc.nextInt();
		System.out.print("Enter the Elements\n");
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
	public void push()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Element: ");
		int ele=sc.nextInt();
		Node newNode=new Node(ele);
		newNode.next=head;
		head=newNode;
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
		Push obj=new Push();
		obj.creat();
		obj.push();
		obj.display();
	}
}