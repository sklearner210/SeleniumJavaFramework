package demo;

import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParametersDemo {

	
	@Test
	@Parameters({"name"})
	public void Test1(@Optional("Sravan") String name) {
		System.out.println("Name  is : "+name);
	}
	
	@Test(retryAnalyzer=listeners.RetryAnalyzer.class)
	public void Test2() {
		System.out.println("This is Test 2");
		Assert.assertTrue(false);
	}
}
