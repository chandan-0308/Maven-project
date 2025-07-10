package sjb.Timecomplexity;

public class Linearsearch 
{
	public int linearsearch(int[] array,int element)
	{
		for(int i=0;i<array.length;i++)
		{
			if(element==array[i])
			{
				return array[i];
			}
		}
		return -1;
	}
	       //complexity /computation
//			o(1)=bestcase
//			o(n)=worstcase
//			o(n/2)=averagecase
//			0(log n)=for binaryu searching if n is more then 0(log n)will be half of it ex o(log 4)=2 complexity
}
