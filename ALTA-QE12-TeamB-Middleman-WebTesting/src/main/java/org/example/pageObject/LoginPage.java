package org.example.pageObject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public static WebDriver webDriver;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]")
    private WebElement buttonToLogin;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[1]/input[1]")
    private WebElement inputEmail;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[2]/input[1]")
    private WebElement inputPassword;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/button[1]")
    private WebElement buttonLogin;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/h1[1]")
    private WebElement labelProduct;

    @FindBy(xpath = "//img[@alt='store']")
    private WebElement logoMiddleman;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[4]/div[1]/div[1]/div[2]/label[1]")
    private WebElement buttonDeleteMyProd;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[3]/h1[1]")
    private WebElement dashboardUser;


    public boolean logoMiddlemanDisplayed(){
        return logoMiddleman.isDisplayed();
    }

    public void setButtonToLogin(){
        buttonToLogin.click();
    }
    public void setInputUserName(String usrName){
        inputEmail.sendKeys(usrName);
    }
    public void setInputPassword(String pswrod){
        inputPassword.sendKeys(pswrod);
    }
    public void setButtonLogin(){
        buttonLogin.click();
    }
    public boolean labelProductDisplayed(){
        return labelProduct.isDisplayed();
    }
    public void setButtonDeleteMyProd(){
        buttonDeleteMyProd.click();
    }
    public boolean setdasboardUser(){
        return dashboardUser.isDisplayed();
    }








}
