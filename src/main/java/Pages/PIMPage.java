package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
public class PIMPage {
    WebDriver driver;
    @FindBy(xpath = "//button[text()=' Add ']")
    WebElement addButton;

    @FindBy(className = "oxd-switch-input")
    WebElement switchButton;

    @FindBy(name = "firstName")
    WebElement fisrtName;

    @FindBy(name = "lastName")
    WebElement lastName;

    @FindBy(name = "middleName")
    WebElement middleName;

    @FindBy(xpath = "(//input[@data-v-1f99f73c])[6]")
    WebElement userName;

    @FindBy(xpath = "(//input[@data-v-1f99f73c])[7]")
    WebElement password;
    @FindBy(xpath = "(//input[@data-v-1f99f73c])[8]")
    WebElement confirmpassword;


    public PIMPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void addEmployee(){
        addButton.click();
    }

    public void clickSwitchButton(){
        switchButton.click();
    }
    public void setFirstNameTextBox(String Name){
        fisrtName.sendKeys(Name);
    }
    public void setMiddleNameTextBox(String MiddleName){
        middleName.sendKeys(MiddleName);
    }
    public void setLastNameTextBox(String LastName){
        lastName.sendKeys(LastName);
    }

    public void setUserName(String username){
        userName.sendKeys(username);
    }

    public void setPassword(String Password){
        password.sendKeys(Password);
    }

    public void confirmPassword(String Password){
        confirmpassword.sendKeys(Password);
    }

    public void clickSaveButton(){
        WebElement saveButton = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[text()=' Save ']")));
        saveButton.click();
    }

    public void FindByName(String name){
        WebElement findBy = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//input[@data-v-75e744cd])[1]")));
        findBy.sendKeys(name);
    }

    public void clickSearchButton(){
        WebElement searchButton = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//button[@data-v-10d463b7])[2]")));
        searchButton.click();
    }

    public void clickTrashButton(){
        WebElement trashButton = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//i[@class='oxd-icon bi-trash'])[1]")));
        trashButton.click();
    }

    public void clickTheDeleteButton(){
        WebElement deleteButton = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//button[@data-v-64d94959])[2]")));
        deleteButton.click();
    }
}
