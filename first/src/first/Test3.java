package first;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Test3 {

	public static void main(String[] args) {

        System.setProperty("webdriver.ie.driver","C:\\Users\\Dell\\IEDriverServer_x64_3.150.1\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.get("https://facebook.com");
		System.out.println(driver.getTitle());

	}

}
