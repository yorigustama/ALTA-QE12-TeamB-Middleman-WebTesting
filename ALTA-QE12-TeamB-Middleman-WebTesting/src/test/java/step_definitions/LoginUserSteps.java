package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.LoginUserPage;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginUserSteps {
    private final WebDriver driver = Hooks.driver;

    LoginUserPage loginUserPage = new LoginUserPage(driver);

//    @Given("User open the website Middleman login")
//    public void user_open_the_website_middleman() throws InterruptedException {
//        Thread.sleep(2000);
//        Assert.assertTrue(loginUserPage.TampilanMiddlemanDisplayed());
//        loginUserPage.setTombolLogin();
//        Thread.sleep(2000);
//    }

//    @When("User input {string} as a userName {string} as a password")
//    public void user_input_as_a_user_name_as_a_password(String usrName, String psword) throws InterruptedException {
//        loginUserPage.setInputUsrName(usrName);
//        loginUserPage.setInputPasswo(psword);
//        loginUserPage.setButtonlogin();
//    }
//    @Then("User already on home page")
//    public void user_already_on_home_page() throws InterruptedException{
//        Assert.assertTrue(loginUserPage.ProductDisplayed());
//        Thread.sleep(3000);
//    }


//    @And("User should see an success message login")
//    public void userShouldSeeAnSuccessMessage() throws InterruptedException {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        wait.until(ExpectedConditions.alertIsPresent());
//
//        // Switch to the alert
//        Alert alert = driver.switchTo().alert();
//
//        // Get the text from the alert
//        String alertText = alert.getText();
//        System.out.println("Alert Text: " + alertText);
//
//        // Handle the alert (click "OK")
//        alert.accept();
//        Thread.sleep(1000);
//    }
}
