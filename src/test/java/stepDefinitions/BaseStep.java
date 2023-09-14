package stepDefinitions;

import io.cucumber.java.en.Given;
import utilities.DriverManager;

public class BaseStep {
    @Given("I am in open source orange page")
    public void gotoOrangeHRMPage(){
        DriverManager.getDriver().driver.get("https://opensource-demo.orangehrmlive.com/web/index.php");
        DriverManager.getDriver().driver.manage().window().maximize();
    }
}
