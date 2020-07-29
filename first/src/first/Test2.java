package first;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test2 {

	public static void main(String[] args) {
		
        System.setProperty("webdriver.gecko.driver","C:\\Users\\Dell\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://facebook.com");
		System.out.println(driver.getTitle());
	}

}
