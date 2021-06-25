package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test0 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		Login l=new Login(driver);
		driver.navigate().refresh();
	    l.emailaddresstextbox("ghjhjbssjhvhjag");	
	    l.passwordtxtbox("bghjgdhjbdhj");
	    l.loginButton();
	
	}

}
