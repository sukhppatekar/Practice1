package StringTask;

public class ReverseString 
{
  public static void main(String[] args) 
  {
	
	  String s= "Sukhada";
	  String rev= " ";
	  
	  int len=s.length();
	  for(int i=len-1; i>=0;i--)
	  {
		  rev=rev+s.charAt(i);
	  }
	  System.out.println(rev);
	  
	  //2nd
//	  
//	  StringBuffer sb=new StringBuffer("Sukhada");
//	  System.out.println(sb.reverse()); 
//	  
	  //3rd
	  
	  char [] arr = new char[s.length()];
	  int j=0;
	  for(int i=s.length()-1; i>=0;i--)
	  {
		  arr[j]=s.charAt(i);
		  j++;
	  }
	  System.out.println(arr);
	  
	  
 }
  
  
  
  
}
