package starpattern;

public class Patrn
{
	public static void main(String[] args)
	{
	 for (int i = 1; i <= 5; i++) 
	 {
		 boolean printstar=true;
		 for (int j = 1; j <= 9; j++) 
		 {
			 if(j>=6-i && j<=4+i && printstar)
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
