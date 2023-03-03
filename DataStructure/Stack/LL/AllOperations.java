import java.util.Scanner;
class AllOperations
{
	class Node
	{
		int data;
		Node next;
		public Node(int data)
		{
			this.data=data;
			this.next=next;
		}
	}
	Node head=null;
	public void push()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter The element: ");
		int ele=sc.nextInt();
		Node newNode=new Node(ele);
		newNode.next=head;
		head=newNode;
	}
	public void pop()
	{
		if(head==null)
			System.out.print("Underflow\nPop Can not be performed\n");
		else
		{
			System.out.print(head.data+" deleted\n");
			head=head.next;
		}
	}
	public void peek()
	{
		if (head==null)
			System.out.print("Emepty Stack\n");
		else
			System.out.println(head.data+" ");
	}
	public boolean isEmpty()
	{
		if(head==null)
		{
			System.out.print("Empty\n");
			return true;
		}
		else
		{
			System.out.print("Not empty\n");
			return false;
		}
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
		Scanner sc=new Scanner(System.in);
		AllOperations obj=new AllOperations();
		do
		{
			System.out.print("1.Push\n2.Pop\n3.Peek\n4.isEmpty\n5.Display\n6.Exit\nEnter your choice: ");
			int ch1=sc.nextInt();
			if(ch1==6)
				break;
			switch(ch1)
			{
				case 1:
				        obj.push();
						break;
				case 2: 
				        obj.pop();
						break;
				case 3: 
				        obj.peek();
						break;
				case 4:
				        boolean c=obj.isEmpty();
						break;
				case 5:
				        obj.display();
						break;
				default:
				        System.out.print("Enter Correct Choice\n");
						break;
			}
		}while(true);
	}
}