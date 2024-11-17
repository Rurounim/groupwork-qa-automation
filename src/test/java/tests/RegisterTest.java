package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.RegisterPage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class RegisterTest extends BaseTest {

    @Test
    public void validRegister() {
        RegisterPage registerPage = new RegisterPage();
        registerPage.enterFirstName("saxeli");

        // ganvagrdzot velebis shevseba

        $(".dashboard").shouldBe(visible);
    }
}
