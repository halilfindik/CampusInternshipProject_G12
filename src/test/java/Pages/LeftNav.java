package Pages;

import Utilities.Gwd;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent{

    public LeftNav() {
        PageFactory.initElements(Gwd.getDriver(),this);
    }

    @FindBy(xpath="(//span[text()='Setup'])[1]")
    private WebElement setupOne;

    @FindBy(xpath="//span[text()='Parameters']")
    private WebElement parameters;

    @FindBy(xpath = "(//span[text()='Positions'])[1]")
    private WebElement positions;

    @FindBy(xpath="//span[text()='Countries']")
    private WebElement countries;

    @FindBy(xpath="(//span[text()='Setup'])[2]")
    private WebElement setupTwo;

    @FindBy(xpath="(//span[text()='Setup'])[3]")
    private WebElement setupThree;

    @FindBy(xpath="//span[text()='Human Resources']")
    private WebElement humanResources;

    @FindBy(xpath="//span[text()='Employees']")
    private WebElement employees;

    @FindBy(xpath="//span[text()='Fields']")
    private WebElement fields;

    @FindBy(xpath="//span[text()='Document Types']")
    private WebElement documentTypes;

    @FindBy(xpath = "(//*[text()='Position Categories'])[1]")
    private WebElement positionCategories;

    @FindBy(xpath="(//span[text()='Bank Accounts'])[1]")
    private WebElement bankAccounts;

    @FindBy(xpath="(//span[text()='Discounts'])[1]")
    private WebElement discounts;

    @FindBy(xpath = "//*[text()='Education']")
    private WebElement education;

    @FindBy(xpath = "(//span[text()='Setup'])[4]")
    private WebElement setupFour;

    @FindBy(xpath = "//*[text()='Subject Categories']")
    private WebElement subjectCategories;

    @FindBy(xpath = "//*[text()='Attestations']")
    private WebElement attestations;

    @FindBy(xpath="//span[text()='School Setup']")
    private WebElement schoolSetup;

    @FindBy(xpath="//span[text()='Locations']")
    private WebElement locations;

    @FindBy(xpath="//span[text()='Departments']")
    private WebElement departments;

    @FindBy(xpath="//span[text()='Nationalities']")
    private WebElement nationalities;

    @FindBy(xpath="//span[text()='Grade Levels']")
    private WebElement gradeLevels;


    WebElement myElement;
    public void findAndClick(String strElement) {
        switch (strElement) {
            case "setupOne"         : myElement=setupOne; break;
            case "parameters"       : myElement=parameters; break;
            case "countries"        : myElement=countries; break;
            case "setupTwo"         : myElement=setupTwo; break;
            case "setupThree"       : myElement=setupThree; break;
            case "humanResources"   : myElement=humanResources; break;
            case "employees"        : myElement=employees; break;
            case "positions"        : myElement=positions; break;
            case "fields"           : myElement=fields; break;
            case "documentTypes"    : myElement=documentTypes; break;
            case "bankAccounts"     : myElement=bankAccounts; break;
            case "discounts"        : myElement=discounts; break;
            case "education"         : myElement=education; break;
            case "setupFour"         : myElement=setupFour; break;
            case "subjectCategories" : myElement=subjectCategories; break;
            case "positionCategories": myElement=positionCategories; break;
        }
        clickFunction(myElement);
    }
}
