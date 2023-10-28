package org.example.pageObject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginUserPage {
    private WebDriver webDriver;

    public LoginUserPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }


    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]")
    private WebElement tombolLogin;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[1]/input[1]")
    private WebElement inputemail;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[2]/input[1]")
    private WebElement inputPassw;

    @FindBy(xpath = "//button[@id='btn-login']")
    private WebElement buttonLogin;

    @FindBy(xpath = "//div[@id='__next']")
    private WebElement labelProd;

    @FindBy(xpath = "//img[@alt='store']")
    private WebElement logoMiddle;



    public void acceptAlert() {
        Alert alert = webDriver.switchTo().alert();
        alert.accept();
    }


    public boolean TampilanMiddlemanDisplayed(){
        return logoMiddle.isDisplayed();
    }

    public void setTombolLogin(){
        tombolLogin.click();
    }
    public void setInputUsrName(String userName){
        inputemail.sendKeys(userName);
    }
    public void setInputPasswo(String pswrod){
        inputPassw.sendKeys(pswrod);
    }
    public void setButtonlogin(){
        buttonLogin.click();
    }
    public boolean ProductDisplayed(){
        return labelProd.isDisplayed();
    }
}
