package smoke;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {
	WebDriver driver;
	
	public void TakePic() throws IOException {
		File screenShot =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(screenShot, new File("C:\\Automation\\SauceAutomate\\smokeTest\\Pics\\pic.jpg"));
	}
	
	public ScreenShot(WebDriver driver) {
		this.driver = driver;
	}
}
