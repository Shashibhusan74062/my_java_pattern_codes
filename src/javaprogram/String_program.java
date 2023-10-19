package javaprogram;

public class String_program 
{
	public static void main(String[] args) 
	{
		String s="hello Welcome To JunGGle";
		int upper=0;
		int lower=0;
		for (int i = 0; i < s.length(); i++) 
		{
			char c = s.charAt(i);
			if(c>65 && c<95)
			{
				upper++;
			}
			else 
			{
				lower++;
			}
		}
		System.out.println("the lower case char is:"+lower);
		System.out.println("the upper case char is:"+upper);
	}
	
	
}
