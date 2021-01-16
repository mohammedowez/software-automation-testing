package program11;

//import static org.junit.Assert.*;
//import java.util.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class selenium4
{
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		selenium4 IDriver=new selenium4();
		WebDriver driver = IDriver.Launch("http://www.yahoo.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 100);
		int linkCount = driver.findElements(By.xpath("//a")).size();
		System.out.println("Count of links: "+linkCount);
		int imageCount = driver.findElements(By.xpath("//img")).size();
		System.out.println("Count of Images: "+imageCount);
		int buttonCount = driver.findElements(By.xpath("//input[@type['submit']]")).size();
		System.out.println("Count of buttons: "+buttonCount);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		IDriver.Close();
		}
	public selenium4()
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
