package starpattern;

public class Starpttrn36
{
	public static void main(String[] args)
	{
		int n=1;
		for (int i = 1; i <= 5; i++) 
		{
			
			for (int j = 1; j <=5; j++) 
			{
				if(j<=i)
				{
				System.out.print(n);
				}
				else
				{
					System.out.print(" ");
				}
			}
			
		   System.out.println();
		   n=n+1;
		  
		}
		
	}
}
