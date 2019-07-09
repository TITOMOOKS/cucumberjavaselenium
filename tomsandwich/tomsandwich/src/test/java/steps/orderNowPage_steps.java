package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.JavascriptExecutor;
import pages.HomePage;
import pages.MenuPage;
import pages.OrderConfirmPage;
import pages.OrderNowPage;
import utilities.Driver;

public class orderNowPage_steps {
    HomePage hm=new HomePage();
    OrderNowPage onm=new OrderNowPage();
    MenuPage mp=new MenuPage();
    OrderConfirmPage ocp=new OrderConfirmPage();
    @Given("user should be able to open the website")
    public void user_should_be_able_to_open_the_website() {
        Driver.getDriver().get("http://shoppetestred.olenick.com/");
    }

    @When("user should able to click to order now")
    public void user_should_able_to_click_to_order_now() {
        hm.orderNowBttn.click();
    }

    @When("user clicks the check box edison burger")
    public void user_clicks_the_check_box_edison_burger() {
        onm.edisonBurger.click();
    }

    @When("user should be able to add to cart")
    public void user_should_be_able_to_add_to_cart() {
        JavascriptExecutor jse=(JavascriptExecutor)Driver.getDriver();
        jse.executeScript("scroll(0,1000)");
        onm.addToCart.click();
    }

    @When("user should be able to check out")
    public void user_should_be_able_to_check_out() {
     mp.checkoutBttn.click();
    }

    @When("user should enter the name and email")
    public void user_should_enter_the_name_and_email() {
     ocp.name.sendKeys("manuela");
     ocp.email.sendKeys("mondimerve@hotmail.com");
    }

    @When("user should be able to submit")
    public void user_should_be_able_to_submit() {

        ocp.summitbttn.click();
    }

    @Then("thank you note should be displayed")
    public void thank_you_note_should_be_displayed() {
       if(ocp.thankYouText.isDisplayed()){
           System.out.println("Thank you note is displayed ");
       }else{
           System.out.println("Thank you note is not displayed");
       }
    }

    @Then("user should see confirmation number and total amount on the screen")
    public void user_should_see_confirmation_number_and_total_amount_on_the_screen() {
        if(ocp.confirmAndTotalAmount.isDisplayed()){
            System.out.println("Confirmation number and total amount are displayed ");
        }else{
            System.out.println("Confirmation number and total amount are displayed");
        }
        Driver.getDriver().quit();
    }


}
