package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchChrome {
	public static void main(String[] args) {

		/*
		 * System.setProperty("webdriver.ie.driver",
		 * "D:/Acc_Selenium_Oxygen_Old/webDrivers/IEDriverServer.exe"); WebDriver
		 * driver= new InternetExplorerDriver();
		 */

		System.setProperty("webdriver.chrome.driver", "D:/Acc_Selenium_Oxygen_Old/webDrivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// String url=
		// "https://www.facebook.com/campaign/landing.php?campaign_id=1653993517&extra_1=s%7Cc%7C355887219806%7Ce%7Cfacebook%20signup%7C&placement=&creative=355887219806&keyword=facebook%20signup&partner_id=googlesem&extra_2=campaignid%3D1653993517%26adgroupid%3D63066387563%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-321689134300%26loc_physical_ms%3D21341%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=Cj0KCQjwwuD7BRDBARIsAK_5YhUpPOarkeQaFk9723ngi9N86rY74CkfeK99Ri3FL9t8jfmty4d4vzwaAozBEALw_wcB";

		String url = "https://www.facebook.com/";

		driver.get(url);

		driver.manage().window().maximize();

		
		  driver.findElement(By.xpath("//input[@id='u_0_n']")).sendKeys("Priyanka");
		  
		  Select date = new
		  Select(driver.findElement(By.xpath("//select[@id='day']")));
		  
		  date.selectByValue("7");
		  
		  Select day = new
		  Select(driver.findElement(By.xpath("//select[@id='month']")));
		  
		  day.selectByVisibleText("Jul");
		 

		/*
		 * driver.findElement(By.xpath("//a[contains(text(),'Create a Page')]")).click()
		 * ;
		 * 
		 * driver.navigate().back();
		 */

		// driver.quit();

	}

}
