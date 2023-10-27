package test;

public class arrays {


	public static void main(String[] args)
	{
		
		
		int[] a= {1,2,3,4,5,7};
		
		int sum1=0,sum2=0;
		for(int i=0;i<a.length;i++ )
		{
			sum1=sum1+a[i];
		}
		System.out.println(sum1);
		
	   for(int i=7;i>=1;i--)
	   {
		   sum2=sum2+i;
	   }
	   System.out.println(sum2);
	   System.out.println(sum2-sum1);
		
	}

		

	

}
