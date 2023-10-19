package javaprogram;

public class SumofArray 
{
	public static void main(String[] args) 
	{
//		int [] a= {11,22,23,44,55};
//		int sum=0;
//		for (int i = 0; i < a.length; i++) 
//		{
//			if(a[i]%2==0)
//			{
//			
//			sum=sum+a[i];
//			}
//		}
		//System.out.println(sum);
		
		int [] a= {11,22,23,44,55};
		int sum=0;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]%2==1)
			{
			
			sum=sum+a[i];
			}
		}
		System.out.println(sum);
	}
}
