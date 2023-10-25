package starpattern;

public class Starpttrnfulldiamandwithspace
{
	public static void main(String[] args)
	{
		int a=6, b=4;
		for (int i = 1; i <= 9; i++) 
		{
			boolean printstar=true;
			
			if(i<6)
			{
				a--;
				b++;
			}
			else
			{
				a++;
				b--;
			}
			
			for (int j = 1; j <=9; j++) 
			{
				if(j>=a && j<=b && printstar)
				{
				System.out.print("*");
				printstar=false;
				}
				else
				{
					System.out.print(" ");
					printstar=true; 
				}
			}
			
		   System.out.println();
		   
		  
		}
		
	}
}
