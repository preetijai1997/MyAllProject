import com.googleThreadclasses.GoogleThread;

public class GoogleTestRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Thread t1=	new GoogleThread("chrome thread","chrome");
	Thread t2=new GoogleThread("edge thread","edge");
	
	System.out.println("Thread start...");
	t1.start();
	t2.start();

	}

}
