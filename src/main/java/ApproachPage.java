import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.*;

public class ApproachPage extends PageObject {
    
	//* Definition of 3 significant features:
	
    @FindBy(xpath= "//*[@id='approach']/div[1]/div/div/div[1]/div[1]")
    private WebElement Intro;
	
	@FindBy(xpath="//*[@id='approach']/div[2]/div/div/div[3]")
    private WebElement Difference;

    @FindBy(xpath="//*[@id='approach']/div[3]/div/div/div/button")
    private WebElement Positions;

    //*Create ApproachPage for the test:
    
    public ApproachPage(WebDriver driver){
        super(driver);           
    }
    
    //* Check if the page is loaded:
    
    public boolean ApproachIsLoaded() {
    	return Intro.isDisplayed();
  	  }
}
