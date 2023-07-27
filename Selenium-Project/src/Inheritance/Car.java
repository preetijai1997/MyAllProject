package Inheritance;

public class Car extends InheritanceVehicle {

	public static void main(String[] args) {
	
		Car ca=new Car();
		ca.Start();
		ca.stop();
}

	public void speed()
	{
		System.out.println("Speed is: 200");
	}
}
