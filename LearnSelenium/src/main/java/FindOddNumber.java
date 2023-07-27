
public class FindOddNumber {

	public static void main(String[] args) {
		
		int arr[]= {2,3,4,1,5,6,7,8,9,0,0,2};
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2!=0)
			{
				System.out.println("Odd number" + arr[i]);
			}
		
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println("Even Number "+arr[i]);
			}
		}

	}

}
