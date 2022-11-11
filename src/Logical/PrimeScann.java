package Logical;

import java.util.Scanner;

public class PrimeScann 
{
public static void main(String[] args) {
	int no;
	int count=0;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no.");
	no=sc.nextInt();
	
	for(int i=1; i<=no; i++)
	{
		if(no%i == 0)
		{
			count++;
		}	
	}
	if(count==2)
	{
		System.out.println("No is prime");
	}
	else
	{
		System.out.println("not a prime");
	}
}
}
