package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import javax.xml.xpath.XPath;

    public class HomePage {
        WebDriver driver;
        public HomePage(){
            driver=Driver.getDriver();
            PageFactory.initElements(driver,this);
        }

        @FindBy(xpath = "//a[@href='index.php']")
        public WebElement homebttn;

        @FindBy(xpath = "//a[@href='menu.php']")
        public WebElement menubttn;

        @FindBy(xpath = "//a[@href='ordernow.php']")
        public WebElement orderNowBttn;

        @FindBy(xpath = "//a[contains(text(),'Locations')]")
        public WebElement locationsbttn;

        @FindBy(xpath = "//ul[@id='cssmenu1']/li")
        public WebElement allBttn;



    }


