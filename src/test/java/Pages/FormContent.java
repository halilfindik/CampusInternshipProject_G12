package Pages;

import Utilities.Gwd;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormContent extends Parent{

    public FormContent() {
        PageFactory.initElements(Gwd.getDriver(), this);
    }

    @FindBy(xpath = "//*[@class='mat-select-arrow ng-tns-c93-536']")
    private WebElement schoolBoxTick;

    WebElement myElement;

    public void findAndClick(String strElement) {
        switch (strElement)
        {
            case "schoolBoxTick"      : myElement=schoolBoxTick; break;
        }
        clickFunction(myElement);
    }
}
