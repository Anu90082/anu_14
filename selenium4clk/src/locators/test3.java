package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("https://www.facebook.com/login/web/");
   driver.findElement(By.linkText("Forgotten password?"));
  // driver.findElement(By.name("email")).sendKeys("abcdefg");
   //driver.findElement(By.id("pass")).sendKeys("aaaaaa");
  // driver.findElements(By.name("login"));
  
	}

}
