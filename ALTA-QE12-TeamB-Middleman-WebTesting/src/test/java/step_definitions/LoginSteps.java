package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
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

    @Given("User open the website Middleman login")
    public void user_open_the_website_middleman() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(loginPage.logoMiddlemanDisplayed());
        loginPage.setButtonToLogin();
        Thread.sleep(2000);
    }

    @When("User input {string} as a userName {string} as a password")
    public void user_input_as_a_user_name_as_a_password(String usrName, String psword) throws InterruptedException {
        loginPage.setInputUserName(usrName);
        loginPage.setInputPassword(psword);
        loginPage.setButtonLogin();
    }



    @Then("User already on home page")
    public void user_already_on_home_page() {
        Assert.assertTrue(loginPage.labelProductDisplayed());
    }


    @And("User should see an success message login")
    public void userShouldSeeAnSuccessMessage() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.alertIsPresent());

        // Switch to the alert
        Alert alert = driver.switchTo().alert();

//        // Get the text from the alert
//        String alertText = alert.getText();
//        System.out.println("Alert Text: " + alertText);

        // Handle the alert (click "OK")
        alert.accept();
        Thread.sleep(1000);
    }

    @Then("User should see an error message login")
    public void userShouldSeeAnErrorMessage() {
        WebDriverWait wait = new WebDriverWait(driver, 1000);
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        String expectedAlertMessage = "email or password incorrect"; // Replace with your expected message
        Assert.assertTrue(alertText.contains(expectedAlertMessage));

        alert.accept();
    }

//    @And("User delete button")
//    public void userDeleteButton() throws InterruptedException {
//        Thread.sleep(2000);
//        loginPage.setButtonDeleteMyProd();
//        Thread.sleep(2000);
//
//    }

    @Given("Admin open the website Middleman login")
    public void adminOpenTheWebsiteMiddlemanLogin() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(loginPage.logoMiddlemanDisplayed());
        loginPage.setButtonToLogin();
        Thread.sleep(2000);


    }

    @When("Admin input {string} as a userName {string} as a password")
    public void adminInputAsAUserNameAsAPassword(String usrName1, String psword1) throws InterruptedException {
        loginPage.setInputUserName(usrName1);
        loginPage.setInputPassword(psword1);
        loginPage.setButtonLogin();
        Thread.sleep(3000);
    }

    @And("Admin should see an success message login")
    public void adminShouldSeeAnSuccessMessageLogin() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.alertIsPresent());

        // Switch to the alert
        Alert alert = driver.switchTo().alert();

//        // Get the text from the alert
//        String alertText = alert.getText();
//        System.out.println("Alert Text: " + alertText);

        // Handle the alert (click "OK")
        alert.accept();
    }

    @Then("Admin already on home page")
    public void adminAlreadyOnHomePage() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(loginPage.setdasboardUser());
    }
}
