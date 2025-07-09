package sjb.dsa;

public class Stack
{
	private int[] array;
	private int size;
	private int top;
	public Stack(int size) {
		super();
		this.size = size;//size of the stack to store element
		array=new int[size];//allocates size to array
		top=-1; //indicates empty stack
	}
	public boolean isFull()
	{
		return(top==size-1);
	}
	public boolean isEmpty()
	{
		return(top==-1);
	}
	public int peek()
	{
		if(isEmpty())
		{
			System.out.println("empty");
			return -1;
		}
		else
		{
			//System.out.println(top);
			return array[top];
		
		}
	}
	public void push(int item)
	{
		if(isFull())
		{
			System.out.println("stack is full");
		}
		else
		{
			array[++top]=item;
			
		}
	}
	public int pop()
	{
		if(isEmpty())
		{
			System.out.println("stack is empty");
			return -1;
		}
		else
		{
			int item=array[top--];
			return item;
		}
	    }
	public void display()
	{
		for(int i=top;i>=0;i--)
		{
			System.out.println(array[i]);
		}
	}
	
}
