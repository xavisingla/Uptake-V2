import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.*;

public class HomePage extends PageObject {
    
	//* Definition of some significant features:
	
	@FindBy(className="logo-container")
    private WebElement Uptake;

    @FindBy(xpath="//*[@id='header']/div[1]/nav/a[1]")
    private WebElement Approach;

    @FindBy(xpath="//*[@id='header']/div[1]/nav/a[2]")
    private WebElement Products;
    
    @FindBy(xpath="//*[@id='home']/div[1]/div/div[1]/div/button")
    private WebElement Wind;

    @FindBy(xpath="//*[@id='home']/div[4]/div/div[1]/div")
    private WebElement Mine;
    
  
    //*Create HomePage for the test:
    
    public HomePage(WebDriver driver){
        super(driver);
               
    }
    
    //* Check if the page is loaded:
    
  public boolean HomeIsLoaded() {
	  return Wind.isDisplayed();
  }
  
  //* Check if Approach tab is working:
  
  public ApproachPage Navigate_1(){
	 Approach.click(); 
	 return new ApproachPage(driver);
	 }
  
  //* Check if Products tab is working:
  
  public ProductsPage Navigate_2(){
	 Products.click(); 
	 return new ProductsPage(driver);
	 }  
  
}
