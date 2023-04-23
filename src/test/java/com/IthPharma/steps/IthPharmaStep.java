package com.IthPharma.steps;


import com.IthPharma.pages.IthPharma;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static com.IthPharma.browserfactory.ManageBrowser.driver;

/**
 * Created by Ashish Mor
 */
public class IthPharmaStep {
    @Given("^As a user I am on Homepage$")
    public void asAUserIAmOnHomepage() {

    }

    @When("^I click On Home$")
    public void iClickOnHome() {
        new IthPharma().IclickOnHome();
    }


    @And("^I verify text \"([^\"]*)\"$")
    public void iVerifyText(String expectedMessage) {
        Assert.assertEquals("messase is not display", expectedMessage, new IthPharma().IIverifyText());

    }

    @And("^I click On registered Page$")
    public void iClickOnRegisteredPage() {
        new IthPharma().IclickOnRegisterPage();


    }


    @And("^I enter Username \"([^\"]*)\"$")
    public void iEnterUsername(String enterUsername) {
        new IthPharma().IEnterUserName(enterUsername);

    }


    @And("^I enter Password \"([^\"]*)\"$")
    public void iEnterPassword(String enterPassWord) {
        new IthPharma().IEnterPassWord(enterPassWord);

    }


    @And("^I enter Confrim Password \"([^\"]*)\"$")
    public void iEnterConfrimPassword(String enterConfirmPassWord) {
        new IthPharma().IEnterConfirmPassWord(enterConfirmPassWord);

    }

    @And("^I enter FullName \"([^\"]*)\"$")
    public void iEnterFullName(String enterFullName) {
        new IthPharma().IEnterFullName(enterFullName);

    }

    @And("^I enter Email Adress \"([^\"]*)\"$")
    public void iEnterEmailAdress(String enterEmailAddress) {
        new IthPharma().IEnterEmailAdress(enterEmailAddress);

    }


    @And("^I enter Hospital Name \"([^\"]*)\"$")
    public void iEnterHospitalName(String enterHospitalName) {
        new IthPharma().IEnterHospital(enterHospitalName);


    }

    @And("^I click on registered button$")
    public void iClickOnRegisteredButton() {
//        new IthPharma().IClickOnRegisteredButton(); (this is not clickable thats why I have used javascrip)
        WebElement ele = driver.findElement(By.xpath("//button[@name='registerButton']"));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].click()", ele);
    }


    @Then("^I verify texta \"([^\"]*)\"$")
    public void iVerifyTexta(String expectedMessage) {
        Assert.assertEquals("messase is not display", expectedMessage, new IthPharma().IIverifyText1());

    }
}
