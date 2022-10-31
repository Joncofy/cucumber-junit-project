package com.cydeo.pages;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public  class OrderWebTablePage {

    public OrderWebTablePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name = "username")
    public WebElement userNameOWT;

    @FindBy(name = "password")
    public WebElement passwordOWT;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitBtnOWT;

    @FindBy(xpath = "//button[normalize-space()='Order']")
    public WebElement orderBtn;

    public void loginOWT(String userName, String password){
        userNameOWT.sendKeys(userName);
        passwordOWT.sendKeys(password);
        submitBtnOWT.click();
        BrowserUtils.waitUntilClickable(orderBtn,2);
        orderBtn.click();
    }
    @FindBy(name = "product")
    public WebElement productDD;

    @FindBy(name = "quantity")
    public  WebElement quantityOWT;

    @FindBy(name = "name")
    public WebElement customerName;

    @FindBy(name = "street")
    public WebElement customerStreet;

    @FindBy(name = "city")
    public WebElement customerCity;

    @FindBy(name = "state")
    public WebElement customerState;

    @FindBy(name = "zip")
    public WebElement customerZip;

    @FindBy(name = "cardNo")
    public WebElement customerCardNo;

    @FindBy(name = "cardExp")
    public WebElement customerCardExp;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement processOrderBtn;

    @FindBy(xpath = "//input[@name='card']")
    public List<WebElement> cardsType;

    @FindBy(xpath = "//tbody/tr[1]")
    public WebElement firstRow;





}
