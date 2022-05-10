package uk.co.library.pages;


import com.aventstack.extentreports.model.Report;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import uk.co.library.utility.Utility;

import java.sql.ClientInfoStatus;

/**
 * Created by Jay Vaghani
 */
public class HomePage extends Utility {

    public HomePage(){
        PageFactory.initElements(driver,this);  // use construcatos
    }

    @FindBy(xpath = "//button[@id='save']")
    WebElement acceptAllButton;

    @FindBy(xpath = "(//input[@id='keywords'])[1]")
    WebElement jobTitleField;
    @FindBy(xpath = "//input[@id='location']")
    WebElement locationField;
    @FindBy(xpath = "//select[@id='distance']")
    WebElement distanceDropDownField;
    @FindBy(xpath = "//button[@id='toggle-hp-search']")
    WebElement moreSearchOptionsLink;
    @FindBy(xpath = "//input[@id='salarymin']")
    WebElement salaryMinField;
    @FindBy(xpath = "//input[@id='salarymax']")
    WebElement salaryMaxField;
    @FindBy(xpath = "//select[@id='salarytype']")
    WebElement salaryTypeFieldDropDown;
    @FindBy(xpath = "//select[@id='tempperm']")
    WebElement jobTypeFieldDropDown;
    @FindBy(xpath = "//input[@id='hp-search-btn']")
    WebElement findJobsButton;

    public void acctptIFrameAlert() throws InterruptedException{
        Thread.sleep(800);
        driver.switchTo().frame("gdpr-consent-notice");
        clickOnElement(acceptAllButton);
        Reporter.log("Accepting all cookies : " + acceptAllButton.toString());
    }
    public void enterJobTitle(String jobTitle){
        Reporter.log("Entering Job Title : " + jobTitleField.toString());
        sendTextToElement(jobTitleField,jobTitle);

    }
    public void enteringLocation(String location){
        Reporter.log("Enter Location : " + locationField.toString());
        sendTextToElement(locationField,location);
    }
    public void selectDistanceDropDown(String distance){
        Reporter.log("Select Distance: " + distanceDropDownField.toString());
        sendTextToElement(distanceDropDownField,distance);
    }
    public void clickMoreSearchOptionLink(String search){
        Reporter.log("ClickOnMoreSearchOption : " + moreSearchOptionsLink.toString());
        sendTextToElement(moreSearchOptionsLink,search);
    }
    public void enterMinSalary(String minSalary){
        Reporter.log("EnteMinSalary: " + salaryMinField.toString());
        sendTextToElement(salaryMinField,minSalary);
    }
    public void enterMaxSalary(String maxSalary){
        Reporter.log("EnterMaxSalary:" + salaryMaxField.toString());
        sendTextToElement(salaryMaxField,maxSalary);

    }
     public void selectSalaryType(String salaryType){
        Reporter.log("selectSalary:" + salaryTypeFieldDropDown.toString());
        selectByVisibleTextFromDropDown(salaryTypeFieldDropDown,salaryType);

     }
     public void selectJobTypeFieldDropDown(String jtype){
        Reporter.log("Select Job Type: " + jtype);
       selectByVisibleTextFromDropDown(jobTypeFieldDropDown,jtype);

     }
     public void clickOnFindJobsButton(){
      Reporter.log("Clicking on Find Job Button:" + findJobsButton);
       clickOnElement(findJobsButton);
     }

     public void clickOnCookiesAcceptButton() throws InterruptedException{
        Thread.sleep(1000);
        clickOnElement(acceptAllButton);
     }

}
