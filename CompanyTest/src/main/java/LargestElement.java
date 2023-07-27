
public class LargestElement {

	public static void main(String[] args) {
		int [] arr1= {2,5,9,1,29};
		int max=Integer.MIN_VALUE;
		for(int e:arr1)
		{
			if(e>max)
			{
				max=e;
			}
		}
		System.out.println("Max value is: "+max);

	}

}
