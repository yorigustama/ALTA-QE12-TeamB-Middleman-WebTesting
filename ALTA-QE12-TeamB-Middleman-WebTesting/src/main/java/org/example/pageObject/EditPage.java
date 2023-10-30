package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditPage {
    private final WebDriver webDriver;
    public EditPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[4]/div[1]/div[1]/div[2]/button[1]")
    private WebElement buttonEdit;

    @FindBy(xpath = "//div[@class='grid grid-cols-1 gap-2 m-2 md:grid-cols-2 lg:grid-cols-3']/div[2]//h3[@class='text-3xl text-primary my-3 font-Roboto font-medium']")
    private WebElement labelScreen;

    @FindBy(xpath = "//div[@class='grid grid-cols-1 gap-2 m-2 md:grid-cols-2 lg:grid-cols-3']/div[2]//input[@id='input-image']")
    private WebElement inputChooseImage;

    @FindBy(xpath = "//input[@id='input-name']")
    private WebElement inputProduct;

    @FindBy(xpath = "//input[@id='input-unit']")
    private WebElement inputUnit;

    @FindBy(xpath = "//input[@id='input-stock']")
    private WebElement inputStock;

    @FindBy(xpath = "//input[@id='input-price']")
    private WebElement inputPrice;

    @FindBy(xpath = "//div[@class='grid grid-cols-1 gap-2 m-2 md:grid-cols-2 lg:grid-cols-3']/div[2]//button[@id='btn-edit']")
    private WebElement buttonEditChange;

    public void setButtonEdit(){
        buttonEdit.click();
    }
    public boolean verifyLabelScreen(){
        return labelScreen.isDisplayed();
    }
    public void setInputPilihImage(String inptChooseImage){
        inputChooseImage.sendKeys(inptChooseImage);
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
    public void setButtonEditChange(){
        buttonEditChange.click();
    }
}
