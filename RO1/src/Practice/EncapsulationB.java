package Practice;

public class EncapsulationB {
	
	public static void main(String[] args)
	{
	Encapsulation e=new Encapsulation();
	int h=e.setHeight(30);
	int l=e.setLength(20);
	int w=e.setWidth(80);
	
	e.setBoxDimension(l, w, h);
	
	
	
	}

}
