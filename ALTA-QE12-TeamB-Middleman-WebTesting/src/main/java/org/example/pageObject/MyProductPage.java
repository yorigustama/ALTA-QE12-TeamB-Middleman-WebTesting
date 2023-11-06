package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyProductPage {
    public static WebDriver webDriver;

    public MyProductPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }

    @FindBy(xpath = "//ul[@class='menu menu-horizontal font-Roboto font-medium']//a[@id='to-inventory']")
    private WebElement clickMyProduct;

    @FindBy(xpath = "//div[@id='__next']")
    private WebElement labelMyProduc;

    @FindBy(xpath = "//input[@id='input-search']")
    private WebElement labelInputSearch;

    @FindBy(xpath = "//button[@id='btn-search']")
    private WebElement clickButtonSearch;

    @FindBy(xpath = "//div[@id='__next']")
    private WebElement labelMyproduct;

    @FindBy(xpath = "//div[@class='absolute top-0 right-0']")
    private WebElement clickTambahPro;

    @FindBy(xpath = "//div[@class='flex justify-center items-center text-lg md:text-3xl font-Roboto font-bold text-slate-700/20']")
    private WebElement labelNotFound;

    public void ClickButtonMyProduct(){
        clickMyProduct.click();
    }

    public boolean verifyLabelMyProduct(){
        return labelMyProduc.isDisplayed();
    }

    public void setInputSearch(String InSearch){

        labelInputSearch.sendKeys(InSearch);
    }

    public void ClickButtonSearchProdu(){
        clickButtonSearch.click();
    }

    public boolean verifyLabelMyADDProduct(){
        return labelMyproduct.isDisplayed();
    }

    public void ClickButtonAddPro(){clickTambahPro.click();
    }

    public boolean verifylabelNotfound(){
        return labelNotFound.isDisplayed();
    }


}
