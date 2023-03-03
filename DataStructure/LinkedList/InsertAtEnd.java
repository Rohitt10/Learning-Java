import java.util.Scanner;
class InsertAtEnd
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
		System.out.print("Enter no of Elements: ");
		int size=sc.nextInt();
		System.out.println("Enter the Elemnts");
		for(int i=0;i<size;i++)
		{
			int data=sc.nextInt();
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
	}
	public void insertE(int data)
	{
		Node newNode=new Node(data);
		Node n=head;
		while(n.next!=null)
			n=n.next;
		n.next=newNode;
	}
	public void display()
	{
		Node n=head;
		System.out.print("Linked List\n");
		while(n!=null)
		{
			System.out.print(n.data+" ");
			n=n.next;
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		InsertAtEnd obj=new InsertAtEnd();
		obj.creatList();
		System.out.print("Enter Element to insert At End: ");
		int key=sc.nextInt();
		obj.insertE(key);
		obj.display();
	}
}