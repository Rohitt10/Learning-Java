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
			this.next=null;
		}
	}
	Node head=null;
	public void creatList()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Array Creation\nEnter no of elements: ");
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
	public void insertB(int data)
	{
		Node newNode=new Node(data);
		newNode.next=head;
		head=newNode;
	}
	public void insertE(int data)
	{
		Node newNode=new Node(data);
		Node n=head;
		while(n.next!=null)
			n=n.next;
		n.next=newNode;
	}
	public void insertI(int data)
	{
		Node newNode=new Node(data);
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter The Index: ");
		int index=sc.nextInt();
		Node n=head;
		Node pre=n;
		for(int i=0;i<index;i++)
		{
			/*if(n==null);
			{
				System.out.print("Can not be Inserted");
				break;
			}*/
			pre=n;
			n=n.next;
		}
		newNode.next=n;
		pre.next=newNode;
	}
	public void deleteB()
	{
		System.out.println("Element Deleted: "+head.data);
		head=head.next;
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
		pre.next=null;
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
			if(n==null)
			{
				System.out.print("Can not be deleted\n");
				break;
			}
			pre=n;
			n=n.next;
		}
		System.out.println("Deleted Element: "+n.data);
		pre.next=n.next;
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
		AllOperations obj= new AllOperations();
		obj.creatList();
		do
		{
			System.out.print("1.Insert\n2.Delete\n3.Display\n4.Exit\nEnter Your Choice: ");
			int ch1=sc.nextInt();
			if(ch1==4)
				break;
			switch(ch1)
			{
				case 1:
				        System.out.print("Enter The Element: ");
						int ele=sc.nextInt();
				        System.out.print("1.Insert at Beginning\n2.Insert at End\n3.Insert at Index\nEnter your Choice: ");
						int ch2=sc.nextInt();
						switch(ch2)
						{
							case 1:
							        obj.insertB(ele);
									break;
							case 2:
							        obj.insertE(ele);
									break;
							case 3:
							        obj.insertI(ele);
									break;
							default:
							        System.out.print("Enter Correct Choice\n");
									break;
						}
						break;
				case 2:
				        System.out.print("1.Delete at Beginning\n2.Delete At End\n3.Delete At Index\nEnter Your Choice: ");
						int ch3=sc.nextInt();
						switch(ch3)
						{
							case 1:
							        obj.deleteB();
									break;
							case 2:
							        obj.deleteE();
									break;
							case 3:
							        obj.deleteI();
									break;
							default:
							        System.out.print("Enter Correct Choice\n");
									break;
						}
						break;
				case 3:
				        obj.display();
						break;
				default:
				        System.out.print("Enter Correct Choice\n");
						break;
			}
		}while(true);
	}
}