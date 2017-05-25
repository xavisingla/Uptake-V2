import org.junit.*;
import static org.junit.Assert.assertTrue;

public class HomePageTest extends FunctionalTest {

    @Test
    //*Test of the different tabs
    
    public void testNavbar(){

        //*Test if Home page is loaded, in order to start testing:
    	
        HomePage homePage = new HomePage(driver);
        assertTrue(homePage.HomeIsLoaded());
        System.out.println("Home page is being checked");
        
        if (homePage.HomeIsLoaded()){
        System.out.println("Home page is loaded");
        } else {
        	System.out.println("Test Fail");
        }
        
       //*Test if Approach page is loaded when accessing into it:   
        
        ApproachPage approachPage = homePage.Navigate_1();
        assertTrue(approachPage.ApproachIsLoaded());
        System.out.println("Approach is being clicked");
        
        if (approachPage.ApproachIsLoaded()){
            System.out.println("Approach page is loaded");
            } else {
            	System.out.println("Test Fail");
            }
        
        //*Test if Products page is loaded when accessing into it:  
        
        ProductsPage productsPage = homePage.Navigate_2();
        assertTrue(productsPage.ProductsIsLoaded());
        System.out.println("Products is being clicked");
        
        if (productsPage.ProductsIsLoaded()){
            System.out.println("Products page is loaded");
            } else {
            	System.out.println("Test Fail");
            }
    
    
    }
}
