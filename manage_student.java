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

public class manage_student {

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
		
	
		//Student data
	    WebElement manage_student = driver.findElement(By.xpath("(//div[@class='MuiListItemText-root css-1tsvksn'])[4]"));
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
	    driver.findElement(By.xpath("//p[text()='Add student using Form']")).click();
		driver.findElement(By.xpath("(//input[@placeholder='Admission No'])[1]")).sendKeys("101");
		driver.findElement(By.xpath("(//input[@placeholder='First Name'])[1]")).sendKeys("Anushya");
		driver.findElement(By.name("lastName")).sendKeys("Pandey");
		driver.findElement(By.name("fathersName")).sendKeys("Shiva Pandey");
		driver.findElement(By.xpath("(//div[@id='demo-simple-select-helper'])[5]")).click();
		driver.findElement(By.xpath("//li[text()='CLASS 6']")).click();
		driver.findElement(By.xpath("(//div[@id='demo-simple-select-helper'])[6]")).click();
		driver.findElement(By.xpath("//li[text()='A']")).click();
		driver.findElement(By.xpath("(//div[@id='demo-simple-select-helper'])[7]")).click();
		driver.findElement(By.xpath("//li[text()='F']")).click();
		driver.findElement(By.name("mobileNo")).sendKeys("9999955555");
		driver.findElement(By.xpath("(//div[@id='demo-simple-select-helper'])[8]")).click();
		driver.findElement(By.xpath("//li[text()='004']")).click();
		driver.findElement(By.name("dateOfBirth")).sendKeys("21-07-2010");
		driver.findElement(By.xpath("(//div[@id='demo-simple-select-helper'])[9]")).click();
		driver.findElement(By.xpath("//li[text()='Yes']")).click();
		driver.findElement(By.xpath("(//div[@id='demo-simple-select-helper'])[10]")).click();
		driver.findElement(By.xpath("//li[text()='Yes']")).click();
		/*driver.findElement(By.xpath("(//div[@id='demo-simple-select-helper'])[11]")).click();
		driver.findElement(By.xpath("//li[text()='None']")).click();*/
		driver.findElement(By.xpath("(//input[@placeholder='Address'])[1]")).sendKeys("Coimbatore, Tamilnadu");
		driver.findElement(By.name("studentId")).sendKeys("11");	
		driver.findElement(By.xpath("(//div[@id='demo-simple-select-helper'])[12]")).click();
		driver.findElement(By.xpath("//li[text()='Studying']")).click();
	    driver.findElement(By.name("admissionDate")).sendKeys("10-06-2013");
		driver.findElement(By.name("motherName")).sendKeys("Parvathy Pandey");
		driver.findElement(By.name("motherMobileNo")).sendKeys("8888877777");
		driver.findElement(By.xpath("(//div[@id='demo-simple-select-helper'])[13]")).click();
		driver.findElement(By.xpath("//li[text()='DaysScholar']")).click();
		driver.findElement(By.xpath("//p[text()='Add Student Details']")).click();
		

	}

}
         
