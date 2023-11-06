package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutPage {

    public static WebDriver webDriver;

    public LogOutPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/label[1]")
    private WebElement buttonProfile;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[1]/button[1]")
    private WebElement buttonLogOut;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/button[1]")
    private WebElement buttonLogOutYes;

    public void setButtonLogOut(){
        buttonLogOut.click();
    }
    public void setButtonProfile(){
        buttonProfile.click();
    }
    public void setButtonLogOutYes(){
        buttonLogOutYes.click();
    }
}
