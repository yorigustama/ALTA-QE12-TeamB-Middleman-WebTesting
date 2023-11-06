package step_definitions;

import PageObjects.MyProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyProductSteps {
    private final WebDriver driver = Hooks.driver;

    MyProductPage myProductPage = new MyProductPage(driver);

    @Then("User click button My Product")
    public void ClickButtonmyPro() throws InterruptedException{
        myProductPage.ClickButtonMyProduct();
        Thread.sleep(2000);
    }

    @Then("User already My product")
    public void verifyLabelHistoryorder() throws InterruptedException{
        Assert.assertTrue(myProductPage.verifyLabelMyProduct());
        Thread.sleep(3000);
    }

    @Then("User input {string} in search product")
    public void inputSearchProduc(String Insearch) throws InterruptedException {
        myProductPage.setInputSearch(Insearch);
        Thread.sleep(5000);
    }

    @Then("User click button search")
    public void ClickButtonSearch() throws InterruptedException{
        myProductPage.ClickButtonSearchProdu();
        Thread.sleep(2000);
    }

    @Then("User already product")
    public void verifymyProductHome() throws InterruptedException{
        Assert.assertTrue(myProductPage.verifyLabelMyADDProduct());
        Thread.sleep(3000);
    }

    @Then("User click button add product stock")
    public void ClickTambahProduct() throws InterruptedException{
        myProductPage.ClickButtonAddPro();
        Thread.sleep(2000);
    }

    @And("User should see an success creating a cart")
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
    @Then("User cannot find the data")
    public void verifynotfound() throws InterruptedException{
        Assert.assertTrue(myProductPage.verifylabelNotfound());
        Thread.sleep(3000);
    }
}
