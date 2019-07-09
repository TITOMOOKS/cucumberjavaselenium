package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
public class MenuPage {
    WebDriver driver;
    public MenuPage(){
        driver=Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath =" //a[contains(text(),'The Edison BaconPotato Cheese Burger')]")
    public WebElement cheeseBurger;

    @FindBy(xpath ="//a[contains(text(),'The Tesla Turkey Club')]" )
    public WebElement turkeyClub;

    @FindBy(xpath ="//a[contains(text(),'The Marconi Ham n Cheese')]" )
    public WebElement hamAndCheese;

    @FindBy(xpath="//a[@href='ordernow.php?id=4']")
    public  WebElement theBerners;

    @FindBy(xpath = "//a[contains(text(),'Galileo Grouper Sandwich')]")
    public WebElement sandwich;

    @FindBy(xpath = "//a[contains(text(),'Benjamin Franklin Fries')]")
    public WebElement fries;

    @FindBy(xpath = "//a[@href='ordernow.php?id=1002']")
    public WebElement onionRings;

    @FindBy(xpath = "//a[@href='ordernow.php?id=1003']")
    public WebElement hummusAndPita;

    @FindBy(xpath = "//a[@href='ordernow.php?id=1004']")
    public WebElement macaroniAndCheese;

    @FindBy(name = "checkout")
    public WebElement checkoutBttn;

    @FindBy(name = "emptycart")
    public WebElement emptyCartBttn;

    @FindBy(xpath = "//div[@class='menu']")
    public WebElement menuSandwich;
}
