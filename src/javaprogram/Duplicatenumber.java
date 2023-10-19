package javaprogram;

public class Duplicatenumber 
{
	public static void main(String[] args) 
	{
		int [] arr= {1,2,2,1,2,3,4,2,1,3};
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = i+1; j < arr.length; j++) 
			{
				if (arr[j]==arr[i])
				{
					arr[j]=123;
				}
			}
		}
		for (int k = 0; k < arr.length; k++)
		{
			if(arr[k]!=123)
			{
				System.out.println(arr[k]);
			}
		}
	}
}
