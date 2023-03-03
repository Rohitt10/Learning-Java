import java.util.Scanner;
class AllOperations
{
	static int front=-1;
	static int rear=-1;
	final static int MAX=4;
	public void enqueue(int[] a)
	{
		if(rear>=MAX-1)
			System.out.println("Queue is full\nEnqueue not possible");
		else 
		{
			System.out.print("Enter the element: ");
			Scanner sc=new Scanner(System.in);
			int data=sc.nextInt();
			if(rear==-1)
    		{
	    		front=0;
	    		rear=0;
	    		a[rear]=data;
	    	}
			else
				a[++rear]=data;
		}
	}
	public void dequeue(int[] a)
	{
		if(front==rear && front!=-1)
		{
			System.out.println(a[front]+" deleted");
			front=-1;
			rear=-1;
		}
		else if(front==-1)
			System.out.println("Empty Queue\nDequeue not possible");
		else
			System.out.print(a[front++]+" deleted\n");
	}
	public void peek(int[] a)
	{
		if(rear==-1)
			System.out.println("Empty Queue");
		else
			System.out.println(a[rear]+" last element");
	}
	public void isEmpty()
	{
		if(front==-1)
			System.out.print("Empty\n");
		else
			System.out.print("Not Empty\n");
	}
	public void isFull()
	{
		if(rear>=MAX-1)
			System.out.println("Full");
		else
			System.out.println("Not full");
	}
	public void display(int[]a)
	{
		for(int i=front;i<=rear;i++)
		{
			if(front==-1)
				break;
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		AllOperations obj=new AllOperations();
		int[] a=new int[MAX];
		do
		{
			System.out.print("1.Enqueue\n2.Dequeue\n3.Peek\n4.isEmpty\n5.isFull\n6.Display\n7.Exit\nEnter your choice: ");
			int ch1=sc.nextInt();
			if(ch1==7)
				break;
			switch(ch1)
			{
				case 1: obj.enqueue(a);
				        break;
				case 2: obj.dequeue(a);
				        break;
				case 3: obj.peek(a);
				        break;
				case 4: obj.isEmpty();
				        break;
				case 5: obj.isFull();
				        break;
				case 6: obj.display(a);
				        break;
				default:System.out.println("Enter correct choice");
				        break;
			}
		}while(true);
	}
}