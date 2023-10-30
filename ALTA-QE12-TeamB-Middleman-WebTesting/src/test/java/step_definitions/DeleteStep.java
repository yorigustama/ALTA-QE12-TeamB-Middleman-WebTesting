package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.DeletePage;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DeleteStep {
    private final WebDriver driver = Hooks.driver;
    DeletePage deletePage = new DeletePage(driver);

    @When("Admin click button delete product")
    public void adminClickButtonDeleteProduct() throws InterruptedException {
        Thread.sleep(2000);
        deletePage.setButtonDelete();
        Thread.sleep(2000);
    }

    @Then("Admin click button Ya")
    public void adminClickButtonYa() throws InterruptedException {
        Thread.sleep(3000);
        deletePage.setButtonYa();
        Thread.sleep(3000);
    }

    @And("The product has been successfully deleted")
    public void theProductHasBeenSuccessfullyDeleted() throws InterruptedException {
        Thread.sleep(3000);
        WebDriverWait wait = new WebDriverWait(driver, 1000);
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        String expectedAlertMessage = "success delete product"; // Replace with your expected message
        Assert.assertTrue(alertText.contains(expectedAlertMessage));

        alert.accept();
    }

    //delete invalid

    @When("Admin click button delete product invalid")
    public void adminClickButtonDeleteProductInvalid() throws InterruptedException {
        Thread.sleep(2000);
        deletePage.setButtonDeleteInvalid();
        Thread.sleep(2000);
    }

    @Then("Admin click button No")
    public void adminClickButtonNo() throws InterruptedException {
        Thread.sleep(3000);
        deletePage.setButtonNo();
        Thread.sleep(3000);
    }

    @And("The screen will return to the my product display")
    public void theScreenWillReturnToTheMyProductDisplay() throws InterruptedException {
        Assert.assertTrue(deletePage.labelMyProductDisplayed());
        Thread.sleep(3000);
    }

}
