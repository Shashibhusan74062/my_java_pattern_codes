package javaprogram;

public class SelectionSort
{
  public static int min(int a[], int i)
  {
	  int sindex=i;
	  int smallest=a[i];
	  for (int j = i+1; j < a.length; j++)
	  {
		if(smallest>a[j])
		{
			smallest=a[j];
			sindex=j;
		}
	  }
	  return sindex;
  }
  public static void main(String[] args) 
  {
	int [] a = {14,13,11,12,15};
	for (int i = 0; i < a.length; i++) 
	{
		int sindex= min(a,i);
		int t= a[i];
		a[i]=a[sindex];
		a[sindex]=t;
	}
	for (int i = 0; i < a.length; i++)
	{
		System.out.println(a[i]);
		
	}
  }
}
