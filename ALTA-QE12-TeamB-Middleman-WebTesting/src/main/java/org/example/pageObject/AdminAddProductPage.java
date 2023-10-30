package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminAddProductPage {
    private WebDriver webDriver;
    public AdminAddProductPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }
    @FindBy(xpath = "/html[1]/body[1]/div[1]/form[1]/div[1]/button[1]")
    private WebElement buttonProduct;

    @FindBy(xpath = "//div[@id='__next']/div[@class='modal']//input[@id='input-image']")
    private WebElement inputImage;

    @FindBy(xpath = "//div[@id='__next']/div[@class='modal']//input[@id='input-name']")
    private WebElement inputProduct;

    @FindBy(xpath = "//div[@id='__next']/div[@class='modal']//input[@id='input-unit']")
    private WebElement inputUnit;

    @FindBy(xpath = "//div[@id='__next']/div[@class='modal']//input[@id='input-stock']")
    private WebElement inputStock;

    @FindBy(xpath = "//div[@id='__next']/div[@class='modal']//input[@id='input-price']")
    private WebElement inputPrice;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[5]/div[1]/form[1]/div[2]/button[1]")
    private WebElement buttonAdd;

    public AdminAddProductPage() {
    }

    public void setButtonProduct(){
        buttonProduct.click();
    }
    public void setInputImage(String inptImage){
        inputImage.sendKeys(inptImage);
    }
    public void setInputProduct(String inptProduct){
        inputProduct.sendKeys(inptProduct);
    }
    public void setInputUnit(String inptUnit){
        inputUnit.sendKeys(inptUnit);
    }
    public void setInputStock(String inptStock){
        inputStock.sendKeys(inptStock);
    }
    public void setInputPrice(String inptPrice){
        inputPrice.sendKeys(inptPrice);
    }
    public void setButtonAdd(){
        buttonAdd.click();
    }
}
