package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HistoryOrderPage {
    public static WebDriver webDriver;

    public HistoryOrderPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }

    @FindBy(xpath = "//ul[@class='menu menu-horizontal font-Roboto font-medium']//a[@id='to-history-order']")
    private WebElement clickHistoryOrder;

    @FindBy(xpath = "//div[@id='__next']")
    private WebElement labelHistoryOrder;

    @FindBy(xpath = "//tbody[1]//button[@id='to-detail-order']")
    private WebElement clickDetailHistoryOrder;

    @FindBy(xpath = "//div[@class='bg-base-100 min-h-screen']")
    private WebElement labeldetailHistoryOrder;

    public void ClickButtonHistoryOrder(){
        clickHistoryOrder.click();
    }

    public boolean verifyLabelHistoryOrder(){
        return labelHistoryOrder.isDisplayed();
    }

    public void ClickButtonDetailHistoryOrder(){
        clickDetailHistoryOrder.click();
    }

    public boolean verifyLabelDetailHistoryOrder(){
        return labeldetailHistoryOrder.isDisplayed();
    }


}
