package testCaseFunction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utils.BasePage;

public class LoginFunction extends BasePage {
    private By email = By.id("email");
    private By password = By.id("password");
    private By loginButton = By.id("loginButton");

    public LoginFunction(WebDriver driver) {
        super(driver);
    }

    public void loginfunction() {
        element(By.linkText("Giriş Yap")).click();
        sendKeys(email, "bilisimabcdef@bestmailgen.com");
        sendKeys(password, "123456a");
        element(loginButton).click();
        Assert.assertEquals(element(By.linkText("Türker Radyo")).getText(), "Türker Radyo");
    }
}
