package Pages;

import com.google.common.collect.Ordering;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.DriverManager;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class HomePage {
    WebDriver driver;

    @FindBy(className = "oxd-topbar-header-title")
    WebElement pageTitle;

    @FindBy(xpath = "//a[text()='Logout']")
    WebElement logoutButton;

    @FindBy(xpath = "//span[text()='PIM']")
    WebElement pimPage;



    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean pageTitleIsDisplayed(){
        return pageTitle.isDisplayed();
    }

    public void dropDownClick(){
        WebElement dropDown = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.className("oxd-userdropdown-tab")));
        dropDown.click();
    }
    public void logoutClick(){
        logoutButton.click();
    }

    public void clickPIMButton(){
        pimPage.click();
    }
}
