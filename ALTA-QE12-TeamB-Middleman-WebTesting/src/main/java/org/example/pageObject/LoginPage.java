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

    @FindBy(xpath = "//button[@id='to-login']")
    private WebElement buttonToLogin;

    @FindBy(xpath = "//input[@id='input-email']")
    private WebDriver inputUserName;

    @FindBy(xpath = "//input[@id='input-password']")
    private WebDriver inputPassword;

    @FindBy(xpath = "//button[@id='btn-login']")
    private WebDriver buttonLogin;

    public void acceptAlert() {
        Alert alert = webDriver.switchTo().alert();
        alert.accept();
    }






}
