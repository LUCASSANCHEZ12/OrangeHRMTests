package stepDefinitions;

import Pages.PIMPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import Pages.HomePage;
import utilities.DriverManager;

public class PIMSteps {

    PIMPage pimPage = new PIMPage(DriverManager.getDriver().driver);

    @Then("I click on the Add button")
    public void AddEmployee() throws InterruptedException {
        Thread.sleep(3000);
        pimPage.addEmployee();
    }

    @And("I set the first name as {string}")
    public void setEmployeeFirstName(String Name) throws InterruptedException {
        Thread.sleep(3000);
        pimPage.setFirstNameTextBox(Name);
    }

    @And("I set the middle name as {string}")
    public void setEmployeeMiddleName(String Name) throws InterruptedException {
        Thread.sleep(3000);
        pimPage.setMiddleNameTextBox(Name);
    }

    @And("I set the last name as {string}")
    public void setEmployeeLastName(String Name) throws InterruptedException {
        Thread.sleep(3000);
        pimPage.setLastNameTextBox(Name);
    }

    @When("I click on the switch button")
    public void clickSwitchButton() throws InterruptedException{
        Thread.sleep(3000);
        pimPage.clickSwitchButton();
    }

    @Then("I set the username {string} and password {string}")
    public void setUserName(String user, String password) throws InterruptedException{
        Thread.sleep(2000);
        pimPage.setUserName(user);
        Thread.sleep(2000);
        pimPage.setPassword(password);
        Thread.sleep(2000);
        pimPage.confirmPassword(password);
    }
    @And("I save the new employee information")
    public void saveInformation() throws InterruptedException {
        Thread.sleep(2000);
        pimPage.clickSaveButton();
    }

    @Then("I search the employee by their name: {string}")
    public void SearchEmployee(String name) throws InterruptedException {
        pimPage.FindByName(name);
        Thread.sleep(2000);
        pimPage.clickSearchButton();
    }
    @Then("I click on the trash button")
    public void DeleteEmployee() throws InterruptedException {
        Thread.sleep(1000);
        pimPage.clickTrashButton();
    }
    @Then("I delete the employee")
    public void deleteEmployee(){
        pimPage.clickTheDeleteButton();
    }

}