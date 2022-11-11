package StringTask;

public class A 
{
  public static void main(String[] args) 
  {
	  //By String literal
	String s= "Sukhada";
	System.out.println("s :" + s);
	
	//here jvm will not create any new object memory for this becz it contains same string value. ie "sukhada"
	String s1="sukhada";
	String s2="sukhada";
	System.out.println("s1 :" +s1);
	System.out.println("s2 :" +s2); 
	
	 //By new keyword
	//here jvm will create new  memory for every object in heap memo
	
	String s3=new String("spp");
	String s4=new String("spp");
	String s5=new String("spp");
	System.out.println(s3);
	System.out.println(s4);
	System.out.println(s5);
	
	//by using char
	char[] ch= {'s','u','k','h'};
	String sukh=new String(ch);
	System.out.println(sukh);
}
}
