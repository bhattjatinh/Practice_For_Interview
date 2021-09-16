import io.cucumber.java.Before;
import org.junit.After;

public class Hooks extends LoginPage{

    @Before
    public void openBrowser(){
        startBrowser();
    }

    /*@After
    public void quitbrowser(){
       closeBrowser();
    }*/



}
