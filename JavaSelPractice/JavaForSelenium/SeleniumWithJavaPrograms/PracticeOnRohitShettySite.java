package SeleniumWithJavaPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeOnRohitShettySite {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\mywebdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		Thread.sleep(1000);
		driver.findElement(By.name("inputPassword")).sendKeys("Rahul123");
		Thread.sleep(1000);
		driver.findElement(By.name("chkboxOne")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/form/div[2]/a")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//div/form/input[1][@placeholder='Name']")).sendKeys("Makarand");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div/form/input[2][@placeholder=\"Email\"]")).sendKeys("mlmali@rcpit.ac.in");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div/form/input[3][@placeholder=\"Phone Number\"]")).sendKeys("9021707074");
		Thread.sleep(1000);
		driver.findElement(By.className("reset-pwd-btn")).click();
		Thread.sleep(1000);
		//String errmsg=driver.findElement(By.cssSelector("infoMsg")).getText();
		//System.out.println(errmsg);
		driver.findElement(By.xpath("//div/button[@class=\"go-to-login-btn\"]")).click();
		driver.findElement(By.id("inputUsername")).sendKeys("Rahul");
		Thread.sleep(1000);
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		//driver.findElement(By.name("chkboxOne")).click();
		//Thread.sleep(1000);
		//driver.close();

	}

}
