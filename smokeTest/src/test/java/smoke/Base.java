package smoke;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class Base {
	WebDriver driver;
	Login_Page login;
	ScreenShot shot;

  @Parameters({"browser","URI"})
  @BeforeMethod
  public void beforeMethod(@Optional("Chrome")String browser, @Optional("https://www.saucedemo.com/")String URI) {
	  
	  if(browser.equalsIgnoreCase("chrome")) {
		  String path = System.getProperty("user.dir");
		  System.setProperty("webdriver.chrome.driver",path+"\\drivers\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get(URI);
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(3L,TimeUnit.SECONDS);
		  login = new Login_Page(driver);
		  shot = new ScreenShot(driver);
		  
		  
	  }else if(browser.equalsIgnoreCase("firefox")) {
		  String path = System.getProperty("user.dir");
		  System.setProperty("webdriver.gecko.driver",path+"\\drivers\\geckodriver.exe");
		  driver = new FirefoxDriver();
		  driver.get(URI);
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(3L,TimeUnit.SECONDS);
		  login = new Login_Page(driver);
		  shot = new ScreenShot(driver);
	  }
	  
	  
  }

}
