package Logical;

public class Swapping 
{
	
 public static void main(String[] args) {
	int a=3;
	int b=2;
	
	System.out.println("without using 3rd var");
	
	a= a+b;
	System.out.println(a);
	
	b=a-b;
	System.out.println("b" +  b);
	
	a=a-b;
	System.out.println("a"  + a);
    
	
}
}
