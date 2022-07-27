package SeleniumWithJavaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GreenKartTestingPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		String[] yaadi= {"Brocolli","Potato"  ,"Cucumber", "Beans"};
		int yaadiCount=yaadi.length;
		Thread.sleep(1000);
		//find all items
		List<WebElement> itemsLists=driver.findElements(By.cssSelector("h4.product-name"));
		int itemsize=itemsLists.size();
		System.out.println(itemsize);
		
		for(int i=0;i<itemsize;i++)
		{
			String a=itemsLists.get(i).getText();
			//Convert normal array to array list
			String[] b=a.split("-");
			String c=b[0].trim();
			 List actualYaadi = Arrays.asList(yaadi);
			 
			if(actualYaadi.contains(c))
			{
				yaadiCount--;
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				if(yaadiCount<0)
				{
				break;
				}
			}
		}
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("promoCode")).sendKeys("Rahulshetty");
		driver.findElement(By.className("promoBtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();
		Thread.sleep(1000);
		WebElement drpdwn=driver.findElement(By.xpath("//select[@style='width: 200px;']"));
		Select drpList=new Select(drpdwn);
		drpList.selectByVisibleText("India");
		driver.findElement(By.className("chkAgree")).click();
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		
		//driver.close();
		}
		

	}


