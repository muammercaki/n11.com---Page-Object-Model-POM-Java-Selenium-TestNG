package testCase;

import listeners.Listener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import testCaseFunction.SignInfunction;
import utils.BaseTest;

@Listeners({Listener.class})
public class SignInTest extends BaseTest {

    @Test
    public void signIn() {
        SignInfunction singIn = new SignInfunction(driver);
        singIn.signInForm();
    }
}
