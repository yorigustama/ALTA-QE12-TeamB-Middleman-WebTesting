package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pageObject.Inbound;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InboundSteps {

    private final WebDriver driver = Hooks.driver;
    Inbound inbound = new Inbound(driver);

    @Then("Admin click button inbound")
    public void ClickButtonInbound() throws InterruptedException{
        inbound.ClickButtonInboundPro();
        Thread.sleep(2000);
    }

    @Then("Admin already inbound product")
    public void verifyLabelinboundProduct() throws InterruptedException{
        Assert.assertTrue(inbound.verifyLabelInboundProduct());
        Thread.sleep(3000);
    }

    @Then("Admin click button tambah qty")
    public void ClickButtonInboundQty() throws InterruptedException{
        inbound.ClickButtonQty();
        Thread.sleep(2000);
    }

    @Then("Admin click button kurang qty")
    public void ClickButtonInboundkurangQty() throws InterruptedException{
        inbound.ClickButtonkurangQty();
        Thread.sleep(2000);
    }


    @Then("Admin click button history product in")
    public void ClickButtonHistoryproin() throws InterruptedException{
        inbound.ClickButtonHistoryProductIn();
        Thread.sleep(2000);
    }

    @Then("Admin already history in product")
    public void verifyLabelHistoryinProduct() throws InterruptedException{
        Assert.assertTrue(inbound.verifyLabelHistoryProductIn());
        Thread.sleep(3000);
    }

    @Then("Admin click button Detail history product in")
    public void ClickButtonDetailProin() throws InterruptedException{
        inbound.ClickButtonDetailProductIn();
        Thread.sleep(2000);
    }

    @Then("Admin already Detail product in")
    public void verifyLabelProductIn() throws InterruptedException{
        Assert.assertTrue(inbound.verifyLabelDetailProductIn());
        Thread.sleep(3000);
    }

    @Then("Admin click button submit inbound")
    public void ClickButtonsubmit() throws InterruptedException{
        inbound.ClickButtonSubmit();
        Thread.sleep(500);
    }

    @And("Admin should see an success input data")
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

    @Then("Admin delete button")
    public void userDeleteButton() throws InterruptedException {
        Thread.sleep(2000);
        inbound.setButtonDeleteInbound();
        Thread.sleep(2000);

    }
}
