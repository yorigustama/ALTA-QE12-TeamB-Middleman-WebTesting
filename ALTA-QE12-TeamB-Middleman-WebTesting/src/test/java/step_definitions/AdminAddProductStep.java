package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.AdminAddProductPage;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdminAddProductStep {
    private final WebDriver driver = Hooks.driver;
    AdminAddProductPage adminAddProductPage = new AdminAddProductPage(driver);

    @When("Admin click button add product")
    public void clickButtonAddProduct() throws InterruptedException {
        Thread.sleep(3000);
        adminAddProductPage.setButtonProduct();
        Thread.sleep(3000);
    }
    @Then("Admin choose file image")
    public void adminChooseFileImage() {
        WebElement browser = driver.findElement(By.xpath("//input[@id='input-image']"));
        browser.sendKeys("C:\\Users\\HP14s\\Foto\\contoh.jpeg");
        browser.submit();
    }

    @And("Admin input adds a new product {string} as a productName {string} as a unit {string} as a stock and {string} as a price")
    public void adminInputAddsANewProductAsAProductNameAsAUnitAsAStockAndAsAPrice(String inptProduct, String inptUnit, String inptStock, String inptPrice) throws InterruptedException {
        adminAddProductPage.setInputProduct(inptProduct);
        adminAddProductPage.setInputUnit(inptUnit);
        adminAddProductPage.setInputStock(inptStock);
        adminAddProductPage.setInputPrice(inptPrice);
        Thread.sleep(3000);
    }

    @And("Admin click button add")
    public void adminClickButtonAdd() throws InterruptedException {
        adminAddProductPage.setButtonAdd();
        Thread.sleep(3000);
    }

    @And("Success update data product")
    public void successUpdateDataProduct() throws InterruptedException {
        Thread.sleep(3000);
        WebDriverWait wait = new WebDriverWait(driver, 1000);
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        String expectedAlertMessage = "{Alert text : success update data}"; // Replace with your expected message
        Assert.assertTrue(alertText.contains(expectedAlertMessage));

        alert.accept();
    }
}
