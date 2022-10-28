package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class smartBearPage {

    public smartBearPage(){
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//input[@id='ctl00_MainContent_username']")
    public WebElement usernameBox;

    @FindBy(xpath = "//input[@id='ctl00_MainContent_password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//a[normalize-space()='Order']")
    public WebElement orderLink;

    @FindBy(xpath = "//option[@value='FamilyAlbum']")
    public WebElement dropDown ;


    @FindBy(xpath = "//input[@id='ctl00_MainContent_fmwOrder_txtQuantity']")
    public WebElement quantityBox;

    @FindBy(xpath = "//input[@id='ctl00_MainContent_fmwOrder_txtName']")
    public WebElement customerNameBox;

    @FindBy(xpath = "//input[@id='ctl00_MainContent_fmwOrder_TextBox2']")
    public WebElement steer;

    @FindBy(xpath = "//input[@id='ctl00_MainContent_fmwOrder_TextBox3']")
    public WebElement city;

    @FindBy(xpath = "//input[@id='ctl00_MainContent_fmwOrder_TextBox4']")
    public WebElement state;

    @FindBy(xpath = "//input[@id='ctl00_MainContent_fmwOrder_TextBox5']")
    public WebElement zip;

    @FindBy(xpath = "//input[@id='ctl00_MainContent_fmwOrder_cardList_0']")
    public WebElement card;


    @FindBy(xpath = "//input[@id='ctl00_MainContent_fmwOrder_TextBox6']")
    public WebElement cardNumber;

    @FindBy(xpath = "//input[@id='ctl00_MainContent_fmwOrder_TextBox1']")
    public WebElement expireDate;


    @FindBy(xpath = "//a[@id='ctl00_MainContent_fmwOrder_InsertButton']")
    public WebElement ProcessBtn;

    @FindBy(xpath = "//a[normalize-space()='View all orders']")
    public WebElement viewAllOrdersBtn;

    @FindBy(xpath = "//td[normalize-space()='John Wick']")
    public WebElement johnWick;

    @FindBy(xpath = "//h2[normalize-space()='List of All Orders']")
    public WebElement listOfOrders;

}
