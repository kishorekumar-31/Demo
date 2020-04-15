package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObjects {
	@FindBy(id="email")
	public static WebElement username;
	@FindBy(id="pass")
	public static WebElement password;
	@FindBy(id="loginbutton")
    public static WebElement submit;
}
