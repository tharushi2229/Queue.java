class Node {
    int data;
    Node next;
    public Node(int d) {
        data = d;
        next = null;
    }
}
class QueuellistADT{
	Node front;
	Node rear;
	
	public QueuellistADT()
	{
		this.front=null;
		this.rear=null;
	}
	public boolean isEmpty()
	{
		if(front==null)
		{
			return true;
		}
		return false;
	}
	public void enQueue(int val)
	{
		Node newNode=new Node(val);
		if(isEmpty())
		{
			front=newNode;
			rear=newNode;
		}
		else
		{
			rear.next=newNode;
			rear=newNode;
		}
			
	}
	public void deQueue()
	{
		if(isEmpty())
		{
			throw new IllegalStateException ("Queue is empty");
		}
		int data =front.data;
		front=front.next;
		if(front==null)
		{
			rear=null;
		}
		System.out.println("Dequeue data is "+data);
	}
	
	public void Display()
	{
		Node current = front;
        while (current != null) 
		{
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
	}
	public int peek()
	{
		if(front==null)
		{
			throw new IllegalStateException ("Queue is empty");
		}
		return front.data;
	}
}
public class Queuellist
{
	public static void main(String args[])
	{
		QueuellistADT q1=new QueuellistADT();
		q1.enQueue(1);//insert 1st ele to Queue
		q1.enQueue(2);//insert 2nd ele to Queue
		q1.enQueue(3);//insert 3rd ele to Queue
		q1.enQueue(4);//insert 4th ele to Queue
		
		q1.Display();//output -> 1 2 3 4 
		q1.deQueue();//delete elemant
		
		q1.Display();//2 3 4 
		q1.deQueue();//delete elemant
		
		q1.Display();//3 4
		q1.deQueue();//delete elemant
		q1.Display();//4
		q1.deQueue();//delete elemant
		q1.Display();//empty
		q1.enQueue(1);
		q1.enQueue(2);
		q1.Display();//1 2 
		
		
	}
}