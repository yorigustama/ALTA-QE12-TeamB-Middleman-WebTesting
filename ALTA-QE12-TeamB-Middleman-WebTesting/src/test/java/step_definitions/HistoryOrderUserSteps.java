package step_definitions;


import io.cucumber.java.en.Then;
import org.example.pageObject.HistoryOrderUserPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class HistoryOrderUserSteps {
    private final WebDriver driver = Hooks.driver;
    HistoryOrderUserPage historyOrderPage = new HistoryOrderUserPage(driver);

    @Then("User click button History Order")
    public void ClickButtonHistoryOrderuser() throws InterruptedException{
        historyOrderPage.ClickButtonHistoryOrderUser();
        Thread.sleep(2000);
    }

    @Then("User already history order product")
    public void verifyLabelHistoryorderuseruser() throws InterruptedException{
        Assert.assertTrue(historyOrderPage.verifyLabelHistoryOrderUser());
        Thread.sleep(3000);
    }

    @Then("User click button detail history order")
    public void ClickButtonDetailHistoryorderuser() throws InterruptedException{
        historyOrderPage.ClickButtonDetailHistoryOrderUser();
        Thread.sleep(2000);
    }

    @Then("User already detail product order")
    public void verifyLabelDetailHistoryorderuser() throws InterruptedException{
        Assert.assertTrue(historyOrderPage.verifyLabelDetailHistoryOrderUser());
        Thread.sleep(3000);
    }
}
