import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class test {
	
	
	@Test(groups= {"Smoke"})
	public void Demo() {
		System.out.println("Hello Preeti");
	}
	@Parameters({"URL"})
  @Test
  public void Demo2(String urlname)
  {
	  System.out.println("Hello Vindu");
	  System.out.println(urlname);
  }
  
  @Test(dependsOnMethods={"Demo2"})
  public void Aemo3()
  {
	  System.out.println("Hello Baby");
  }
}
