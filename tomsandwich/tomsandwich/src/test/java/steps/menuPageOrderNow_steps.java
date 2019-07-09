package steps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.commons.math3.geometry.partitioning.BSPTreeVisitor;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import pages.MenuPage;
import pages.OrderNowPage;
import utilities.Driver;

import java.util.List;

public class menuPageOrderNow_steps {

    MenuPage menu=new MenuPage();
    OrderNowPage order=new OrderNowPage();

    @When("user launched to menu tab")
    public void user_launched_to_menu_tab() {
        Driver.getDriver().get("http://shoppetestred.olenick.com/menu.php");
    }

    @Then("user should be able to click {string}")
    public void user_should_be_able_to_click(String string) {
        menu.turkeyClub.click();
    }

    @Then("user should be able to go to {string} page")
    public void user_should_be_able_to_go_to_page(String string) {

        String actualTitle=Driver.getDriver().getTitle();
        String expectedTitle="Order Your Meal";
        Assert.assertTrue(actualTitle.equals(expectedTitle));
    }
    @When("user in {string} page")
    public void user_in_page(String string) {
        Driver.getDriver().get("http://shoppetestred.olenick.com/ordernow.php");
        String expectedUrl="http://shoppetestred.olenick.com/ordernow.php";
        String currentUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(currentUrl.equals(expectedUrl));
    }

    @Then("user should be able to select each radio buttons")
    public void user_should_be_able_to_select_each_radio_buttons() {
        List<WebElement> radioBttn=Driver.getDriver().findElements(By.xpath("//input[@type='checkbox']"));
        int size=radioBttn.size();
        for(int i=0;i<size;i++){
            radioBttn.get(i).click();
            JavascriptExecutor jse=(JavascriptExecutor)Driver.getDriver();
            jse.executeScript("scroll(0,250)");

        }

    }

    @Then("user should able to click to {string}")
    public void user_should_able_to_click_to(String string) {
        JavascriptExecutor jse=(JavascriptExecutor)Driver.getDriver();
        jse.executeScript("scroll(0,250)");
        order.addToCart.click();

    }

}
