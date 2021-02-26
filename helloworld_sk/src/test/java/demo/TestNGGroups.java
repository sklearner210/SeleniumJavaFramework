package demo;

import org.testng.annotations.Test;

@Test(groups = {"allClassTests"})
public class TestNGGroups {

	@Test(groups = {"sanity"})
	public void Test1() {
		System.out.println("This is Test 1");
	}
	
	@Test(groups = {"sanity","smoke"})
	public void Test2() {
		System.out.println("This is Test 2");
	}
	
	@Test(groups = {"sanity", "smoke", "regression"})
	public void Test3() {
		System.out.println("This is Test 3");
	}
	
	@Test(groups = {"windows.regression"})
	public void Test4() {
		System.out.println("This is Test 4");
	}
}
