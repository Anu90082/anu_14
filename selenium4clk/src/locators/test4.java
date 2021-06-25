package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test4 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("input[type=text]")).sendKeys("anusha");
		driver.findElement(By.cssSelector("input[type=password]")).sendKeys("anu123");
		driver.findElement(By.cssSelector("button[type=submit]")).click();
		driver.close();

	}

}
