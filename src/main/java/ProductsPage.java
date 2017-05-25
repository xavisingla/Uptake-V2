import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.*;

public class ProductsPage extends PageObject {
    
	//* Definition of 3 significant features:
	    
    @FindBy(xpath="//*[@id='video']")
    private WebElement Video;

    @FindBy(xpath="//*[@id='products']/div[2]/div/div/div[3]")
    private WebElement Applications;
    
    @FindBy(xpath = "//*[@id='products']/div[3]/div/div[1]/div/a")
    private WebElement Next;
	  
    //*Create ProductsPage for the test:
    
    public ProductsPage(WebDriver driver){
        super(driver);           
    }
    
    //* Check if the page is loaded:
    
    public boolean ProductsIsLoaded() {
    	return Video.isDisplayed();
  	  } 
}
