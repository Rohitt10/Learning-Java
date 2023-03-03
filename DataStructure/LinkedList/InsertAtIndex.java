import java.util.Scanner;
class InsertAtIndex
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
	public void creatList()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter The no of Elements: ");
		int size=sc.nextInt();
		System.out.println("Enter The Elements");
		for(int i=0;i<size;i++)
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
	public void insertI(int data)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Index");
		int index=sc.nextInt();
		Node newNode=new Node(data);
		Node n=head;
		Node pre=n;
		for(int i=0;i<index;i++)
		{
			pre=n;
			n=n.next;
		}
		newNode.next=pre.next;
		pre.next=newNode;
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
		Scanner sc=new Scanner(System.in);
		InsertAtIndex obj=new InsertAtIndex();
		obj.creatList();
		System.out.print("Enter The data to insert at Index: ");
		int key=sc.nextInt();
		obj.insertI(key);
		obj.display();
	}
}