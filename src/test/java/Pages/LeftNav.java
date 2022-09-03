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
        }
        clickFunction(myElement);
    }
}
