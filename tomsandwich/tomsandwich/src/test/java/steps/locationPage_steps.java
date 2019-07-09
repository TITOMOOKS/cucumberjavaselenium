package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import pages.LocationsPage;
import utilities.Driver;

public class locationPage_steps {
    LocationsPage lp=new LocationsPage();
    HomePage hp = new HomePage();
    @Given("User able to open Tom's Sandwich Shop website")
    public void user_able_to_open_Tom_s_Sandwich_Shop_website() {
        Driver.getDriver().get("http://shoppetestred.olenick.com/menu.php");
    }

    @When("Mouse over locations tab")
    public void mouse_over_locations_tab() {


        Actions act = new Actions(Driver.getDriver());

        act.moveToElement(hp.locationsbttn).build().perform();

   }

    @When("Clicks Chicago")
    public void clicks_Chicago() {



        lp.Chicagobttn.click();

    }

    @Then("Opens Chicago location page")
    public void opens_Chicago_location_page() {
        if(lp.ChicagoPage.isDisplayed()){
            System.out.println("Chicago location page is displayed");
        }else{
            System.out.println("Chicago location page is not displayed");
        }
       // Driver.getDriver().quit();
    }
    @When("Clicks Belfast")
    public void clicks_Belfast() {
        lp.Belfastbttn.click();
    }

    @Then("Opens Belfast location page")
    public void opens_Belfast_location_page() {
        if(lp.BelfastPage.isDisplayed()){
            System.out.println("Belfast location page is displayed");
        }else{
            System.out.println("Belfast location page is not displayed");
        }

    }

    @When("Clicks Buenos Aires")
    public void clicks_Buenos_Aires() {
     lp.BuenosAiresbttn.click();
    }

    @Then("Opens Buenos Aires location Page")
    public void opens_Buenos_Aires_location_Page() {
        if(lp.BuenosAiresPage.isDisplayed()){
            System.out.println("Buenos Aires location page is displayed");
        }else{
            System.out.println("Buenos Aires location page is not displayed");
        }
      //  Driver.getDriver().quit();
    }


    @When("Clicks Philadelphia")
    public void clicks_Philadelphia() {
        lp.Philadelphiabttn.click();
    }

    @Then("Opens Philadelphia location page")
    public void opens_Philadelphia_location_page() {
     if(lp.PhiladelphiaPage.isDisplayed()){
         System.out.println("Philadelphia location page is displayed");
     }else{
         System.out.println("Philadelphia location page is not displayed");
     }
        Driver.getDriver().quit();
    }





}
