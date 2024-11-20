package pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;
import io.qameta.allure.Step;

public class RegisterPage {
    public SelenideElement firstNameLocator = $("input[placeholder='First Name']");
    public SelenideElement lastNameLocator = $("input[placeholder='Last Name'");
    public SelenideElement emailLocator = $("input[type='email']");
    public SelenideElement phoneLocator = $("input[type='tel']");
    public SelenideElement genderFemaleLocator = $("input[type='radio'][value='FeMale']");
    public SelenideElement countryLocator = $("#country");
    public SelenideElement submitButton = $("#submitbtn");

    @Step("Enter first name: {fn}")
    public void enterFirstName(String fn) {
        firstNameLocator.setValue(fn);
    }

    @Step("Enter last name: {ln}")
    public void enterLastName(String ln) {
        lastNameLocator.setValue(ln);
    }

    @Step("Enter email: {email}")
    public void enterEmail(String email) {
        emailLocator.setValue(email);
    }

    @Step("Enter phone number {phone}")
    public void enterPhone(String phone) {
        phoneLocator.setValue(phone);
    }

    @Step("Choose gender")
    public void chooseGender() {
    genderFemaleLocator.click();
    }

    @Step("Choose country {c}")
    public void chooseCountry(String c) {
        countryLocator.selectOption(c);
    }

    @Step("Submit")
    public void submit() {
        submitButton.click();
    }
}
