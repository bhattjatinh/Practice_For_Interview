import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class StepDefinition extends LoginPage{

    @Given("user is on the home page")
    public void verifyUserOnHomePage(){
        driver.findElement(By.id("home-page-tabs")).isDisplayed();
    }

    @When("user enters email as {string} and password as {string}")
    public void userEntersEmailAsAndPasswordAs(String arg0, String arg1) {
        enterEmail(arg0);
        enterPassword(arg1);

    }

    @And("user clicks on login button")
    public void userClicksOnLoginButton() {
        clickOnLoginButton();
    }

    @Then("user should be on the login page")
    public void userShouldBeOnTheLoginPage() {
        driver.findElement(By.cssSelector("#authentication")).isDisplayed();
    }

    @And("user clicks Sign in button")
    public void userClicksSignInButton() {
        clickLogin();
    }

    @Then("user should be logged in")
    public void userShouldBeLoggedIn() {
        driver.findElement(By.cssSelector(".page-heading")).isDisplayed();
    }


}
