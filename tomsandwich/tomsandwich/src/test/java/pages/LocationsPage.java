package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LocationsPage {
    WebDriver driver;
    public LocationsPage(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[contains(text(),'Chicago')]")
    public WebElement Chicagobttn;

    @FindBy(xpath = "//a[contains(text(),'Belfast')]")
    public WebElement Belfastbttn;

    @FindBy(xpath = "//a[contains(text(),'Buenos Aires')]")
    public WebElement BuenosAiresbttn;

    @FindBy(xpath = "//a[contains(text(),'Philadelphia')]")
    public WebElement Philadelphiabttn;

    @FindBy(xpath = "/html/body/div/div/div/div[2]/div[1]/h2/font")
    public WebElement ChicagoPage;

    @FindBy(xpath = "/html/body/div/div/div/div[2]/div[1]/h2/font")
    public WebElement BelfastPage;

    @FindBy(xpath = "//div[@class='mid-left maps']//h2")
    public WebElement BuenosAiresPage;

    @FindBy(xpath = "//font[contains(text(),'Philadelphia')]")
    public WebElement PhiladelphiaPage;


}
