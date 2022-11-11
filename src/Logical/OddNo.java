package Logical;

import java.util.Scanner;

public class OddNo 
{
 public static void main(String[] args) {
	
	  Scanner sc=new Scanner(System.in);
	  int i=sc.nextInt();
	  
	  if(i%2 != 0)
	  {
		  System.out.println("Odd no" );
	  }
	  else
	  {
		  System.out.println("Not an odd no.");
	  }
}
}
