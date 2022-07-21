package SeleniumWithJavaPrograms;

import java.time.Duration;
//import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathYouTubeChallenge {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\mywebdrivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.youtube.com/");
		driver.findElement(By.xpath("//*[@id=\"video-title\"]")).click();
		Thread.sleep(5000);
		String a=driver.findElement(By.xpath("//*[@id=\"text\"]/a[@xpath='1']")).getText();
		System.out.println(a);
		driver.close();
	

	}

}
