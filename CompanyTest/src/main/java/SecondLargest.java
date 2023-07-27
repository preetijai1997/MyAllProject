
public class SecondLargest {

	
		public static int secondLargest()
		{
			int fmax=0 , smax=0;
			int[] arr= {22,27,97,48,57};
			fmax=arr[0];
			smax=arr[0];
			for(int i=1;i<arr.length;i++)
			{
				if(fmax<arr[i])
				{
					smax=fmax;
					fmax=arr[i];
					
				}
				else if(smax<arr[i])
				{
					smax=arr[i];
					
				}
			}
			
return smax;

		}
	}


