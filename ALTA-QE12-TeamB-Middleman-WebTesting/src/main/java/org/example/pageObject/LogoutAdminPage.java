package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutAdminPage {
    public static WebDriver webDriver;

    public LogoutAdminPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }

    @FindBy(xpath = "//div[@class='dropdown dropdown-end mx-2 hidden lg:block']")
    private WebElement clickLogoutAdmin;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-secondary text-white mt-2 p-1']")
    private WebElement clickbuttonlogout;

    @FindBy(xpath = "//div[@id='__next']/div[@class='modal']/div[.='LogoutAre you sure you want to logout ?YesNo']")
    private WebElement labelLogout;

    @FindBy(xpath = "//button[@id='btn-yes']")
    private WebElement clickButtonYes;

    @FindBy(xpath = "//button[@id='btn-no']")
    private WebElement clickButtonNo;

    @FindBy(xpath = "//img[@alt='store']")
    private WebElement logoMiddlemanawal;


    public void ClickButtonLogoutAdmin(){
        clickLogoutAdmin.click();
    }

    public void ClickButtonLogout(){
        clickbuttonlogout.click();
    }

    public boolean verifyLogoutYesOrNo(){
       return labelLogout.isDisplayed();
    }

    public void ClickLogoutYes(){
        clickButtonYes.click();
    }

    public void ClickLogoutNo(){
        clickButtonNo.click();
    }
    public boolean logoMiddlemanawalDisplayed(){
        return logoMiddlemanawal.isDisplayed();
    }


}
