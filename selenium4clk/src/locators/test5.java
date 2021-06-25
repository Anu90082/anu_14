package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test5 {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	WebElement ele=driver.findElement(By.name("name=\"q\""));
	ele.sendKeys("pythonseleni");
	Thread.sleep(3000);
	driver.findElements(By.xpath(""));
	
	
	
	

	}

}
