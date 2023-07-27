import org.testng.ITestContext;
import org.testng.annotations.Test;

public class P_ITextContext {
	
	@Test(priority=1)
	public void setUp(ITestContext context)
	{
		System.out.println("This is setup foe new course");
		context.setAttribute("JAVA", "This is core java lecture");
	}
	
	@Test(priority=2, dependsOnMethods="setUp")
	public void beautyOfCourse(ITestContext context)
	{
		System.out.println("On this section define the course content");
		String courseName=(String)context.getAttribute("JAVA");
		System.out.println("Course name is:"+ courseName);
		context.setAttribute("Selenium", "JAVA + Selenium");
	}
	
	@Test(priority=3, dependsOnMethods= {"setUp","beautyOfCourse"})
	public void endCourse(ITestContext context)
    {
		System.out.println("This is the end of the course");
		String endCourse=(String)context.getAttribute("JAVA");
		System.out.println("This is last content of "+ endCourse);
		
		String courseName=(String)context.getAttribute("Selenium");
		System.out.println(courseName);
	}

}
