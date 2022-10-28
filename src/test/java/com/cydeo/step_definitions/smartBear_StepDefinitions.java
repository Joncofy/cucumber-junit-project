package com.cydeo.step_definitions;


import com.cydeo.pages.smartBearPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;


public class smartBear_StepDefinitions {
    smartBearPage smartBearPage = new smartBearPage();

    @Given("User is logged into SmartBear Tester account and on Order page")
    public void user_is_logged_into_smart_bear_tester_account_and_on_order_page() {
        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        BrowserUtils.sleep(2);
        smartBearPage.usernameBox.sendKeys(ConfigReader.getProperty("srtBuserName"));
        smartBearPage.passwordBox.sendKeys((ConfigReader.getProperty("srtBpassword")), Keys.ENTER);
        BrowserUtils.waitUntilVisible(smartBearPage.orderLink, 2);
        smartBearPage.orderLink.click();

    }
    @When("User fills out the form as followed:")
    public void user_fills_out_the_form_as_followed() {
        System.out.println("User fills out the form as followed:");

    }
    @And("User selects FamilyAlbum from product dropdown")
    public void user_selects_family_album_from_product_dropdown() {
        smartBearPage.dropDown.click();

    }
    @And("User enters {string} to quantity")
    public void user_enters_to_quantity(String numbOfQuantity) {
        smartBearPage.quantityBox.sendKeys(numbOfQuantity);

    }
    @And("User enters {string} to costumer name")
    public void user_enters_to_costumer_name(String customerName) {
        smartBearPage.customerNameBox.sendKeys(customerName);

    }
    @And("User enters {string} Ave to street")
    public void user_enters_ave_to_street(String street) {
        smartBearPage.steer.sendKeys(street);

    }
    @And("User enters {string} to city")
    public void user_enters_to_city(String cityOf) {
        smartBearPage.city.sendKeys(cityOf);

    }
    @And("User enters {string} to state")
    public void user_enters_to_state(String stateOf) {
        smartBearPage.state.sendKeys(stateOf);

    }
    @And("User enters {string}")
    public void user_enters(String zipOf) {
        smartBearPage.zip.sendKeys(zipOf);

    }
    @And("User selects Visa as card type")
    public void user_selects_visa_as_card_type() {
        smartBearPage.card.click();

    }
    @And("User enters {string} to card number")
    public void user_enters_to_card_number(String cardNumbOf) {
        smartBearPage.cardNumber.sendKeys(cardNumbOf);

    }
    @And("User enters {string} to expiration date")
    public void user_enters_to_expiration_date(String expireDateOf) {
    smartBearPage.expireDate.sendKeys(expireDateOf);
    }
    @And("User clicks process button")
    public void user_clicks_process_button() {
        smartBearPage.ProcessBtn.click();

    }
    @Then("User verifies {string} is in the list")
    public void user_verifies_is_in_the_list(String johnWickVerify) {
        smartBearPage.viewAllOrdersBtn.click();
        BrowserUtils.waitUntilVisible(smartBearPage.johnWick,2);
        Assert.assertTrue(smartBearPage.johnWick.isDisplayed());



    }

}

