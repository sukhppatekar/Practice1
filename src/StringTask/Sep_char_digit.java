package StringTask;

import java.util.ArrayList;
import java.util.List;

public class Sep_char_digit 
{
    public static void main(String[] args) {
    	//int n=0;
		String s="4a3b29c3d7";
		List<Integer>l=new ArrayList<>();
		List<Character>l1=new ArrayList<>();
		for(int i=0;i<=s.length()-1;i++ )
		{
			char c=s.charAt(i);
			if(Character.isDigit(c))
			{
		   int   n=Integer.parseInt(String.valueOf(c));
		      l.add(n);
			}
			else
			{
			l1.add(c);
			}
			}
		 System.out.println(l);
		 System.out.println(l1);
    
    	
	}
}
