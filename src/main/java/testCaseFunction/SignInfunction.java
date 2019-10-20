package testCaseFunction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utils.BasePage;

public class SignInfunction extends BasePage {

    // private By signIn = By.linkText("Üye Ol");
    private By firstName = By.id("firstName");
    private By lastName = By.id("lastName");
    private By email = By.id("registrationEmail");
    private By password = By.id("registrationPassword");
    private By passwordAgain = By.id("passwordAgain");
    private String pass = "123456a";
    private By phone = By.id("phoneNumber");
    private By genderMale = By.xpath("//*[@id=\"registerForm\"]/div[7]/div[1]/div[1]/label[1]");
    private By birtDay = By.id("birthDay");
    private By birthMonth = By.id("birthMonth");
    private By birthYear = By.id("birthYear");
    private By acceptContract = By.xpath("//*[@id=\"registerForm\"]/div[9]/div[1]/label[1]");
    private By submitButton = By.id("submitButton");

    public SignInfunction(WebDriver driver) {
        super(driver);
    }

    public void signInForm() {
        element(By.linkText("Üye Ol")).click();
        sendKeys(firstName, "Türker");
        sendKeys(lastName, "Radyo");
        sendKeys(email, "bilisimabcdef@bestmailgen.com");
        sendKeys(password, pass);
        sendKeys(passwordAgain, pass);
        sendKeys(phone, "081838377");
        element(genderMale).click();
        selectElement(element(birtDay), "12");
        selectElement(element(birthMonth), "9");
        selectElement(element(birthYear), "1991");
        element(acceptContract).click();
        element(submitButton).click();
        Assert.assertEquals(element(By.linkText("Türker Radyo")).getText(), "Türker Radyo");

    }
}
