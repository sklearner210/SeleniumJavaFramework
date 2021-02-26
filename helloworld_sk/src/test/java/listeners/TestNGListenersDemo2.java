package listeners;

import org.junit.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class TestNGListenersDemo2 {

	@Test(priority = 0)
	public void Test4() {
		System.out.println("Im inside Test 4");
		
	}
	

	@Test(priority = -1)
	public void Test5() {
		System.out.println("Im inside Test 5");
		//Assert.assertTrue(false);
		
	}
	

	@Test(priority = 1)
	public void Test6() {
		System.out.println("Im inside Test 6");
		throw new SkipException("This is skipped");
		
	}
}
