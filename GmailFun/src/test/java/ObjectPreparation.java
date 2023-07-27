
 class DogProperty
{
	 
	String name;
	String color;
	int numOfLeg;
	DogProperty(String name, String color, int numOfLeg)
	{
		this.name=name;
		this.color=color;
		this.numOfLeg=numOfLeg;
	}
	DogProperty(String name, String color)
	{
		this.name=name;
		this.color=color;
		//this.numOfLeg=numOfLeg;
	}
	
}
public class ObjectPreparation  {

	public static void main(String[] args) {
		
		DogProperty dg1= new DogProperty("Saggy","Brown",4);
		DogProperty dg2= new DogProperty("Pikku","Black");
	   
		DogObject(dg1);
		DogObject(dg2);
	}
	
	
	public static  void DogObject(DogProperty dog)
	{
		System.out.println(dog.name + " "+ dog.color+ " "+ dog.numOfLeg);
		
	}
	
	
	
	
}





