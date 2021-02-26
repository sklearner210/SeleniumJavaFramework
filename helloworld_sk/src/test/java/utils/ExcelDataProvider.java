package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import config.PropertiesFile;

public class ExcelDataProvider {

	WebDriver driver = null;

	@BeforeTest
	public void setUp() {
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		PropertiesFile.getProperties();

		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
	}


	@Test(dataProvider = "test1data")
	public void test1(String Username, String Password) throws Exception {

//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(Username+" | "+Password);

		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys(Username);
		driver.findElement(By.id("divPassword")).sendKeys(Password);
		Thread.sleep(2000);
		//driver.findElement(By.id("btnLogin")).sendKeys(Keys, RETURN);

	}

	@DataProvider(name = "test1data")
	public static Object[][] getData() {
		String excelPath = "C:\\Users\\SravankumarTalishett\\JavaProject\\helloworld_sk\\excel\\data.xlsx";
		Object data[][] = testData(excelPath, "Sheet1");
		return data;
	}


	public static Object[][] testData(String excelPath, String sheetName) {
		ExcelUtils excel = new ExcelUtils(excelPath, sheetName);
		int rowCount = excel.getRowCount();
		int colCount = excel.getColCount();

		Object data[][] = new Object[rowCount-1][colCount];

		for(int i=1; i<rowCount; i++) {
			for(int j=0; j<colCount; j++) {

				String cellData = ExcelUtils.getCellDataString(i, j);
				//System.out.print(cellData+" | ");
				data[i-1][j] = cellData;
			}
			//System.out.println();
		}
		return data;
	}

}
