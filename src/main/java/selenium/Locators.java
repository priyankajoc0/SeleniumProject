package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:/Acc_Selenium_Oxygen_Old/webDrivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		//1-id
		//driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		//2-name
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		
		//3-classname
		//By ByInstance = By.className("textInputContainer");
		//driver.findElement(ByInstance).click();
		
		//4-xpath
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		
		///5-cssSelector
		driver.findElement(By.cssSelector("#btnLogin")).click();
		
		//6-linkText
		//driver.findElement(By.linkText("Forgot your password?")).click();
		
		//7-partialLinkText
		//driver.findElement(By.partialLinkText("Forgot your")).click();
		
		//8-tagName
		System.out.println(driver.findElements(By.tagName("img")).size());
		
		
	}

}
