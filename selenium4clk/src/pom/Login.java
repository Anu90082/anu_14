package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	@FindBy(id="m_login_email")
	private WebElement emailaddresstb;
	
	public Login(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	
   public void emailaddresstextbox(m_login_email) {
	emailaddresstb.sendKeys();
   }
}
