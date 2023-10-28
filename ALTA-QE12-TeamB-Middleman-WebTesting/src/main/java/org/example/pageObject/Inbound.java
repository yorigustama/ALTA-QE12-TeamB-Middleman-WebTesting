package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Inbound {
    public static WebDriver webDriver;

    public Inbound(WebDriver driver){
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }

    @FindBy(xpath = "//ul[@class='menu menu-horizontal font-Roboto font-medium']//a[@id='to-cart']")
    private WebElement clickInbound;

    @FindBy(xpath = "//div[@class='bg-base-100 w-full h-screen']")
    private WebElement labelinboundpro;

    @FindBy(xpath = "//button[@id='to-history-outbound']")
    private WebElement clickHistoryproin;

    @FindBy(xpath = "//div[@id='__next']")
    private WebElement labelHistoryproin;

    @FindBy(xpath = "//div[@class='grid grid-cols-1 gap-2 lg:grid-cols-3 my-4']/div[1]/button[@id='to-detail']")
    private WebElement clickDetailproin;

    @FindBy(xpath = "//div[@class='m-4']")
    private WebElement labelDetailproin;

    @FindBy(xpath = "//button[@id='btn-submit']")
    private WebElement clicksubmit;

    @FindBy(xpath = "//div[@class='grid gap-2 m-2 grid-flow-row auto-rows-max grid-cols-1 md:grid-cols-2 lg:grid-cols-3 justify-center']/div[1]//button[@id='increment']")
    private WebElement clicktambahqty;

    @FindBy(xpath = "//button[@id='decrement']")
    private WebElement clickkurangqty;

    @FindBy(xpath = "//div[@class='grid gap-2 m-2 grid-flow-row auto-rows-max grid-cols-1 md:grid-cols-2 lg:grid-cols-3 justify-center']/div[2]//button[@id='btn-delete']")
    private WebElement clickdelete;



    public void ClickButtonInboundPro(){
        clickInbound.click();
    }

    public boolean verifyLabelInboundProduct(){
        return labelinboundpro.isDisplayed();
    }

    public void ClickButtonHistoryProductIn(){
        clickHistoryproin.click();
    }

    public boolean verifyLabelHistoryProductIn(){
        return labelHistoryproin.isDisplayed();
    }

    public void ClickButtonDetailProductIn(){
        clickDetailproin.click();
    }

    public boolean verifyLabelDetailProductIn(){
        return labelDetailproin.isDisplayed();
    }

    public void ClickButtonSubmit(){
        clicksubmit.click();
    }

    public void ClickButtonQty(){
        clicktambahqty.click();
    }

    public void ClickButtonkurangQty(){
        clickkurangqty.click();
    }

    public void setButtonDeleteInbound(){
        clickdelete.click();
    }




}
