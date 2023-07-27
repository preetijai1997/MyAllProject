package Enum;

public enum AccountVerifi
{
	ACCOUNT_VERIFIICATION("Account verification");
	
	
	private String value;
	
	 AccountVerifi(String val)
	{
		this.value=val;
	}
	
	
	public String  getValue()
	{
		return this.value;
	}
	
}

