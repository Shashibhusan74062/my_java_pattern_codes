package javaprogram;

public class PowofArray
{
	public static void main(String[] args) 
	{
		int [] a= {1,2,3,4,5};
		
		for (int i = 0; i < a.length; i++) 
		{
			int result=1;
			for (int j = 1; j <a[i]; j++) 
			{
				result=result*a[i];
			}
		System.out.print(result+" ");
		}
	}
}
