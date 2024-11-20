package tests;

import base.BaseTest;
import io.qameta.allure.Description;
import org.testng.annotations.Test;
import pages.RegisterPage;

import com.codeborne.selenide.Condition;

public class RegisterTest extends BaseTest {

    @Test
    @Description("Check registration flow")
    public void validRegister() {
        RegisterPage registerPage = new RegisterPage();

        String firstName = "Mariam";
        String lastName = "Test";
        String email = "mm10@gmail.com";
        String phone = "1231231230";
        String country = "Australia";

        registerPage.enterFirstName(firstName);
        registerPage.enterLastName(lastName);
        registerPage.enterEmail(email);
        registerPage.enterPhone(phone);
        registerPage.chooseGender();
        registerPage.chooseCountry(country);

        registerPage.firstNameLocator.shouldHave(Condition.value(firstName));
        registerPage.lastNameLocator.shouldHave(Condition.value(lastName));
        registerPage.emailLocator.shouldHave(Condition.value(email));
        registerPage.phoneLocator.shouldHave(Condition.value(phone));
        registerPage.countryLocator.shouldHave(Condition.value(country));

        registerPage.submit();
    }

}
