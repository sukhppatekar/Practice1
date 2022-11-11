package StringTask;

public class B 
{
   public static void main(String[] args) {
	   String s="Sachin";  
	   s=s.concat(" Tendulkar");  
	   System.out.println(s);  
	   
	   
	   String s1="Sachin";  
	   s1.concat(" Tendulkar");//concat() method appends the string at the end  
	   System.out.println(s1);//will print Sachin because strings are immutable objects  
	  
}
}
