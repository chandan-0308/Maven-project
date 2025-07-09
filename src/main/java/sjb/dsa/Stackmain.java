package sjb.dsa;

public class Stackmain 
{
	public static void main(String[] args)
	{
		Stack s=new Stack(5);
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.display();
		// Gives stack is full
		s.push(60);
		//stack is empty
		//System.out.println(s.pop());
		
		System.out.println("Elements of stack");
		s.display();
		System.out.println("Top element of an stack:peek()");
		System.out.println(s.peek());
		System.out.println("PoP element of stack");
	    System.out.println(s.pop());
		System.out.println("Elements after PoP of element");
		s.display();
		
	}
}
	

