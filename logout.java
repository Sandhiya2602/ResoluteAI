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

public class logout {

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
			
			//Logout
			
			 WebElement manage_student = driver.findElement(By.xpath("(//div[@class='MuiListItemText-root css-1tsvksn'])[8]"));
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
				wait.until(ExpectedConditions.elementToBeClickable(manage_student));
				Actions act = new Actions(driver);
				act.moveToElement(manage_student).click().perform();
				JavascriptExecutor executor = (JavascriptExecutor) driver;
			    executor.executeScript("arguments[0].click();",manage_student);
			     try 
			     {
					Thread.sleep(3000);
				 }
			     catch (InterruptedException e) 
			     {
					e.printStackTrace();
				 }
		
			  driver.findElement(By.xpath("//button[text()='Ok']")).click();
			  driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
