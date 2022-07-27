package SeleniumWithJavaPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub https://rahulshettyacademy.com/angularpractice/
		
//		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://rahulshettyacademy.com/angularpractice/"); //1
//		driver.findElement(By.name("name")).sendKeys("vedshree"); //2
//		driver.findElement(By.name("email")).sendKeys("mali1@gmail.com"); //3
//		driver.findElement(By.id("exampleInputPassword1")).sendKeys("vedu");//4
//		driver.findElement(By.id("exampleCheck1")).click(); //5
//		WebElement drpdwn= driver.findElement(By.id("exampleFormControlSelect1")); //6
//		Select dropd=new Select(drpdwn);//7
//		dropd.selectByVisibleText("Female");//8
//		
//		driver.findElement(By.xpath("//div/label[@for='inlineRadio1']")).click();//9
////		List<WebElement> radiolist=driver.findElements(By.className("form-check-input"));
////		
////		for(WebElement rl:radiolist)
////		{
////			System.out.println(rl.getText());
////		}
//		
//		driver.findElement(By.name("bday")).sendKeys("28/01/1986");//10
//		driver.findElement(By.xpath("//input[@type='submit']")).submit();//11
//		Thread.sleep(2000);
//		System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());//12
		
		//System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");

		driver.get("https://rahulshettyacademy.com/angularpractice/");

		driver.findElement(By.xpath("//div[@class='form-group']//input[@name='name']")).sendKeys("Selenium");

		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("selenium@email.com");

		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abcdef1");

		driver.findElement(By.id("exampleCheck1")).click();

		WebElement staticDropdown = driver.findElement(By.id("exampleFormControlSelect1"));

		Select dropdown = new Select(staticDropdown);

		dropdown.selectByVisibleText("Female");

		driver.findElement(By.id("inlineRadio1")).click();

		driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("07/23/2022");

		driver.findElement(By.cssSelector("input[type='submit']")).click();

		Thread.sleep(2000);

		String success = driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText();

		System.out.println(success);
		

	}

}
