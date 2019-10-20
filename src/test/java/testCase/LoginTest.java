package testCase;

import listeners.Listener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import testCaseFunction.LoginFunction;
import utils.BaseTest;

@Listeners({Listener.class})
public class LoginTest extends BaseTest {

    @Test(priority = 2)
    public void loginTest() {
        LoginFunction login = new LoginFunction(driver);
        login.loginfunction();
    }

}
