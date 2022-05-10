package uk.co.library.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import uk.co.library.utility.Utility;

/**
 * Created by Jay Vaghani
 */
public class ResultPage extends Utility {

    public ResultPage(){
        PageFactory.initElements(driver,this); // 1 Change create Constructors
    }

    @FindBy(xpath = "//body/main[@id='site-main']/div[1]/div[1]/div[2]/div[1]/div[2]")
    WebElement resultText;

public void verifyTheResults(String  expected){
    Reporter.log("Verifying Test Results; " + resultText.toString());
    verifyThatTextIsDisplayed(resultText,expected);
}
}




