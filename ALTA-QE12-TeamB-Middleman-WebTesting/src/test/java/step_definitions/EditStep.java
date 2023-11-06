package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.EditPage;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class EditStep {
    private final WebDriver driver = Hooks.driver;
    EditPage editPage = new EditPage(driver);

    @When("Admin click button edit")
    public void adminClickButtonEdit() throws InterruptedException {
        Thread.sleep(3000);
        editPage.setButtonEdit();
        Thread.sleep(3000);
    }

    @Then("Admin already on edit page")
    public void adminAlreadyOnEditPage() throws InterruptedException {
        Assert.assertTrue(editPage.verifyLabelScreen());
        Thread.sleep(3000);
    }

    @And("Admin input data {string} as a productName {string} as a unit {string} as a stock and {string} as a price")
    public void inputCredential(String inptProduct, String inptUnit, String inptStock, String inptPrice) throws InterruptedException {
        Thread.sleep(2000);
        editPage.setInputProduct(inptProduct);
        editPage.setInputUnit(inptUnit);
        editPage.setInputStock(inptStock);
        editPage.setInputPrice(inptPrice);
        Thread.sleep(3000);
    }

    @Then("Admin clicks the edit changes button")
    public void adminClicksTheEditChangesButton() throws InterruptedException {
        Thread.sleep(3000);
        editPage.setButtonEditChange();
        Thread.sleep(3000);
    }

    @And("Success update data")
    public void successUpdateData() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
}
