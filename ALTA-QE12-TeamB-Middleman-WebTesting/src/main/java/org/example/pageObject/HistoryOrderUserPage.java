package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HistoryOrderUserPage {
    public static WebDriver webDriver;

    public HistoryOrderUserPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }

    @FindBy(xpath = "//ul[@class='menu menu-horizontal font-Roboto font-medium']//a[@id='to-history-order']")
    private WebElement clickHistoryOrderUser;

    @FindBy(xpath = "//div[@id='__next']")
    private WebElement labelHistoryOrderUser;

    @FindBy(xpath = "//div[@class='p-5 gap-4 grid grid-flow-row auto-rows-max grid-cols-1 md:grid-cols-2 lg:grid-cols-3']/div[1]//button[@id='to-detail_order']")
    private WebElement clickDetailHistoryOrderUser;

    @FindBy(xpath = "//div[@class='bg-base-100 min-h-screen']")
    private WebElement labeldetailHistoryOrderUser;

    public void ClickButtonHistoryOrderUser(){
        clickHistoryOrderUser.click();
    }

    public boolean verifyLabelHistoryOrderUser(){
        return labelHistoryOrderUser.isDisplayed();
    }

    public void ClickButtonDetailHistoryOrderUser(){
        clickDetailHistoryOrderUser.click();
    }

    public boolean verifyLabelDetailHistoryOrderUser(){
        return labeldetailHistoryOrderUser.isDisplayed();
    }


}
