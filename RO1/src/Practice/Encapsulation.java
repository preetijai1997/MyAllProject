package Practice;

public class Encapsulation {
	
	private int length=10;
	private int width=20;
	private int height=40;

	public void setBoxDimension(int l, int b, int h)
	{
		System.out.println("Dimension of Box is :"+ l+" "+b+" "+h);
	}
	
	public int setLength(int l)
	{
		length=l;
		return length;
	}
	
	public int setWidth(int w)
	{
		width=w;
		return width;
	}
	
	public int setHeight(int h)
	{
		height=h;
		return height;
	}
	
	public int getLength()
	{
		return length;
	}
	
	public int getHeight()
	{
		return height;
	}
	
	public int getWidth()
	{
		return width;
	}
	
}
