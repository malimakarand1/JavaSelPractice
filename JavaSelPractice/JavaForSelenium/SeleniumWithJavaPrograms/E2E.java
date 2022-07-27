package SeleniumWithJavaPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class E2E {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("india");
		Thread.sleep(1000);
		List<WebElement> opt = driver.findElements(By.className("ui-menu-item"));
		for (WebElement options : opt) {
			if (options.getText().equalsIgnoreCase("India")) {
				options.click();
				break;
			}

		}
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.cssSelector("a[value='AMD']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@value='SAG'])[2]")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		
		String destdate=driver.findElement(By.id("Div1")).getAttribute("style");
		System.out.println(destdate);
		if(destdate.contains("1"))
		{
			System.out.println("Destination date is enabled");
			Assert.assertTrue(false);
			
		}
		else
		{
			System.out.println("Destination is disabled");
			Assert.assertTrue(true);
		}
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(1000);
		for(int i=1;i<5;i++)
		{
			driver.findElement(By.xpath("//div/span[@id='hrefIncAdt']")).click();
			
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		WebElement drpdwn=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select drp=new Select(drpdwn);
		drp.selectByVisibleText("INR");
		
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		

	}

}
