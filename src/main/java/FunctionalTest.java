import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class FunctionalTest
{
 protected static WebDriver driver;

 @BeforeClass
    public static void setUp(){
	 System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
	 driver = new ChromeDriver();
	 
    
     System.out.println("Driver creation");
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     driver.get("https://www.uptake.com");
 }

 @After
 public void cleanUp(){
     driver.manage().deleteAllCookies();
 }

 @AfterClass
 public static void tearDown(){
     driver.close();
 }

}
