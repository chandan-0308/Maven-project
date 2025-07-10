package sjb.Timecomplexity;

public class Binarysearch
{
	public int binarysearch(int[] array,int element)
	{
		int low=0;
		int high=array.length-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(array[mid]==element)
			{
				return mid;
			}
			if(array[mid]<element)
			{
				low=mid+1;
			}
			else
			{
				high=mid-1;
			}
		}
		return -1;
	}
}
