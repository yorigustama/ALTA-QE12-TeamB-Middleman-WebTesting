package step_definitions;

import io.cucumber.java.en.Then;
import org.example.pageObject.SearchMyProduct;
import org.openqa.selenium.WebDriver;

public class SearchMyProductSteps {
    private final WebDriver driver = Hooks.driver;
    SearchMyProduct searchMyProduct = new SearchMyProduct(driver);

    @Then("User input {string} in search product")
    public void inputSearchPro(String Insearch) throws InterruptedException {
        searchMyProduct.setInputSearch(Insearch);
        Thread.sleep(5000);
    }

    @Then("User click button search")
    public void ClickButtonmySearch() throws InterruptedException{
        searchMyProduct.ClickButtonSearchPro();
        Thread.sleep(2000);
    }



}
