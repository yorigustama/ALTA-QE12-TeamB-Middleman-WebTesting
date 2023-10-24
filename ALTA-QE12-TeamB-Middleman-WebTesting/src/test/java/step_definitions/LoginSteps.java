package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.example.pageObject.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginSteps {
    private final WebDriver driver = Hooks.driver;

    LoginPage loginPage = new LoginPage(driver);

    @When("User input {string} as a userName {string} as a password")
    public void inputCredential(String usrName, String psword) {
        loginPage.setInputUserName(usrName);
        loginPage.setInputPassword(psword);
        loginPage.setButtonLogin();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        alert.accept();
    }


}
