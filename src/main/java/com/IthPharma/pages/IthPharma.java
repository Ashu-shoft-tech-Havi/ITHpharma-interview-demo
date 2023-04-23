package com.IthPharma.pages;


import com.IthPharma.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Set;

/**
 * Created by Ashish Mor
 */
public class IthPharma extends Utility {
    private static final Logger log = LogManager.getLogger(IthPharma.class.getName());

    // insitialise
    public IthPharma() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//header/ul[1]/li[1]/a[1]/span[1]/span[1]")
    WebElement home;


    @CacheLookup
    @FindBy(xpath = "//strong[contains(text(),'COVID 19')]")
    WebElement verifyText;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Register')]")
    WebElement registerPage;

    @CacheLookup
    @FindBy(xpath = "/html/body/main/div/div/div/form/div[2]/div/div/input")
    WebElement enterUserName;

    @CacheLookup
    @FindBy(xpath = "//input[@name='passwordFormGroup:passwordFormGroup_body:password']")
    WebElement passWord;

    @CacheLookup
    @FindBy(xpath = "//input[@name='confirmPasswordFormGroup:confirmPasswordFormGroup_body:confirmPassword']")
    WebElement ConfirmPassword;

    @CacheLookup
    @FindBy(xpath = "//input[@name='fullNameFormGroup:fullNameFormGroup_body:fullName']")
    WebElement fullName;

    @CacheLookup
    @FindBy(xpath = "//input[@name='emailAddressFormGroup:emailAddressFormGroup_body:emailAddress']")
    WebElement email;

    @CacheLookup
    @FindBy(xpath = "//input[@name='hospitalsFieldFormGroup:hospitalsFieldFormGroup_body:bonaFideHospitals']")
    WebElement hopsital;

    @CacheLookup
    @FindBy(xpath = "/html/body/main/div/div/div/form/div[8]/div/button[1]")
    WebElement Registered;

    @CacheLookup
    @FindBy(xpath = "//p[contains(text(),'Passwords do not match')]")
    WebElement verifyTexta;


    public void IclickOnHome() {
        log.info("I click Home Button" + home);
        clickOnElement(home);
    }


    public String IIverifyText() {
        log.info("I verify Text" + verifyText);
        String actualMessage = getTextFromElement(verifyText);
        return actualMessage;
    }


    public void IclickOnRegisterPage() {
        log.info("I click Registered Page" + registerPage);
        clickOnElement(registerPage);
    }

    public void IEnterUserName(String enterUsername) {
        String currentHandle = driver.getWindowHandle();
        Set<String> handles = driver.getWindowHandles();
        for (String actual : handles) {
            if (!actual.equalsIgnoreCase(currentHandle)) {
//Switch to the opened tab
                driver.switchTo().window(actual);
//opening the URL saved.
                // driver.get(urlToClick);
            }
        }
        log.info("I enter UserName " + enterUserName);
        sendTextToElement(enterUserName, enterUsername);

    }

    public void IEnterPassWord(String enterPassWord) {
        log.info("I enter Password " + passWord);
        sendTextToElement(passWord, enterPassWord);

    }

    public void IEnterConfirmPassWord(String enterConfirmPassWord) {
        log.info("I enter Confirm Password  " + ConfirmPassword);
        sendTextToElement(ConfirmPassword, enterConfirmPassWord);

    }

    public void IEnterFullName(String enterFullName) {
        log.info("I enter Full Name  " + fullName);
        sendTextToElement(fullName, enterFullName);
    }

    public void IEnterEmailAdress(String enterEmailAddress) {
        log.info("I enter Email Adress " + email);
        sendTextToElement(email, enterEmailAddress);
    }

    public void IEnterHospital(String enterHospitalName) {
        log.info("I enter Hospital " + hopsital);
        sendTextToElement(hopsital, enterHospitalName);

    }

    public void IClickOnRegisteredButton() {
        log.info("I click Regiseted " + Registered);
        clickOnElement(Registered);
    }

    public String IIverifyText1() {
        log.info("I verify Text" + verifyTexta);
        String actualMessage = getTextFromElement(verifyTexta);
        return actualMessage;


    }

}