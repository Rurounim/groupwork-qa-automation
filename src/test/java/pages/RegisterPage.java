package pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;
import io.qameta.allure.Step;

public class RegisterPage {
    public SelenideElement firstName = $("");
    public SelenideElement lastName = $("");
    public SelenideElement gender = $("");
    public SelenideElement country = $("");
    public SelenideElement email = $("");
    public SelenideElement phone = $("");
    public SelenideElement submitButton = $("");

    @Step("Enter first name: {fn}")
    public void enterFirstName(String fn) {
        firstName.setValue(fn);
    }

    @Step("Submit")
    public void submit() {
        submitButton.click();
    }

    //
}
