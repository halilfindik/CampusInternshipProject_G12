package Pages;

import Utilities.Gwd;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Parent {

    public DialogContent() {
        PageFactory.initElements(Gwd.getDriver(), this);
    }

    @FindBy(id="mat-input-0")
    private WebElement username;

    @FindBy(id="mat-input-1")
    private WebElement password;

    @FindBy(css="button[aria-label='LOGIN']")
    private WebElement loginButton;

    @FindBy(xpath="(//span[contains(text(),'Dashboard')])[2]")
    private WebElement dashboard;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    private WebElement nameInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']//input")
    private WebElement shortName;

    @FindBy(xpath="//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;

    @FindBy(xpath="//ms-save-button//button")
    private WebElement saveButton;

    @FindBy(xpath = "//div[contains(text(),'already exists')]")
    private WebElement alreadyExists;

    @FindBy(xpath = "(//button[@class='consent-give'])[1]")
    private WebElement acceptCookies;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successMessage;

    @FindBy(xpath="//ms-edit-button//button")
    private WebElement editButton;

    @FindBy(xpath = "//ms-delete-button//button")
    private WebElement deleteButton;

    @FindBy(xpath = "(//ms-text-field//input)[1]")
    private WebElement searchInput;

    @FindBy(xpath = "//ms-search-button//button")
    private WebElement searchButton;

    @FindBy(xpath = "(//div[@class='ng-star-inserted']//button)[2]")
    private WebElement approveDeleteButton;


    WebElement myElement;
    public void findAndSend(String strElement, String value) {
        switch (strElement)
        {
            case "username"             : myElement=username; break;
            case "password"             : myElement=password; break;
            case "shortName"            : myElement=shortName; break;
            case "nameInput"            : myElement=nameInput; break;
            case "searchInput"          : myElement=searchInput; break;
        }
        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement) {
        switch (strElement)
        {
            case "acceptCookies"        : myElement =acceptCookies; break;
            case "loginButton"          : myElement=loginButton; break;
            case "addButton"            : myElement=addButton; break;
            case "saveButton"           : myElement=saveButton; break;
            case "editButton"           : myElement=editButton; break;
            case "searchButton"         : myElement=searchButton; break;
            case "deleteButton"         : myElement=deleteButton; break;
            case "approveDeleteButton"  : myElement=approveDeleteButton; break;
        }
        clickFunction(myElement);
    }
    public void findAndContainsText(String strElement, String text) {
        switch (strElement)
        {
            case "dashboard"                : myElement = dashboard; break;
            case "alreadyExists"            : myElement = alreadyExists; break;
            case "successMessage"           : myElement = successMessage; break;
        }
        verifyContainsText(myElement, text);
    }
    public void searchAndDelete(String searchText) {
        findAndSend("searchInput",searchText);
        findAndClick("searchButton");

        waitUntilLoading();

        findAndClick("deleteButton");
        findAndClick("deleteDialogButton");
    }

    public void searchAndClickEdit(String strElement, String searchText) {
        findAndSend(strElement, searchText);
        findAndClick("searchButton");
        waitUntilLoading();
        findAndClick("editButton");
    }

}