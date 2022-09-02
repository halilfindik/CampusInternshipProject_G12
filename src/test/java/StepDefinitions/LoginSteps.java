package StepDefinitions;

import Pages.DialogContent;
import Utilities.Gwd;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    DialogContent dialogContent =new DialogContent();

    @Given("Navigate to Campus")
    public void navigateToCampus() {
        Gwd.getDriver().get("https://demo.mersys.io/");
        Gwd.getDriver().manage().window().maximize();
    }

    @When("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {
        dialogContent.findAndSend("username","richfield.edu");
        dialogContent.findAndSend("password","Richfield2020!");
        dialogContent.findAndClick("loginButton");
    }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
        dialogContent.findAndContainsText("dashboard","Dashboard");
        dialogContent.findAndClick("acceptCookies");
    }
}
