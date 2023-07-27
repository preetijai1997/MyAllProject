
public class Fibonaaciseries {

	public static void main(String[] args) {
		int n=10, firstterm=0, secondterm=1;
		
		for(int i=1;i<=n;i++)
		{
			 System.out.print(firstterm + " ");
			int nextterm=firstterm+secondterm;
			firstterm=secondterm;
			secondterm=nextterm;
		}
	}

}
