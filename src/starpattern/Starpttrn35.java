package starpattern;

public class Starpttrn35
{
	public static void main(String[] args)
	{
		
		for (int i = 1; i <= 5; i++) 
		{
			int n=1;
			for (int j = 1; j <=5; j++) 
			{
				if(j<=i)
				{
				System.out.print(n);
				 n=n+1;
				}
				else
				{
					System.out.print(" ");
				}
			}
			
		   System.out.println();
		  
		}
		
	}
}
