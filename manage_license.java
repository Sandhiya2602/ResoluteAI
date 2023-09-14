package TestScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class manage_license {

	public static void main(String[] args) 
	{
	        WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    
		    //Login and dashboard
		    
			driver.get("https://facegenie-ams-school.web.app/");
			driver.findElement(By.id("email")).sendKeys("testbams@gmail.com");
			driver.findElement(By.id("password")).sendKeys("facegenie");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			//Manage License
			
			 WebElement manage_license = driver.findElement(By.xpath("(//div[@class='MuiListItemText-root css-1tsvksn'])[5]"));
			 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
				wait.until(ExpectedConditions.elementToBeClickable(manage_license));
				Actions act = new Actions(driver);
				act.moveToElement(manage_license).click().perform();
				JavascriptExecutor executor = (JavascriptExecutor) driver;
			    executor.executeScript("arguments[0].click();",manage_license);
			     try 
			     {
					Thread.sleep(3000);
				 }
			     catch (InterruptedException e) 
			     {
					e.printStackTrace();
				 }
			     
			  driver.findElement(By.xpath("//p[text()='Add License']")).click();
			  driver.findElement(By.name("empId")).sendKeys("101");
			  driver.findElement(By.name("firstName")).sendKeys("Saravan");
			  driver.findElement(By.name("lastName")).sendKeys("Kumar");
			  driver.findElement(By.name("phoneNumber")).sendKeys("7777799999");
			  driver.findElement(By.name("busNo")).sendKeys("47");
			  driver.findElement(By.name("email")).sendKeys("saravankumar@gmail.com");
			  driver.findElement(By.name("password")).sendKeys("Saravan47");
			  driver.findElement(By.xpath("//p[text()='Submit Details']")).click();
		

	}

}
