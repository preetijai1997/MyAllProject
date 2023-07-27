package Settlement;

import java.util.ArrayList;
import java.util.List;

public class successMeassage {
	
	private String messageSuccess;

	public successMeassage(String messageSuccess) {
		
		this.messageSuccess = messageSuccess;
	}

	public String getMessageSuccess() {
		return messageSuccess;
	}

	public void setMessageSuccess(String messageSuccess) {
		this.messageSuccess = messageSuccess;
	}
	
	public List<String> getAccountNumberList()
	{
		List<String> AccountNumberList= new ArrayList<>();
		AccountNumberList.add("51234567890");
		AccountNumberList.add("41234567890");
		return AccountNumberList;
	

	}
}
