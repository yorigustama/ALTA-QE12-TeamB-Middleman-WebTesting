package step_definitions;

import io.cucumber.java.en.Then;
import org.example.pageObject.LogoutAdminPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LogoutAdminSteps {
    private final WebDriver driver = Hooks.driver;
    LogoutAdminPage logoutAdminPage = new LogoutAdminPage(driver);

    @Then("Admin click button fitur Logout")
    public void ClickButtonLogoutAdmin() throws InterruptedException{
        logoutAdminPage.ClickButtonLogoutAdmin();
        Thread.sleep(2000);
    }

    @Then("Admin click button Logout")
    public void ClickButtonLogout() throws InterruptedException{
        logoutAdminPage.ClickButtonLogout();
        Thread.sleep(3000);
    }

    @Then("Admin already Log Out Yes Or No")
    public void verifyLabelLogoutYesOrNo() throws InterruptedException{
        Assert.assertTrue(logoutAdminPage.verifyLogoutYesOrNo());
        Thread.sleep(3000);
    }

    @Then("Admin click button Log Out Yes")
    public void ClickButtonLogoutYes() throws InterruptedException{
        logoutAdminPage.ClickLogoutYes();
        Thread.sleep(2000);
    }

    @Then("Admin click button LogOut No")
    public void ClickButtonLogoutNo() throws InterruptedException{
        logoutAdminPage.ClickLogoutNo();
        Thread.sleep(2000);
    }

    @Then("Admin already website middleman")
    public void verifyLabelwebsitemiddle() throws InterruptedException{
        Assert.assertTrue(logoutAdminPage.logoMiddlemanawalDisplayed());
        Thread.sleep(3000);
    }


}
