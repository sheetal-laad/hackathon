package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/20298/aus-vs-ind-1st-t20i-india-tour-of-australia-2018-19");
		WebElement table=driver.findElement(By.xpath("//div[@id='innings_1']/div[1]"));
		int totalPlayers=table.findElements(By.xpath("//div[@class='cb-col cb-col-27 ']/following-sibling::div[2]")).size();
	   System.out.println(totalPlayers);
		for(int i=0;i<totalPlayers;i++)
	    {
	   System.out.println(table.findElements(By.xpath("//div[@class='cb-col cb-col-27 ']/following-sibling::div[2]")).get(i).getText());
	    }
	}

}
