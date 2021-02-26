package listeners;

import org.junit.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class TestNGListenersDemo {

	@Test
	public void one() {
		System.out.println("Im inside Test 1");
		
	}
	

	@Test(priority = 0)
	public void two() {
		System.out.println("Im inside Test 2");
		Assert.assertTrue(false);
		
	}
	

	@Test(priority = 0)
	public void three() {
		System.out.println("Im inside Test 3");
		throw new SkipException("This is skipped");
		
	}
}
