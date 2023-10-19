package javaprogram;

public class OddEven 
{
	public static void main(String[] args) 
	{
		int [] a= {11,22,23,44,66,21};
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]%2==0)
			{
				System.out.println("print even index values:"+a[i]);
			}
			else
			{
				System.out.println("print odd index values:"+a[i]);
			}
		}
		
	}
}
