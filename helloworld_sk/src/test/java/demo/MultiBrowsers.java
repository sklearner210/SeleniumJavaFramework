package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import config.PropertiesFile;

public class MultiBrowsers {

	WebDriver driver = null;


	@BeforeTest
	@Parameters("browserName")
	public void setup(String browserName) {
		
		System.out.println("Browser Name is :"+browserName);
		System.out.println("Thread ID is :"+Thread.currentThread().getId());

		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);

		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
			driver = new ChromeDriver();
		}else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
			driver = new ChromeDriver();
		}
	}

	@Test
	public void work() throws InterruptedException {
		driver.get("https://google.com");
		Thread.sleep(4000);
	}

	@AfterTest
	public void TearDown() {
		driver.close();
		System.out.println("Successfully completed!");

	}
}
