package TestNG;

import org.testng.annotations.Test;

public class Prioritytesting {
	
	
	@Test(priority = 0)
	public void testcase1() {
		
		
		System.out.println("Testcase1 executed successfully");
	}
	
	
	@Test(priority = 2)
	public void testcase2() {
		
		
		System.out.println("Testcase2 executed successfully");
	}
	
	
	@Test(priority = 1)
	public void testcase3() {
	
	
	System.out.println("Testcase3 executed successfully");
}

}
