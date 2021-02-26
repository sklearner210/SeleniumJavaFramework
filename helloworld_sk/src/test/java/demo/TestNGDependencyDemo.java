package demo;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestNGDependencyDemo {

//depends on methods
	@Test(dependsOnMethods = {"Test2"})
	public void Test1() {
		System.out.println("This is Test 1");
	}

//priority based
	@Test(priority = 2)
	public void Test2() {
		System.out.println("This is Test 2");
	}
	
//Ignore Test Method/Class/Package 
		@Test
		@Ignore
		public void Test7() {
			System.out.println("This is Test 7");
		}
	
//groups based
	@Test(groups = {"Sanity1"})
	public void Test3() {
		System.out.println("This is Test 3");
	}
	
//depends on group with regular expression
	@Test(dependsOnGroups = {"Sanity.*"}) 
	public void Test4() {
		System.out.println("This is Test 4");
	}
	
	@Test(priority = 1)
	public void Test5() {
		System.out.println("This is Test 5");
	}
	
	@Test(groups = {"Sanity2"})
	public void Test6() {
		System.out.println("This is Test 6");
	}
	
}

