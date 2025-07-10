package sjb.Timecomplexity;

public class SelectionsortMain {

	public static void main(String[] args)
	{
		int[] array= {2,5,1,4,7,3,8,0,6};
		
		Selectionsort ss=new Selectionsort();
		int[] a=ss.selectionsort(array);
			for(int i:a)
			{
				System.out.println(i);
			} 
	}

}
