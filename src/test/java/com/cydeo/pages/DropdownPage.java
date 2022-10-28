package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DropdownPage {

    public DropdownPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//a[normalize-space()='Dropdown']")
    public WebElement dropDownPage;

    @FindBy (id = "month")
    public WebElement monthDropdown;
}
