package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class OrderConfirmPage {
    WebDriver driver;

    public OrderConfirmPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(name = "name")
    public WebElement name;

    @FindBy(name = "emailAddress")
    public WebElement email;

    @FindBy(xpath = "/html/body/div[3]/div[1]/center/form/center[3]/input")
    public WebElement summitbttn;

    @FindBy(xpath = "/html/body/div[3]/div/div/div/div/div/div/div/div/div/h2[1]/font")
    public WebElement thankYouText;

    @FindBy(xpath = "/html/body/div[3]/div/div/div/div/div/div/div/div/div/center/font/p")
    public WebElement confirmAndTotalAmount;
    
}
