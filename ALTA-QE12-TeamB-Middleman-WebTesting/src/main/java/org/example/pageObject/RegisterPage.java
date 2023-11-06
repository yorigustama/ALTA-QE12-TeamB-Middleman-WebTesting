package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

    public static WebDriver webDriver;
    public RegisterPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/button[1]")
    private WebElement buttonToSingUp;
    @FindBy(xpath = "//input[@id='input-name']")
    private WebElement inputShopName;
    @FindBy(xpath = "//input[@id='input-email']")
    private WebElement inputEmail;
    @FindBy(xpath = "//input[@id='input-phone']")
    private WebElement inputPhoneNumber;
    @FindBy(xpath = "//input[@id='input-password']")
    private WebElement inputPassword;
    @FindBy(xpath = "//input[@id='input-address']")
    private WebElement inputAddress;
    @FindBy(xpath = "//button[@id='to-register']")
    private WebElement buttonRegister;
    @FindBy(xpath = "//img[@alt='store']")
    private WebElement logoMiddleman;



    public boolean logoMiddlemanDisplayed(){
        return logoMiddleman.isDisplayed();
    }
    public void setButtonToSingUp(){
        buttonToSingUp.click();
    }
    public void setInputUserNameRegister(String usrNameRegis){
        inputShopName.sendKeys(usrNameRegis);
    }
    public void setInputEmailRegister(String emailRegiste){
        inputEmail.sendKeys(emailRegiste);
    }
    public void setInputPhoneNumberRegister(String phoneNumberRegister){
        inputPhoneNumber.sendKeys(phoneNumberRegister);
    }
    public void setInputPasswordRegister(String passwordRegister){
        inputPassword.sendKeys(passwordRegister);
    }
    public void setInputAnddressRegister(String anddressRegister){
        inputAddress.sendKeys(anddressRegister);
    }
    public void setButtonRegister(){
        buttonRegister.click();
    }


}

