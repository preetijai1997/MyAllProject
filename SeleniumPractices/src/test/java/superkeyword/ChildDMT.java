package superkeyword;

public class ChildDMT extends DMT {
	
	
	
	public ChildDMT(String Status)
	{
		System.out.println("ChildDmt Constructor");
	}
	
	
	public void TransactionInitiate(String Status)
	{
		super.TransactionInitiate();
		System.out.println("Payment pending");
	}

}
