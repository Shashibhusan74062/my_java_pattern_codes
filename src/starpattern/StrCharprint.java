package starpattern;

public class StrCharprint 
{
	public static void main(String[] args) 
	{
		int k=69;
		for (int i = 1; i <= 5; i++) 
		 {
			int num=k;
			 boolean printstar=true;
			 for (int j = 1; j <= 9; j++) 
			 {
				 if(j>=i && j<=10-i && printstar)
				 {
					 System.out.print((char)num);
					 num=num-1;
					 printstar=false;
				 }
				 else
				 {
					 System.out.print(" ");
					 printstar=true;
				 }
			 }
			 System.out.println();
			 k=k-1;
		}		
	}
}
