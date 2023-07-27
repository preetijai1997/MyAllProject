package interfacepackage;

public class child  implements Parent1,Parent2 {

	public void show() {
		
		System.out.println("show method");
	}
	
	public static void main(String[] args)
	{
		Parent1 c= new child();
		
		c.show();
	}

}
