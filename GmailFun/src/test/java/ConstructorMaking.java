

class Bankit
{
	
	String empName;
	String companyName;
	int empID;
	double Sal;
	
	Bankit(int empID)
	{
		this.empID=empID;
	}
	
	Bankit(int empID, String empName)
	{
		this.empID=empID;
		this.empName=empName;
	}
	
	Bankit(int empID, String empName, double Sal)
	{
		this.empID=empID;
		this.empName=empName;
		this.Sal=Sal;
	}
	
	Bankit(int empID, String empName, double Sal, String companyName)
	{
		this.empID=empID;
		this.empName=empName;
		this.Sal=Sal;
		this.companyName=companyName;
	}
	
}
public class ConstructorMaking {

	public static void main(String[] args) {
		Bankit b1= new Bankit(1, "Preeti",67000.9,"Bankit Services");
		Bankit b2= new Bankit(2, "Somya");
		Bankit b3= new Bankit(3,"Vindresh",1000000);
		Bankit b4= new Bankit(4);
		
		EmpDetails(b1);
		EmpDetails(b2);
		EmpDetails(b3);
		EmpDetails(b4);

	}

	
	public static void EmpDetails(Bankit b)
	{
		System.out.println(b.empID+ " "+ b.empName+" "+ b.Sal+ " "+b.companyName);
	}
}
