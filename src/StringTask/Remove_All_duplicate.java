package StringTask;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Remove_All_duplicate {
 public static void main(String[] args) {
	String s="Sukahhadha";
	char[] c= s.toCharArray();
	
	Set unique=new HashSet();
	Set duplicate=new HashSet();
	
	for(int i=0; i<=c.length-1; i++)
	{
		if(!unique.add(c[i]))
		{
			duplicate.add(c[i]);
		}
	}
	System.out.println(unique);
	System.out.println(duplicate);
}
}
