package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OutboundUserPage {
    public static WebDriver webDriver;

    public OutboundUserPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }

    @FindBy(xpath = "//ul[@class='menu menu-horizontal font-Roboto font-medium']//a[@id='to-outbound']")
    private WebElement clickoutbound;

    @FindBy(xpath = "//div[@id='__next']")
    private WebElement labeloutboundpro;

    @FindBy(xpath = "//button[@id='to-history-outbound']")
    private WebElement clickHistoryproout;

    @FindBy(xpath = "//div[@id='__next']")
    private WebElement labelHistoryproout;

    @FindBy(xpath = "//div[@class='grid grid-cols-1 gap-2 lg:grid-cols-3 my-4']/div[1]/button[@id='to-detail']")
    private WebElement clickDetailproout;

    @FindBy(xpath = "//div[@id='__next']")
    private WebElement labelDetailproout;

    @FindBy(xpath = "//button[@id='btn-submit']")
    private WebElement clicksubmit;
    @FindBy(xpath = "//div[@class='grid grid-cols-1 m-3 gap-2 md:grid-cols-2 lg:grid-cols-3']/div[1]//button[@id='increment']")
    private WebElement clickusertambahqty;

    @FindBy(xpath = "//div[@class='grid grid-cols-1 m-3 gap-2 md:grid-cols-2 lg:grid-cols-3']/div[1]//button[@id='decrement']")
    private WebElement clickuserminusqty;
    @FindBy(xpath = "//button[@id='btn-delete']")
    private WebElement clickdelete;



    public void ClickButtonOutboundPro(){
        clickoutbound.click();
    }

    public boolean verifyLabelOutboundProduct(){
        return labeloutboundpro.isDisplayed();
    }

    public void ClickButtonHistoryProductOut(){
        clickHistoryproout.click();
    }

    public boolean verifyLabelHistoryProductOut(){
        return labelHistoryproout.isDisplayed();
    }

    public void ClickButtonDetailProductOut(){
        clickDetailproout.click();
    }

    public boolean verifyLabelDetailProductOut(){
        return labelDetailproout.isDisplayed();
    }

    public void ClickButtonSubmit(){
        clicksubmit.click();
    }

    public void ClickButtonUserQty(){
        clickusertambahqty.click();
    }

    public void ClickButtonUserMinusQty(){
        clickuserminusqty.click();
    }

    public void setButtonDeleteOutbound(){
        clickdelete.click();
    }

}
