package pages;

import static browser.Browser.getPropertyValue;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    @FindBy(id = "txtUsername") private WebElement userName;
    @FindBy(id = "txtPassword") private WebElement password;
    @FindBy(id = "btnLogin") private WebElement loginButton;

    public void login(){
        userName.sendKeys(getPropertyValue("userName"));
        password.sendKeys(getPropertyValue("password"));
        loginButton.click();
    }
}
