package StringTask;

public class StringSplit {
  
	public static void main(String[] args) {
		String s="Hello world";
		String [] splits =s.split(" ");
		
		for(String s1:splits)
		{
			System.out.println(s1);
		}
	}
}
