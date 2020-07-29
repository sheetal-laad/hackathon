package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).click();
		Select s=new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
        s.selectByValue("USD");
        driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).click();
        
	}

}
