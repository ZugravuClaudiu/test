package tests;

import config.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.LoginPage;

public class LoginTests extends TestBase {
    private LoginPage loginPage;

    @Test
    public void successfulLoginTest() {
        loginPage = new LoginPage(driver);
        //1. Launch the application
        driver.navigate().to("https://the-internet.herokuapp.com/login");
        //2. Enter a valid username
        loginPage.getUsernameField().sendKeys("tomsmith");
        //3. Enter a valid password
        loginPage.getPasswordField().sendKeys("SuperSecretPassword!");
        //4. Click on the Login button
        loginPage.getLoginButton().click();
        //Expected Result: The user is successfully logged in
        Assertions.assertEquals("You logged into a secure area!\n" + "×", loginPage.getMessage().getText());
    }

    @Test
    public void invalidUsernameLoginTest() {

    }

    @Test
    public void invalidPasswordLoginTest() {

    }
}
