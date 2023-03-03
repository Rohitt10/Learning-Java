import java.util.Scanner;
class InsertAtBeggining
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
	public Node head=null;
	public void creatList(int data)
	{
		Node newNode=new Node(data);
		if(head==null)
			head=newNode;
		else
		{
			Node n=head;
			while(n.next!=null)
				n=n.next;
			n.next=newNode;
		}
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
	public void insertB(int data)
	{
		Node newNode=new Node(data);
		newNode.next=head;
		head=newNode;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		InsertAtBeggining obj=new InsertAtBeggining();
		System.out.print("Creating Linked List\nEnter No of Elements: ");
		int n=sc.nextInt();
		System.out.println("Enter the Elements: ");
		for(int i=0;i<n;i++)
		{
			int a=sc.nextInt();
			obj.creatList(a);
		}
		System.out.print("Enter the Element to insert at Beginning: ");
		int key=sc.nextInt();
		obj.insertB(key);
		obj.display();
	}
}		