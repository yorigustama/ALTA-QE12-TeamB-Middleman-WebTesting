package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pageObject.LogOutPage;
import org.example.pageObject.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LogOutStep {

    private final WebDriver driver = Hooks.driver;
    LogOutPage logOutPage = new LogOutPage(driver);
    LoginPage loginPage = new LoginPage(driver);

    @And("User click button profile")
    public void userClickButtonProfile() {
        logOutPage.setButtonProfile();

    }

    @And("User click button logout")
    public void userClickButtonLogout() {
        logOutPage.setButtonLogOut();
    }

    @And("User click button allert logout")
    public void userClickButtonAllertLogout() {
        logOutPage.setButtonLogOutYes();
    }

    @Then("User already on website Middleman login")
    public void userAlreadyOnWebsiteMiddlemanLogin() {
        Assert.assertTrue(loginPage.logoMiddlemanDisplayed());
    }
}
