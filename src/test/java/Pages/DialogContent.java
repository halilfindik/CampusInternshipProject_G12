package Pages;

import Utilities.Gwd;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']//input")
    private WebElement codeInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']//input")
    private WebElement shortName;

    @FindBy(xpath="//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;

    @FindBy(xpath="//ms-add-button[contains(@tooltip,'GENERAL.BUTTON.ADD')]//button")
    private WebElement addButtonAlternative;

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

    @FindBy(xpath = "(//*[contains(@class,'mat-select-arrow-wrapper ng')])[1]")
    private WebElement arrowOne;

    @FindBy(xpath = "(//*[contains(@class,'mat-select-arrow-wrapper ng')])[2]")
    private WebElement arrowTwo;

    @FindBy(xpath = "(//*[contains(@class,'mat-select-arrow-wrapper ng')])[3]")
    private WebElement arrowThree;

    @FindBy(xpath = "(//mat-option[@role='option']/span)[1]")
    private WebElement dropDownOptionOne;

    @FindBy(xpath = "(//mat-option[@role='option']/span)[2]")
    private WebElement dropDownOptionTwo;

    @FindBy(xpath = "(//mat-option[@role='option']/span)[3]")
    private WebElement dropDownOptionThree;

    @FindBy(xpath = "(//mat-option[@role='option']/span)[4]")
    private WebElement dropDownOptionFour;

    @FindBy(xpath = "(//mat-option[@role='option']/span)[5]")
    private WebElement dropDownOptionFive;

    @FindBy(xpath = "(//mat-option[@role='option']/span)[6]")
    private WebElement dropDownOptionSix;

    @FindBy(xpath = "(//mat-option[@role='option']/span)[7]")
    private WebElement dropDownOptionSeven;

    @FindBy(xpath = "(//mat-option[@role='option']/span)[8]")
    private WebElement dropDownOptionEight;

    @FindBy(xpath = "//*[contains(@class,'bounding')]")
    private WebElement transparentBackdrop;

    @FindBy(xpath = "//ms-masked-text-field[@formcontrolname='iban']//input")
    private WebElement ibanInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='integrationCode']//input")
    private WebElement integrationCodeInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='description']//input")
    private WebElement descriptionInput;

    @FindBy(xpath = "//ms-integer-field[@formcontrolname='priority']//input")
    private WebElement numericInput;

    @FindBy(xpath = "//ms-integer-field[@formcontrolname='capacity']//input")
    private WebElement capacity;

    @FindBy(xpath = "(//*[@role='combobox'])[1]")
    private WebElement  comboBox;


    WebElement myElement;
    public void findAndSend(String strElement, String value) {
        switch (strElement)
        {
            case "username"             : myElement=username; break;
            case "password"             : myElement=password; break;
            case "shortName"            : myElement=shortName; break;
            case "nameInput"            : myElement=nameInput; break;
            case "searchInput"          : myElement=searchInput; break;
            case "codeInput"            : myElement=codeInput; break;
            case "capacity"             : myElement=capacity; break;
            case "ibanInput"            : myElement=ibanInput; break;
            case "integrationCodeInput" : myElement=integrationCodeInput; break;
            case "descriptionInput"     : myElement=descriptionInput; break;
            case "numericInput"         : myElement=numericInput; break;

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
            case "addButtonAlternative" : myElement=addButtonAlternative; break;
            case "arrowOne"             : myElement=arrowOne; break;
            case "arrowTwo"             : myElement=arrowTwo; break;
            case "dropDownOptionOne"    : myElement=dropDownOptionOne; break;
            case "dropDownOptionTwo"    : myElement=dropDownOptionTwo; break;
            case "dropDownOptionThree"  : myElement=dropDownOptionThree; break;
            case "dropDownOptionFour"   : myElement=dropDownOptionFour; break;
            case "dropDownOptionFive"   : myElement=dropDownOptionFive; break;
            case "dropDownOptionSix"    : myElement=dropDownOptionSix; break;
            case "dropDownOptionSeven"  : myElement=dropDownOptionSeven; break;
            case "dropDownOptionEight"  : myElement=dropDownOptionEight; break;
            case "arrowThree"           : myElement=arrowThree; break;
            case "transparentBackdrop"  : myElement=transparentBackdrop; break;
            case "comboBox"             : myElement=comboBox; break;
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
    public void findAndClickTab(String strElement) {
        switch (strElement)
        {
            case "dropDownOptionFour" : myElement = dropDownOptionFour; break;
        }
        myElement.sendKeys(Keys.TAB);
    }

    public void returnToForm(String strElement) {
        switch (strElement)
        {
            case "arrowThree" : myElement = arrowThree; break;
        }
        returnToElement(myElement);
    }

    public void waitUntilAllElementsLoaded() {
        waitUntilAllElementsLoadedFunction();
    }

    public void waitUntilStalenessAndClick(String strElement) {
        switch (strElement) {
            case "arrowOne" : myElement=arrowOne; break;
        }
        waitUntilStalenessAndClickFunction(myElement);
    }

}