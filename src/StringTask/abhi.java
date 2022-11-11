package StringTask;

public class abhi 
{

	public abhi()
	{
		System.out.println("abc");
	}	
	public void m1()
	{
		abhi a = new abhi();
	}
	public void m1(int x)
	{
		abhi a = new abhi();
	}
	
	
	public static void main(String[] args) {
	
	
abhi a = new abhi();
a.m1();
	
System.out.println(a);
System.out.println(a.hashCode());
System.out.println(a.hashCode());
	
	}
}
