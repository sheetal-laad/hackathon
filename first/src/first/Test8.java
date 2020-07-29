package first;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test8 {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement miniDriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(miniDriver.findElements(By.tagName("a")).size());
		WebElement colDriver = miniDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		int total = colDriver.findElements(By.tagName("a")).size();
		for (int i = 1; i < total; i++) {
			colDriver.findElements(By.tagName("a")).get(i).sendKeys(Keys.chord(Keys.CONTROL, Keys.ENTER));
		}
		Set<String> abc=driver.getWindowHandles();
		java.util.Iterator<String> it=abc.iterator();
		while(it.hasNext())
		{
			System.out.println(driver.switchTo().window(it.next()).getTitle());
		}
		
	}

}
