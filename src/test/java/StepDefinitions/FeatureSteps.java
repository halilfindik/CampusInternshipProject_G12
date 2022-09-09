package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import javax.xml.crypto.Data;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;

public class FeatureSteps {
    LeftNav leftNav=new LeftNav();
    DialogContent dialogContent=new DialogContent();

    @Given("Click on the element in the Left Navigation Panel")
    public void clickOnTheElementInTheLeftNavigationPanel(DataTable elements) {
        List<String> listElement = elements.asList(String.class);

        for (int i=0; i<listElement.size(); i++) {
            leftNav.findAndClick(listElement.get(i));
        }
    }

    @When("Click on the element in the Dialog Content")
    public void clickOnTheElementInTheDialog(DataTable elements) {
        List<String> listElement = elements.asList(String.class);

        for (int i=0; i<listElement.size(); i++) {
            dialogContent.findAndClick(listElement.get(i));
        }
    }



    @And("User sends the keys in the Dialog Content")
    public void userSendsTheKeysInTheDialogContent(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);

        for (int i=0; i<listElement.size(); i++) {
            dialogContent.findAndSend(listElement.get(i).get(0),listElement.get(i).get(1));
        }
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dialogContent.findAndContainsText("successMessage","success");
    }

    @When("User searches for the desired item in the Dialog Content")
    public void userSearchesForTheDesiredItemInTheDialogContent(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);

        for (int i=0; i<listElement.size(); i++) {
            dialogContent.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));
        }
    }

    @And("Click TAB on the element in the Dialog Content")
    public void clickTABOnTheElementInTheDialogContent() {
        dialogContent.findAndClickTab("dropDownOptionFour");
    }
    @And("Click ROBOT TAB on the element in the Dialog Content")
    public void clickROBOTTABOnTheElementInTheDialogContent()  {
        Robot robot=null;
        try {
            robot=new Robot();
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
        robot.keyPress(KeyEvent.VK_TAB);

    }

    @And("Return to the form on the element in the Dialog Content")
    public void returnToTheFormOnTheElementInTheDialogContent() {
        dialogContent.returnToForm("arrowThree");
    }

    @When("Wait for all elements to be loaded")
    public void waitForAllElementsToBeLoaded() {
        dialogContent.waitUntilAllElementsLoaded();
    }

    @When("Wait until combo box to be clickable")
    public void waitUntilComboBoxToBeClickable(DataTable elements) {
        List<String> listElement = elements.asList(String.class);

        for (int i=0; i<listElement.size(); i++) {
            dialogContent.waitUntilStalenessAndClick(listElement.get(i));
        }
    }
}
