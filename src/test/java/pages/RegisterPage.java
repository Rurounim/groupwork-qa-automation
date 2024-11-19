package pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;
import io.qameta.allure.Step;

public class RegisterPage {
    public SelenideElement firstName = $("input[placeholder='First Name']");
    public SelenideElement lastName = $("input[placeholder='Last Name'");
    public SelenideElement emailLocator = $("input[type='email']");
//    public SelenideElement phone = $("input[]");
//    public SelenideElement genderMale = $("input[]");
//    public SelenideElement genderFemale = $("input[]");
    public SelenideElement submitButton = $("");

    @Step("Enter first name: {fn}")
    public void enterFirstName(String fn) {
        firstName.setValue(fn);
    }

    @Step("Enter last name: {ln}")
    public void enterLastName(String ln) {
        lastName.setValue(ln);
    }

    @Step("Enter email: {email}")
    public void enterEmail(String email) {
        emailLocator.setValue(email);
    }

    @Step("Submit")
    public void submit() {
        submitButton.click();
    }
}
