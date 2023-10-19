package javaprogram;

public class Strrev 
{
	public static void main(String[] args) 
	{
		String str="my name is shashibhusan";
		//String [] ar=str.split("");
		String str2="";
		char chr;
		for (int i =0; i<str.length(); i++)
		{
			chr=str.charAt(i);
			str2=chr+str2;
			
			
		}
		System.out.println(str2);
	}
	
	
}
