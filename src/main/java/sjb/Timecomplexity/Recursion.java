package sjb.Timecomplexity;
//recursion means calling same functions again and again by itself
public class Recursion
{
	public static int fact(int n)
	{
		if(n==0||n==1)//base case means stop
		{
			return 1;
			
		}
		return n*fact(n-1);//recursion case
	}
	public static void main(String[] args) 
	{
		System.out.println(fact(3));
	}
}
