package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {

    // page class'lari surekli kullandigimiz locate islemeleri
    // ve varsa login gibi kucuk islevleri iceren method'lar barindirir
    // Selenium ile locate islemi veya herhangi bir islev gerceklestirmek istedigimizde
    // WebDriver objesine ihtiyac vardir.

    // POM'de Driver class'inda olusturdugumuz
    // Webdriver driver objesini page class'larina tanimlamak icin
    // PageFactory class'indan initElements() kullanilir

    public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }


    @FindBy(id ="twotabsearchtextbox")
    public WebElement aramaKutusu;

    @FindBy(xpath = "(//div[@class='sg-col-inner'])[1]")
    public WebElement aramaSonucuElementi;

    @FindBy(xpath = "//*[@data-image-index='1']")
    public WebElement ilkUrunElementi;

    @FindBy(xpath = "//span[@id='productTitle']")
    public WebElement ilkUrunIsimElementi;

}
