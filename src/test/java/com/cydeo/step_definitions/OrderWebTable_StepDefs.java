package com.cydeo.step_definitions;

import com.cydeo.pages.OrderWebTablePage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

public class OrderWebTable_StepDefs {
        OrderWebTablePage orderWebTablePage = new OrderWebTablePage();

    @Given("user is already logged in and on order page")
    public void user_is_already_logged_in_and_on_order_page() {
        Driver.getDriver().get(ConfigReader.getProperty("envOwebTbl"));
        orderWebTablePage.loginOWT("Test","Tester");

    }
    @When("user selects product type {string}")
    public void user_selects_product_type(String string) {
            Select select = new Select(orderWebTablePage.productDD);
            select.selectByVisibleText(string);

    }
    @When("user enters quantity {int}")
    public void user_enters_quantity(Integer int1) {
        orderWebTablePage.quantityOWT.sendKeys(Keys.BACK_SPACE);
        orderWebTablePage.quantityOWT.sendKeys(""+int1);

    }
    @When("user enters customer name {string}")
    public void user_enters_customer_name(String string) {
        orderWebTablePage.customerName.sendKeys(string);
    }
    @When("user enters street {string}")
    public void user_enters_street(String string) {
        orderWebTablePage.customerStreet.sendKeys(string);

    }
    @When("user enters city {string}")
    public void user_enters_city(String string) {
        orderWebTablePage.customerCity.sendKeys(string);

    }
    @When("user enters state {string}")
    public void user_enters_state(String string) {
        orderWebTablePage.customerState.sendKeys(string);

    }
    @When("user enters zipcode {string}")
    public void user_enters_zipcode(String string) {
        orderWebTablePage.customerZip.sendKeys(string);

    }
    @When("user selects credit card type {string}")
    public void user_selects_credit_card_type(String string) {
        BrowserUtils.clickRadioButton(orderWebTablePage.cardsType,string);

    }
    @When("user enters credit card number {string}")
    public void user_enters_credit_card_number(String string) {
    orderWebTablePage.customerCardNo.sendKeys(string);
    }
    @When("user enters expiry date {string}")
    public void user_enters_expiry_date(String string) {
        orderWebTablePage.customerCardExp.sendKeys(string);

    }
    @When("user enters process order button")
    public void user_enters_process_order_button() {
        orderWebTablePage.processOrderBtn.click();

    }
    @Then("user should see {string} in first row of the web table")
    public void user_should_see_in_first_row_of_the_web_table(String string) {
        Assert.assertTrue(orderWebTablePage.firstRow.getText().contains(string));
    }

    @And("user enters quantity {string}")
    public void userEntersQuantity(String arg0) {
        orderWebTablePage.quantityOWT.sendKeys(arg0);
    }
}
