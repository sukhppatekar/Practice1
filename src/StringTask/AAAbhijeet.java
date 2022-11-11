package StringTask;

public class AAAbhijeet
{
   
	private String name;
	private int rollno;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	
	
	
	public String toString()
	{
		return name+" "+rollno;
	}
	
	
	public static void main(String[] args) {
		
		
		
		AAAbhijeet a = new AAAbhijeet();
		a.setName("abhi");
		a.setRollno(1);
//		String i=1+2+" "+2+3;
//		System.out.println(i);
		
		System.out.println(a);
	}
	
	
}
