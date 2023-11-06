package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeletePage {
    private final WebDriver webDriver;
    public DeletePage(WebDriver driver){
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[4]/div[1]/div[1]/div[2]/label[1]")
    private WebElement buttonDelete;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]")
    private WebElement labelDelete;

    @FindBy(xpath = "/html/body/div/div[4]/div[2]/div/section/div/button[1]")
    private WebElement buttonYa;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[4]/div[1]/div[1]/div[2]/label[1]")
    private WebElement buttonDeleteInvalid;
    @FindBy(xpath = "/html/body/div/div[4]/div[2]/div/section/div/button[2]")
    private WebElement buttonNo;

    @FindBy(xpath = "/html/body/div")
    private WebElement labelMyProduct;

    public void setButtonDelete(){
        buttonDelete.click();
    }
    public void setButtonYa(){
        buttonYa.click();
    }
    public void setButtonDeleteInvalid(){
        buttonDeleteInvalid.click();
    }
    public void setButtonNo(){
        buttonNo.click();
    }
    public boolean labelMyProductDisplayed(){
        return labelMyProduct.isDisplayed();
    }
}
