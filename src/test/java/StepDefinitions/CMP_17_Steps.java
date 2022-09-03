package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class CMP_17_Steps {
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
}
