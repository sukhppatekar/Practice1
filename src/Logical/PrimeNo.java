package Logical;

public class PrimeNo 
{
	public static void main(String args[])
	{
   int no=5;
   int count=0;
   
   for(int i=1; i<=5;i++ )
   {
	   if(no %i == 0)
	   {
		  count++;
	   }
   }
  if(count==2)
  {
	  System.out.println("Prime no");
  }
  else
  {
	  System.out.println("Not a prime no");
  }
}
}