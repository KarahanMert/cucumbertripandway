package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TripandwayPage {


    public TripandwayPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }


    //Ana sayfa cookies Accept butonu
    @FindBy(xpath = "//button[@class='wpcc-btn']")
    public WebElement cookies;

    @FindBy(xpath = "//div/nav/ul/li[1]/a")
    public WebElement headerHome;

    @FindBy(xpath = "//div/nav/ul/li[2]/a")
    public WebElement headerServices;

    @FindBy(xpath = "//div/nav/ul/li[3]/a")
    public WebElement headerDestinations;

    @FindBy(xpath = "//div/nav/ul/li[4]/a")
    public WebElement headerPackages;


    @FindBy(xpath = "//div/nav/ul/li[5]/a")
    public WebElement headerAboutUs;

    @FindBy(xpath = "//div/nav/ul/li[6]/a")
    public WebElement headerFaq;

    @FindBy(xpath = "//div/nav/ul/li[7]/a")
    public WebElement headerBlog;

    @FindBy(xpath = "//div/nav/ul/li[8]/a")
    public WebElement headerContact;


    // Feature Page 1. Sekme
    @FindBy(xpath = "(//div/div/div/ul/li/a)[44]")
    public  WebElement feature1;

    // Feature page 1. Sayfa İçeriği
    @FindBy(xpath = "//h4")
    public WebElement featureIcerik;





}
