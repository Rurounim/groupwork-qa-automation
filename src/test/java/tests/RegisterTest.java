package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.RegisterPage;

import com.codeborne.selenide.Condition;

public class RegisterTest extends BaseTest {

    @Test
    public void validRegister() {
        RegisterPage registerPage = new RegisterPage();

        String firstName = "Mariam";
        String lastName = "Mirziashvili";
        String email = "mm10@gmail.com";

        registerPage.enterFirstName(firstName);
        registerPage.enterLastName(lastName);
        registerPage.enterEmail(email);

        registerPage.firstName.shouldHave(Condition.value(firstName));
        registerPage.lastName.shouldHave(Condition.value(lastName));
        registerPage.emailLocator.shouldHave(Condition.value(email));
    }

}
