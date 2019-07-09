package steps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.HomePage;
import pages.MenuPage;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class menuPage_steps {
    HomePage homepage=new HomePage();
    MenuPage menupage=new MenuPage();
    @When("user enter the website as a user")
    public void user_enter_the_website() {
        Driver.getDriver().get("http://shoppetestred.olenick.com/");
    }
    @Then("user current url must be in home page")
    public void user_current_url_must_be_in_home_page() {
        String currentUrl=Driver.getDriver().getCurrentUrl();
        System.out.println(currentUrl);
    }
    @Then("user should be able to click to menu tab")
    public void user_should_be_able_to_click_to_menu_tab() {
        homepage.menubttn.click();
    }

    @When("user is on the menu page")
    public void user_is_on_the_menu_page() {
        Driver.getDriver().get("http://shoppetestred.olenick.com/menu.php");
        homepage.menubttn.click();

    }

    @Then("user should be able to click the sandwich")
    public void user_should_be_able_to_click_the_sandwich() {
        List<WebElement> options=new ArrayList<>();
        options.add(menupage.cheeseBurger);
        options.add(menupage.turkeyClub);
        options.add(menupage.hamAndCheese);
        options.add(menupage.theBerners);
        options.add(menupage.sandwich);
        options.add(menupage.fries);
        options.add(menupage.onionRings);
        options.add(menupage.hummusAndPita);
        options.add(menupage.macaroniAndCheese);

        for(int i=0;i<options.size();i++){
            options.get(i).click();
            Driver.getDriver().navigate().back();
        }
    }


    @Then("user should able to go to order now page")
    public void user_should_able_to_go_to_order_now_page() {
        String actualTitle=Driver.getDriver().getTitle();
        String expectedTitle="Order Your Meal";
        System.out.println(Driver.getDriver().getTitle());
        Assert.assertTrue(expectedTitle.contains(actualTitle));

    }
}
