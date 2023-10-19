package javaprogram;

public class String_reverse 
{
	public static void main(String[] args) 
	{
		String str="my name is shashibhusan";
		String [] ar=str.split("");
		String str2="";
		char chr;
		for (int i=ar.length-1; i>=0; i--) 
		{
			chr=str.charAt(i);
			str2=str2+chr;
			
			
		}
		System.out.println(str2);
	}
	
	
}
