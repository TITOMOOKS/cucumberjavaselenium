package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;



public class OrderNowPage {
    WebDriver driver;

    public OrderNowPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@value='Add To Cart']")
    public WebElement addToCart;

    @FindBy(xpath = "/html/body/div[3]/div[1]/form/table/tbody/tr[2]/td[1]/input")
    public WebElement edisonBurger;






}
