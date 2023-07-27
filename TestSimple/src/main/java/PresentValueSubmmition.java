
public class PresentValueSubmmition {

	public static void main(String[] args) {
		
		int[] a= {1200,300,800};
		int[]b= {1000,-400,700};
		double PresentValoue=0;
		//double sum=0;
		for(int i=0; i<a.length;i++)
		{
			int R= a[i]-b[i];
			
			PresentValoue+= R/Math.pow(1+0.1,i);
			//sum=sum+PresentValoue;
		}
		System.out.println("PresentValue of sum is :"+ PresentValoue);

	}

}
