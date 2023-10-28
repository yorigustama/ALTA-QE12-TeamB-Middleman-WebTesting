package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchMyProduct {

    public static WebDriver webDriver;

    public SearchMyProduct(WebDriver driver){
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }

    @FindBy(xpath = "//input[@id='input-search']")
    private WebElement labelinputsearch;

    @FindBy(xpath = "//button[@id='btn-search']")
    private WebElement clickbuttonSearch;


    public void setInputSearch(String InSearch){

        labelinputsearch.sendKeys(InSearch);
    }

    public void ClickButtonSearchPro(){
        clickbuttonSearch.click();
    }






}
