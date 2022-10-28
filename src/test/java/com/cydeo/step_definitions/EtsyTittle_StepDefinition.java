package com.cydeo.step_definitions;

import com.cydeo.pages.EtsyPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class EtsyTittle_StepDefinition {
    EtsyPage etsyPage = new EtsyPage();

    @Given("User on the Etsy page")
    public void user_on_the_etsy_page() {
        Driver.getDriver().get("https://www.etsy.com");

    }
    @When("User looks on the current page tab")
    public void user_looks_on_the_current_page_tab() {

    }
    @Then("User should see {string}")
    public void user_should_see(String expectedTittle) {
        Assert.assertEquals(expectedTittle,Driver.getDriver().getTitle());

    }

    @When("User types Wooden Spoon in the search box")
    public void userTypesWoodenSpoonInTheSearchBox() {
        etsyPage.searchQuery.sendKeys("Wooden Spoon");
    }

    @Then("User clicks search button")
    public void userClicksSearchButton() {
        etsyPage.searchtn.click();
    }

    @Then("User sees {string} is in the title")
    public void userSeesIsInTheTitle(String woodenSpoonTitle) {
        Assert.assertEquals(woodenSpoonTitle+" - Etsy",Driver.getDriver().getTitle());

    }
}
