package first;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String date="23";
		String month="July";
		String year="2020";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.spicejet.com");
		driver.findElement(By.cssSelector(".ui-datepicker-trigger")).click();
		driver.findElement(By.cssSelector(".ui-datepicker-month")).click();
		while(!driver.findElement(By.cssSelector(".ui-datepicker-month")).getText().equals(month))
		{
			driver.findElement(By.cssSelector(".ui-icon.ui-icon-circle-triangle-e")).click();
		}
		int size=driver.findElements(By.xpath("//td[@data-handler='selectDay']/a[@class='ui-state-default']")).size();
		for(int i=0;i<size;i++)
		{
			System.out.println(driver.findElements(By.xpath("//td[@data-handler='selectDay']/a[@class='ui-state-default']")).get(i).getText());
			if(driver.findElements(By.xpath("//td[@data-handler='selectDay']/a[@class='ui-state-default']")).get(i).getText().equals(date))
			{
				driver.findElements(By.xpath("//td[@data-handler='selectDay']/a[@class='ui-state-default']")).get(i).click();
				break;
			}
		}

	}

}
