package seleniumwebdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dem {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		String beforetitle = driver.getTitle();
		System.out.println(beforetitle);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		String aftertitle = driver.getTitle();
		if (beforetitle.equals(aftertitle))
		{
			System.out.println("Title is the same please logout");
			driver.findElement(By.id("welcome")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/Li[2]/a")).click();
			Thread.sleep(3000);
			driver.close();
		}
		else
		{
			System.out.println("This is not same");
			driver.close();
			}
		
		
		
				
	}

}
