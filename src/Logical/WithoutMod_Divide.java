package Logical;

public class WithoutMod_Divide 
{
  public static void main(String[] args) {
	
	  int x=3;
	  int y=10;
	  int i=0;
	  while(x*i<=y)
	  {
		  i++;
	  }
	  System.out.println("reminder : " + (y-(x*(i-1))));
	  System.out.println("quotient :" + (i-1));
 }
}
