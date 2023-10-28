package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pageObject.OutboundUserPage;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OutboundSteps {
    private final WebDriver driver = Hooks.driver;
    OutboundUserPage outboundUserPage = new OutboundUserPage(driver);

    @Then("User click button outbound")
    public void ClickButtonOUTbound() throws InterruptedException{
        outboundUserPage.ClickButtonOutboundPro();
        Thread.sleep(2000);
    }

    @Then("User already outbound product")
    public void verifyLabeloutboundProduct() throws InterruptedException{
        Assert.assertTrue(outboundUserPage.verifyLabelOutboundProduct());
        Thread.sleep(3000);
    }

    @Then("User click button history product out")
    public void ClickButtonHistoryproout() throws InterruptedException{
        outboundUserPage.ClickButtonHistoryProductOut();
        Thread.sleep(2000);
    }

    @Then("User already history out product")
    public void verifyLabelHistoryoutProduct() throws InterruptedException{
        Assert.assertTrue(outboundUserPage.verifyLabelHistoryProductOut());
        Thread.sleep(3000);
    }

    @Then("User click button Detail history product out")
    public void ClickButtonDetailProout() throws InterruptedException{
        outboundUserPage.ClickButtonDetailProductOut();
        Thread.sleep(2000);
    }

    @Then("User already Detail product out")
    public void verifyLabelProductout() throws InterruptedException{
        Assert.assertTrue(outboundUserPage.verifyLabelDetailProductOut());
        Thread.sleep(3000);
    }

    @Then("User click button submit outbound")
    public void ClickButtonsubmit() throws InterruptedException{
        outboundUserPage.ClickButtonSubmit();
        Thread.sleep(500);
    }
    @Then("User click button tambah qty")
    public void ClickButtonOutboundQty() throws InterruptedException{
        outboundUserPage.ClickButtonUserQty();
        Thread.sleep(2000);
    }

    @Then("User click button minus qty")
    public void ClickButtonOutboundminusQty() throws InterruptedException{
        outboundUserPage.ClickButtonUserMinusQty();
        Thread.sleep(2000);
    }

    @And("User should see an success input data")
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
        Thread.sleep(3000);
    }

    @Then("User delete button")
    public void userDeleteButton() throws InterruptedException {
        Thread.sleep(2000);
        outboundUserPage.setButtonDeleteOutbound();
        Thread.sleep(2000);

    }
}
