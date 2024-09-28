class QueueADT{
	int [] Qarray;
	int max;
	int front;
	int rear;
	
	public QueueADT(int max)
	{
		this.Qarray=new int [max];
		this.max=max;
		this.front=0;
		this.rear=-1;
	}
	
	public boolean isEmpty()
	{
		if(rear==-1)
		{
			return true;
		}
		return false;
	}
	
	public boolean isFull()
	{
		if(rear==max-1)
		{
			return true;
		}
		return false;
	}
	
	public void Enqueue(int val)
	{
		if(isFull())
		{
			System.out.println("Queue is overflow.");
		}
		else
		{
			rear++;
			Qarray[rear]=val;
		}
	}
	
	public void Dequeue()
	{
		if(isEmpty())
		{
			System.out.println("Queue is underflow.");
		}
		else
		{
			int temp=Qarray[front];
			front++;
			if(front>rear)
			{
				front=0;
				rear=-1;
			}
			
			/* second method
			(int i=front;i<rear;i++)
			{
				Qarray[i]=Qarray[i+1];
			}
			rear--; */
			
		}
	}
	public void Display()
	{
		if(isEmpty())
		{
			System.out.println("Queue is empty.");
		}
		else
		{
			for(int i=front;i<=rear;i++)
			{
				System.out.print(Qarray[i]+" ");
			}
			System.out.println();
		}
	}
}
public class Queuearray
{
	public static void main(String args[])
	{
		QueueADT q1=new QueueADT(5);
		q1.Enqueue(1);//insert 1st ele to Queue
		q1.Enqueue(2);//insert 2nd ele to Queue
		q1.Enqueue(3);//insert 3rd ele to Queue
		q1.Enqueue(4);//insert 4th ele to Queue
		
		q1.Display();//output -> 1 2 3 4 
		q1.Dequeue();//delete elemant
		q1.Display();//2 3 4 
		q1.Dequeue();//delete elemant
		q1.Display();//3 4
		q1.Dequeue();//delete elemant
		q1.Display();//4
		q1.Dequeue();//delete elemant
		q1.Display();//empty
		q1.Enqueue(1);
		q1.Enqueue(2);
		q1.Display();//1 2 
		
		
	}
}