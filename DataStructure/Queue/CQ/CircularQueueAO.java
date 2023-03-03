import java.util.Scanner;
class CircularQueueAO
{
	static int front=-1;
	static int rear=-1;
	final static int MAX=5;
	public void enqueue(int[] a)
	{
		if((front==0 && rear==MAX-1)||(rear<front && rear+1==front))
			System.out.print("Queue full\nEnqueue not possible\n");
		else
		{
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter the element: ");
			int ele=sc.nextInt();
			if(rear==MAX-1 && front>0)
			{
				rear=0;
				a[rear]=ele;
			}
			else if(rear==-1)
			{
				rear=0;
				front=0;
				a[rear]=ele;
			}
			else
				a[++rear]=ele;
		}
	}
	public void dequeue(int[] a)
	{
		if(front==-1)
			System.out.println("Queue Empty\nDequeue not possible");
		else
		{
			System.out.print(a[front]+" deleted\n");
			if(front==MAX-1 && rear!=front)
				front=0;
			else if(front==rear)
			{
				front=-1;
				rear=-1;
			}
			else
				front++;
		}
	}
	public void peek(int[] a)
	{
		if(rear==-1)
			System.out.println("Empty Queue");
		else
			System.out.println(a[rear]);
	}
	public void isEmpty()
	{
		if(rear==-1)
			System.out.println("Queue is Empty");
		else
			System.out.println("Not empty");
	}
	public void isFull()
	{
		if((rear<front && rear+1==front)||(rear==MAX-1 && front==0))
			System.out.println("Queue is full");
		else
			System.out.println("Not full");
	}
	public void display(int[] a)
	{
		if(rear>=front)
		{
			for(int i=front;i<=rear;i++)
			{
				if(rear==-1)
					break;
				System.out.print(a[i]+" ");
			}
		}
		else
		{
			for(int i=front;i<MAX;i++)
				System.out.print(a[i]+" ");
			for(int i=0;i<=rear;i++)
				System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		CircularQueueAO obj=new CircularQueueAO();
		int[] a=new int[MAX];
		do
		{
			System.out.print("1.Enqueue\n2.Dequeue\n3.Peek\n4.isEmpty\n5.isFull\n6.Display\n7.Exit\nEnter your choice: ");
			int ch1=sc.nextInt();
			if(ch1==7)
				break;
			switch(ch1)
			{
				case 1:  obj.enqueue(a);
				         break;
				case 2:  obj.dequeue(a);
				         break;
				case 3:  obj.peek(a);
				         break;
				case 4:  obj.isEmpty();
				         break;
				case 5:  obj.isFull();
				         break;
				case 6:  obj.display(a);
				         break;
				default: System.out.println("Enter correct choice");
				         break;
			}
		}while(true);
	}
}