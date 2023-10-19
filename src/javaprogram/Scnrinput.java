package javaprogram;

import java.util.Scanner;

public class Scnrinput 
{
	public static void main(String[] args) 
	{
		System.out.println("how many element you wnt:");
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		System.out.println("entered count is:"+count);
		int [] a= new int[count];
		for(int i=0; i<count;i++)
		{
			Scanner sc1 = new Scanner(System.in);
			a[i]=sc1.nextInt();
		}
		System.out.println("entered elements are:");
		for (int j = 0; j < a.length; j++) 
		{
			System.out.println(a[j]);
		}
	}
}
