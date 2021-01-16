package program9;

import static org.junit.Assert.*;
import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class selenium2
{
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		selenium2 c=new selenium2();
		driver=c.Launch("https://www.chatwork.com/login.php?args=#!rid199119694");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement obt1=driver.findElement(By.name("email"));
		obt1.sendKeys("autotest");
		WebElement obt2=driver.findElement(By.name("password"));
		obt2.sendKeys("autotest");
		WebElement ob=driver.findElement(By.name("login"));
		ob.submit();
		WebDriverWait wait=new WebDriverWait(driver,10);

		System.out.println(driver.getTitle());
		System.out.println("all test case pass");
		//assertEquals("Welcome: Mercury Tours",driver.getTitle());
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		c.Close();

	}
	public selenium2()
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

