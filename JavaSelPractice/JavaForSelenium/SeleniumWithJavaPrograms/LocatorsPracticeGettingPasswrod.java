package SeleniumWithJavaPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

public class LocatorsPracticeGettingPasswrod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.edge.driver","C:\\mywebdrivers\\msedgedriver.exe");
//		WebDriver driver= new EdgeDriver();
		System.setProperty("webdriver.edge.driver","C:\\mywebdrivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/locatorspractice");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/form/div[2]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("reset-pwd-btn")).click();
		String pass=getpassword(driver);
		System.out.println(pass);
		String nam="Makarand";
		driver.get("https://rahulshettyacademy.com/locatorspractice");
		driver.findElement(By.id("inputUsername")).sendKeys(nam);
		driver.findElement(By.name("inputPassword")).sendKeys(pass);
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(5000);
		driver.close();
		
		
		
	}
	
	public static String getpassword(WebDriver driver)
	{
		String msg=driver.findElement(By.className("infoMsg")).getText();
		String[] firstsplit=msg.split("'");
		//Please use temporary password 'rahulshettyacademy' to Login
		String[] Secondhalf=firstsplit[1].split("'");
		return Secondhalf[0];
		
	}

}
