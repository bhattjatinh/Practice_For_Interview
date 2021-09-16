import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

public class LoginPage {

    public static String baseURL= "http://automationpractice.com/index.php";
    public static WebDriver driver;
    public void startBrowser(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.get(baseURL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        }

    /*public void closeBrowser(){
        driver.quit();
    }*/

    public void clickOnLoginButton(){
        driver.findElement(By.cssSelector(".login")).click();
    }

    public void enterEmail(String text){
        driver.findElement(By.cssSelector("#email")).sendKeys(text);

    }

    public void enterPassword(String text){
        driver.findElement(By.cssSelector("#passwd")).sendKeys(text);
    }

    public void clickLogin(){
        driver.findElement(By.id("SubmitLogin")).click();
    }


}
