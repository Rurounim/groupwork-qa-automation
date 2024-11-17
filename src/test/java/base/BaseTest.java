package base;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {

    @BeforeMethod
    public void setUp() {
        Configuration.baseUrl = "https://demo.automationtesting.in/Register.html";
        Configuration.timeout = 10000;
        Configuration.browser = "firefox";

        FirefoxDriver firefox = new FirefoxDriver();
        firefox.get(Configuration.baseUrl);
    }

    @AfterMethod
    public void close() {
        // Automatically close browser after each test
        com.codeborne.selenide.WebDriverRunner.closeWebDriver();
    }
}
