package com.cydeo.step_definitions;

import com.cydeo.pages.WebTablePage;
import com.cydeo.utilities.ConfigReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class WebTableLogin_StepDefs {

    WebTablePage webTablePage = new WebTablePage();

    @Given("use is on the login page of web table app")
    public void use_is_on_the_login_page_of_web_table_app() {
        Driver.getDriver().get(ConfigReader.getProperty("env"));
    }
    @When("user enters username {string}")
    public void user_enters_username(String string) {
        webTablePage.inputUserName.sendKeys(string);

    }
    @When("user enters password {string}")
    public void user_enters_password(String string) {
        webTablePage.inputPassword.sendKeys(string);

    }
    @When("user clicks to login button")
    public void user_clicks_to_login_button() {
        webTablePage.loginButton.click();

    }
    @Then("user should see url contains orders")
    public void user_should_see_url_contains_orders() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("orders"));

    }

    @When("user enters username {string} password {string} and logins")
    public void userEntersUsernamePasswordAndLogins(String username, String password) {
        webTablePage.login(username,password);
    }

    @When("user enters below credentials")
    public void userEntersBelowCredentials(Map<String,String> credentials) {
       webTablePage.login(credentials.get("username"),credentials.get("password"));


    }
}
