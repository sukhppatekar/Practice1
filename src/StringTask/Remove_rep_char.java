package StringTask;

public class Remove_rep_char 
{
  public static void main(String[] args) {
	
	
			String s="sukhada";
			String s1="";
			char c=0;
			int count=0;
			for(int i=0;i<=s.length()-1;i++)   
			{
				int tempcount=0;
				for(int j=i;j<s.length();j++)
				{
					if(s.charAt(i)==s.charAt(j)) 
					{  
						tempcount++;          
						
					}
					if(tempcount>=count) 
					{
						count=tempcount;
						c=s.charAt(i);
						
					}
				}
				
				String s2=String.valueOf(c);   //convert char to string

				 s1=s.replace(s2,"");
			}
			System.out.println("Most repeated character:- "+c);
			System.out.println("New string:- "+s1);
		
	System.out.println("No of repetation:- "+count);

		}

	}


