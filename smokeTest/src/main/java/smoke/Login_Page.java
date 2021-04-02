package smoke;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Login_Page {
	WebDriver driver;
	
	//ELEMENT LOCATORS
	@FindBy(id="user-name") public WebElement userName;
	@FindBy(xpath = "//input[@type='password']") public WebElement userPassword;
	@FindBy(id = "login-button") public WebElement submitBtn;
	
	
	//METHODS
	
	public void userInput(String user) {
		userName.sendKeys(user);
	}
	
	public void passwordInput(String password) {
		userPassword.sendKeys(password);
	}
	
	public void clickSubmit() {
		submitBtn.click();
	}
	
	
	
	
	
	
	
	
	//CONSTRUTOR
	public Login_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
		}
	

	
	

}
