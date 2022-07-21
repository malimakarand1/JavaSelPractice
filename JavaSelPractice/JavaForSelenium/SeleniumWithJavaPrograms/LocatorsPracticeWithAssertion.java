package SeleniumWithJavaPrograms;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LocatorsPracticeWithAssertion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String uname="Shree";
		System.setProperty("webdriver.chrome.driver", "C:\\mywebdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(uname);
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.name("chkboxOne")).click();
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(3000); //tagname("p") works when you add thread.sleep because it take time to load the tags
		//System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		String username=driver.findElement(By.xpath("//div/h2")).getText();
		System.out.println(username);
		Assert.assertEquals(username,"Hello "+uname+",");
		System.out.println(uname);
		driver.findElement(By.xpath("//div/button[@class='logout-btn']")).click();
		//driver.close();
		}

}
