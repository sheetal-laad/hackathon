package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/20298/aus-vs-ind-1st-t20i-india-tour-of-australia-2018-19");
		driver.findElement(By.className("cb-col cb-col-100 cb-scrd-itms"));

	}

}
