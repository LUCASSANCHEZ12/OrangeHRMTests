package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import Pages.HomePage;
import utilities.DriverManager;

public class HomeSteps {
    HomePage homePage = new HomePage(DriverManager.getDriver().driver);

    @Then("The home page should be displayed")
    public void verifyHomePageIsDisplayed() throws InterruptedException {
        Thread.sleep(3000);
        Assertions.assertTrue(homePage.pageTitleIsDisplayed());
    }

    @Then("I logout")
    public void Logout() throws InterruptedException {
        Thread.sleep(3000);
        homePage.dropDownClick();
        Thread.sleep(3000);
        homePage.logoutClick();
    }

    @Then("I click on the PIM button")
    public void PIMPage() throws InterruptedException {
        Thread.sleep(3000);
        homePage.clickPIMButton();
    }

}
