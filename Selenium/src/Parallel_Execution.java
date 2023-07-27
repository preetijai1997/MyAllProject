import org.testng.annotations.Test;

public class Parallel_Execution {
	@Test(threadPoolSize=2, invocationCount=2)
	public void parallel_run_part1()
	{
		System.out.println("This is first test case"+Thread.currentThread().getId());
	}
	
	@Test
	public void parallel_run_part2()
	{
		System.out.println("This is second test case"+ Thread.currentThread().getId());
	}
	@Test
	public void parallel_run_part3()
	{
		System.out.println("This is second test case"+ Thread.currentThread().getId());
	}

}
