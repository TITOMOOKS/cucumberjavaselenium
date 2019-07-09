package steps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import utilities.Driver;
public class homePage_steps {

    @When("user enter the website")
    public void user_enter_the_website() {

        Driver.getDriver().get("http://shoppetestred.olenick.com/");
    }

    @When("user should be able to login to page")
    public void user_should_be_able_to_login_to_page() {

        System.out.println(Driver.getDriver().getCurrentUrl());
    }

    @Then("user should able to see the current title of the homepage")
    public void user_should_able_to_see_the_current_title_of_the_homepage() {
        String actualTitle=Driver.getDriver().getTitle();
        String exceptedTitle="Welcome to Toms Sandwich Shoppe";
        System.out.println(actualTitle);
        Assert.assertEquals("Your actual title and excepted title is not matching",actualTitle,exceptedTitle);

    }

}
