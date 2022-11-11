package StringTask;

public class StringBufferTask 
{
 public static void main(String[] args) {
	//append()
	 StringBuffer sb=new StringBuffer("Sukhada");
	 sb.append(" Patekar");
	 System.out.println("append :" + sb);
	 
	 //insert
	 StringBuffer sb1=new StringBuffer("Sukhada");	 
	 sb1.insert(2, "VARNA");
	 System.out.println("insert : " + sb1);
	 
	 //replace
	 StringBuffer sb3=new StringBuffer("Sukhada");
	 sb3.replace(2, 5, "ABC");
	 System.out.println("replace :"+ sb3);
	 
	 //delete
	 StringBuffer sb4=new StringBuffer("Sukhada");
	 sb4.delete(3, 6);
	 System.out.println("delete :" + sb4);
	 
	 //reverse
	 StringBuffer sb5=new StringBuffer("Sukhada");
	 sb5.reverse();
	 System.out.println("reverse :" + sb5);
	 
	 //capacity
	 StringBuffer sb6=new StringBuffer();
	 
	 System.out.println("capacity :" + sb6.capacity());
	 
	 sb6.append("Hi");
	 System.out.println("capacity 1 :" + sb6.capacity());
	 
	 sb6.append("i am sukhada and i kno java");
     System.out.println("capacity 2 :" + sb6.capacity());
     
     
     
}
}
