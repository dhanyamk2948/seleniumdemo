package seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demo3 {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://demo.guru99.com/test/newtours/");
		driver.findElement(By.name("userName")).sendKeys("sunil");
		driver.findElement(By.name("password")).sendKeys("sunil");
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.linkText("Flights")).click();
		Select listbox = new Select(driver.findElement(By.xpath("//select[@name='tripType']/a")));
		listbox.selectByValue("oneway");
		                             
		
	}

}
