package constructorpackage;

public class Test {
	
	
	public Test()
	{
		System.out.println("Testing phase 1");
	}
	
	String name;
	String rollNum;
	
	
	public Test(String name, String rollNum)
	{
		this.name=name;
		this.rollNum=rollNum;
		
	}
	
	public static void main(String[] args) {
		
		
		Test t= new Test("Preeti","123");
		System.out.println(t.name);
		System.out.println(t.rollNum);
		
		
	}
		
	

}

