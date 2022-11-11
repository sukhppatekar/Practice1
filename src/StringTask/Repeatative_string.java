package StringTask;

public class Repeatative_string 
{
   public static void main(String []args)
   {
	  String s[]= {"abc", "pqr", "abc","xyz","stu", "aaa", "bbb", "bbb"}; 
	  
	 for(int i=0; i<s.length; i++)
	 {
		 for(int j=i; j<s.length-1; j++)
		 {
			 if(s[i].equals(s[j+1]))
			 {
				 System.out.println(s[i]);
			 }
		 }
		 
	 }
	  
	 
	  
   }
}
