package smoke;

import java.io.IOException;

import org.testng.annotations.Test;

public class Test1 extends Base {
  @Test
  public void Login() throws IOException {
	 
	  login.userInput("standard_user");
	  login.passwordInput("secret_sauce");
	  shot.TakePic();
	  login.clickSubmit();
	  
  }
}
