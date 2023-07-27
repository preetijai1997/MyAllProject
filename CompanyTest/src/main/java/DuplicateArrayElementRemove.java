
public class DuplicateArrayElementRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		                  
		int[] arr= {1,2,4,1,4,3,2,1};
		
		for(int i=0;i<arr.length-1;i++)
		{
			boolean isDuplicate=false;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j] )
				{
					arr[j]=-1;
					isDuplicate=true;
					
				}
				
			}
			
			if(isDuplicate)
			{
				arr[i]=-1;
			}
		}
        for(int i=0;i<arr.length;i++)
        {
        	if(arr[i]!=-1)
        	{
        	System.out.println(arr[i]);
        	}
        }
	}

}
