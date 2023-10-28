package step_definitions;


import io.cucumber.java.en.Then;
import org.example.pageObject.HistoryOrderPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class HistoryOrderSteps {
    private final WebDriver driver = Hooks.driver;
    HistoryOrderPage historyOrderPage = new HistoryOrderPage(driver);

    @Then("Admin click button History Order")
    public void ClickButtonHistoryOrder() throws InterruptedException{
        historyOrderPage.ClickButtonHistoryOrder();
        Thread.sleep(2000);
    }

    @Then("Admin already history order product")
    public void verifyLabelHistoryorder() throws InterruptedException{
        Assert.assertTrue(historyOrderPage.verifyLabelHistoryOrder());
        Thread.sleep(3000);
    }

    @Then("Admin click button detail history order")
    public void ClickButtonDetailHistoryorder() throws InterruptedException{
        historyOrderPage.ClickButtonDetailHistoryOrder();
        Thread.sleep(2000);
    }

    @Then("Admin already detail product order")
    public void verifyLabelDetailHistoryorder() throws InterruptedException{
        Assert.assertTrue(historyOrderPage.verifyLabelDetailHistoryOrder());
        Thread.sleep(3000);
    }
}
