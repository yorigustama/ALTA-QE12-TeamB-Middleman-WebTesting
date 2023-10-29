package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.example.pageObject.RegisterPage;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterSteps {

    private final WebDriver driver = Hooks.driver;
    RegisterPage registerPage = new RegisterPage(driver);

//    @Then("User successfully registers")
//    public void userSuccessfullyRegisters() {
//        Assert.assertTrue(registerPage.isRegistrationSuccessful());
//    }
    @Given("User open the website Middleman Register")
    public void user_open_the_website_middleman_register() throws InterruptedException {
        Assert.assertTrue(registerPage.logoMiddlemanDisplayed());
        registerPage.setButtonToSingUp();
        Thread.sleep(1000);


    }


    @When("User input {string} as a shopName {string} as a email {string} as a password {string} as a phoneNumber {string} as an address")
    public void userInputAsAShopNameAsAEmailAsAPasswordAsAPhoneNumberAsAnAddress(String usrNameRegis, String emailRegiste, String passwordRegister, String phoneNumberRegister,String anddressRegister) throws InterruptedException {
        Thread.sleep(1000);
        registerPage.setInputUserNameRegister(usrNameRegis);
        registerPage.setInputEmailRegister(emailRegiste);
        registerPage.setInputPhoneNumberRegister(phoneNumberRegister);
        registerPage.setInputPasswordRegister(passwordRegister);
        registerPage.setInputAnddressRegister(anddressRegister);
        Thread.sleep(1000);
        registerPage.setButtonRegister();
        Thread.sleep(1000);
    }
    @And("User should see an success message register")
    public void userShouldSeeAnSuccessMessage() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.alertIsPresent());

        // Switch to the alert
        Alert alert = driver.switchTo().alert();

        // Get the text from the alert
        String alertText = alert.getText();
        System.out.println("Alert Text: " + alertText);

        // Handle the alert (click "OK")
        alert.accept();
        Thread.sleep(1000);
    }

    @Then("User should see an error message register")
    public void userShouldSeeAnErrorMessage() {
        WebDriverWait wait = new WebDriverWait(driver, 1000);
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        String expectedAlertMessage = "phone minimum format 10 characters"; // Replace with your expected message
        Assert.assertTrue(alertText.contains(expectedAlertMessage));

        alert.accept();
    }
}