package seleniumsample;

import static org.junit.Assert.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class selenium
{
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		selenium c=new selenium();
		driver=c.Launch("http://www.yahoo.com");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement objTextBox=driver.findElement(By.xpath("//input[@type='text']"));
		objTextBox.sendKeys("Cricket");
		objTextBox.submit();
		System.out.println("waiting");
		WebDriverWait wait=new WebDriverWait(driver,10);
		System.out.println("waiting over");
		wait.until(ExpectedConditions.titleContains("Cricket"));
		System.out.println("check");

		System.out.println(driver.getTitle());
		System.out.println("all test case pass");

		assertEquals("Cricket - Yahoo India Search Results",driver.getTitle());
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		c.Close();

	}
	public selenium()
	{
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Launching Chrome");
	}
	public WebDriver Launch(String url){
		driver.get(url);
		System.out.println("Opened URL in Chrome:"+url);
		return driver;
		}
	public void Close()
	{
		driver.quit();
		System.out.println("Closed Chrome");
	}

}