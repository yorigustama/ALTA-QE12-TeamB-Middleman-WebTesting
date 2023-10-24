package org.example.pageObject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver webDriver;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }


    @FindBy(xpath = "//input[@id='input-email']")
    private WebElement inputUserName;

    @FindBy(xpath = "//input[@id='input-password']")
    private WebElement inputPassword;

    @FindBy(xpath = "//button[@id='btn-login']")
    private WebElement buttonLogin;

    public void acceptAlert() {
        Alert alert = webDriver.switchTo().alert();
        alert.accept();
    }


    public void setInputUserName(String usrName){
        inputUserName.sendKeys(usrName);
    }
    public void setInputPassword(String pswrod){
        inputPassword.sendKeys(pswrod);
    }
    public void setButtonLogin(){
        buttonLogin.click();
    }








}
