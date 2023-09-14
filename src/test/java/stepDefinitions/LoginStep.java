package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import Pages.LoginPage;
import utilities.DriverManager;

public class LoginStep {

    LoginPage loginPage = new LoginPage(DriverManager.getDriver().driver);

    @Given("I set the user name field with {string}")
    public void setUserName(String userName) throws InterruptedException {
        Thread.sleep(1000);
        loginPage.setUserNameTextBox(userName);
    }

    @And("I set the password field with {string}")
    public void setPassword(String password) throws InterruptedException {
        Thread.sleep(1000);
        loginPage.setPasswordTextBox(password);
    }

    @When("I click on the login button")
    public void clickOnLoginButton() throws InterruptedException {
        Thread.sleep(3000);
        loginPage.clickLoginButton();
    }

    @Then("An error message should be displayed")
    public void verifyErrorMessage()throws InterruptedException {
        Thread.sleep(3000);
        Assertions.assertTrue(loginPage.loginErrorDisplayed());
    }

}
