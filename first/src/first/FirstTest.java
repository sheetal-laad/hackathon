package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.id("email")).sendKeys("sheetallaad6@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("mohsheetal");
		driver.findElement( By.xpath("//*[text()='Forgotten account?']")).click();
		
		

	}

}
