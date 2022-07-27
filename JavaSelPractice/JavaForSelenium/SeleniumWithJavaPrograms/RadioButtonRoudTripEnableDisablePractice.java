package SeleniumWithJavaPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtonRoudTripEnableDisablePractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@value='PNQ']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@value='AMD'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight")).click();
		
//		//fOLLOWING CODE NOT WORK DUE TO NEW TECH
//		System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
//		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
//		System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
		
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			System.out.println("it is enabled");
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}

	}

}
