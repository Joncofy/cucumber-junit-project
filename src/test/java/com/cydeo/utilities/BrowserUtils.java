package com.cydeo.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;


public class BrowserUtils {
    //Methods are static. Because we do not want to create an object to call those methods.
    // We just want to call those methods with class name. That is why they are static type


    /**
     * This method is used to pause the code for given seconds
     * It is static method we can call with class name
     * BrowserUtils.sleep(3);
     * @param seconds
     */
    public static void sleep(int seconds){
        // 1 second = 1000 millis
        // millis = seconds*1000

        try {
            Thread.sleep(seconds*1000);
        }catch(InterruptedException e){
            e.printStackTrace();
            System.out.println("Exception happened in sleep method!");
        }
    }

    public static void waitUntilNotVisible(WebElement element, int seconds){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),seconds);
        wait.until(ExpectedConditions.invisibilityOf(element));
    }

    public static void waitUntilVisible(WebElement element, int seconds) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), seconds);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public static void waitUntilClickable(WebElement element, int seconds) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), seconds);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static List<String> dropdownOptionsAsString (WebElement dropdownElement){

        Select select = new Select(dropdownElement);

        List<WebElement> actualOptionsAsElement = select.getOptions();

        List<String> actualOptionsAsString = new ArrayList<>();

        for (WebElement each :actualOptionsAsElement){
            actualOptionsAsString.add(each.getText());
        }
        return actualOptionsAsString;
    }
    public static void clickRadioButton(List<WebElement> radioButtons, String attributeValue) {
        for (WebElement eachButton : radioButtons) {
            if (eachButton.getAttribute("value").equalsIgnoreCase(attributeValue)) {
                eachButton.click();
            }
        }
    }


}
