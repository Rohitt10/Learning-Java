import java.util.Scanner;
class DLLOperation
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
	Node tail=null;
	public void create()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no of elements: ");
		int n=sc.nextInt();
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
			int data=sc.nextInt();
			Node newNode=new Node(data);
			if(head==null)
			{
				head=newNode;
				tail=head;
			}
			else
			{
				tail.next=newNode;
				newNode.pre=tail;
				tail=newNode;
			}
		}
	}
	public void insertB()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the element: ");
		int data=sc.nextInt();
		Node newNode=new Node(data);
		newNode.next=head;
		head.pre=newNode;
		head=newNode;
	}
	public void insertE()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the data: ");
		int data=sc.nextInt();
		Node newNode=new Node(data);
		tail.next=newNode;
		newNode.pre=tail;
		tail=newNode;
	}
	public void insertR()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the index: ");
		int index=sc.nextInt();
		System.out.print("Enter the element: ");
		int data=sc.nextInt();
		Node newNode=new Node(data);
		if(index==0)
		{
			head.pre=newNode;
			newNode.next=head;
			head=head.pre;
			return;
		}
		Node n=head;
		Node prev=n;
		for(int i=0;i<index;i++)
		{
			prev=n;
			n=n.next;
		}
		prev.next=newNode;
		newNode.pre=prev;
		newNode.next=n;
		n.pre=newNode;
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
	public void deleteE()
	{
		if(head==null)
		{
			System.out.println("Empty");
			return;
		}
		System.out.println(tail.data+" deleted");
		tail=tail.pre;
		tail.next=null;
	}
	public void deleteR()
	{
		if(head==null)
		{
			System.out.println("Empty");
			return;
		}
		System.out.print("Enter the index: ");
		Scanner sc=new Scanner(System.in);
		int index=sc.nextInt();
		Node n=head;
		Node prev=n;
		if(index==0)
		{
			System.out.println(head.data+" deleted");
			head=head.next;
			head.pre=null;
			return;
		}
		for(int i=0;i<index;i++)
		{
			prev=n;
			n=n.next;
		}
		System.out.println(n.data+" deleted");
		prev.next=n.next;
		n.pre=null;
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
	public void displayR()
	{
		Node n=tail;
		while(n!=null)
		{
			System.out.print(n.data+" ");
			n=n.pre;
		}
		System.out.println();
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		DLLOperation obj=new DLLOperation();
		obj.create();
		do
		{
			System.out.print("1.Insert\n2.Delete\n3.Display\n4.Exit\nEnter your Choice: ");
			int ch1=sc.nextInt();
			if(ch1==4)
				break;
			switch(ch1)
			{
				case 1:  System.out.print("1.Start\n2.End\n3.Random\nEnter your choice: ");
				         int ch2=sc.nextInt();
						 switch(ch2)
						 {
							case 1:  obj.insertB();
							         break;
							case 2:  obj.insertE();
							         break;
							case 3:  obj.insertR();
							         break;									 
							default: System.out.print("Enter Correct choice\n");
							         break;
						 }
						 break;
				case 2:  System.out.print("1.Start\n2.End\n3.Random\nEnter your choice: ");
				         int ch3=sc.nextInt();
						 switch(ch3)
						 {
							 case 1:  obj.deleteS();
							          break;
							 case 2:  obj.deleteE();
							          break;
							 case 3:  obj.deleteR();
							          break;
							 default: System.out.println("Enter correct choice");
							          break;
						 }
						 break;
				case 3:  System.out.print("1.Same Order\n2.Reverse Order\nEnter your choice: ");
				         int ch4=sc.nextInt();
						 switch(ch4)
						 {
							 case 1:  obj.display();
							          break;
							 case 2:  obj.displayR();
							          break;
							 default: System.out.println("Enter correct choice: ");
							          break;
						 }
						 break;
			    default: System.out.println("Enter correct choice: ");
				         break;
			}
		}while(true);
	}
}