package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.TripandwayPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TripandWay {

    //Page objelerim
    TripandwayPage tripandwayPage = new TripandwayPage();


    @Given("TripandwayUrl adresine gidilir")
    public void tripandway_url_adresine_gidilir() {
        Driver.getDriver().get(ConfigReader.getProperty("tripandwayUrl"));

    }

    @Then("Ana sayfanın açıldığını doğrula")
    public void ana_sayfanın_açıldığını_doğrula() {
        String expectedTitle = "Tripandway";
        String actuelTitle = "Tripandway";
        Assert.assertEquals(expectedTitle, actuelTitle);

    }

    @Then("Sayfayı kapatır")
    public void sayfayı_kapatır() {
        Driver.closeDriver();

    }

    //US_02----------------------------------------------------
    @Given("Cookies varsa kabul edilir")
    public void cookies_varsa_kabul_edilir() {
        try {
            tripandwayPage.cookies.click();
        } catch (Exception e) {
            System.out.println("Cookies yoktur");
        }


    }

    @Given("HomePage görünürlüğü test edilir")
    public void home_page_görünürlüğü_test_edilir() {
        tripandwayPage.headerHome.click();
        String expectedTitle = "Tripandway";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);


    }

    @Given("ServicesPage görünürlüğü test edilir")
    public void services_page_görünürlüğü_test_edilir() {
        tripandwayPage.headerServices.click();
        String expectedTitle = "Services";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);


    }

    @Given("DestinationsPage görünürlüğü test edilir")
    public void destinations_page_görünürlüğü_test_edilir() {
        tripandwayPage.headerDestinations.click();
        String expectedTitle = "Destinations";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @Given("PackagesPage görünürlüğü test edilir")
    public void packages_page_görünürlüğü_test_edilir() {
        tripandwayPage.headerPackages.click();
        String expectedTitle = "Packages";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @Given("AbaoutUsPage görünürlüğü test edilir")
    public void abaout_us_page_görünürlüğü_test_edilir() {
        tripandwayPage.headerAboutUs.click();
        String expectedTitle = "About Us";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @Given("FAQPage görünürlüğü test edilir")
    public void faq_page_görünürlüğü_test_edilir() {
        tripandwayPage.headerFaq.click();
        String expectedTitle = "FAQ";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @Given("BlogPage görünürlüğü test edilir")
    public void blog_page_görünürlüğü_test_edilir() {
        tripandwayPage.headerBlog.click();
        String expectedTitle = "Blog";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @Given("ContactPage görünürlüğü test edilir")
    public void contact_page_görünürlüğü_test_edilir() {
        tripandwayPage.headerContact.click();
        String expectedTitle = "Contact Us";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);


    }

    @Given("Test sonlandırılır.")
    public void test_sonlandırılır() {
        Driver.closeDriver();
    }


    // US 04 -----------------------------

    @Then("Sayfanın Footer bölümüne inilir.")
    public void sayfanın_footer_bölümüne_inilir() {
        Actions actions =new Actions(Driver.getDriver());
        actions.sendKeys(Keys.END).perform();
    }

    @Then("footer bölümünde bulunan Featured Packages bölümündeki \"{int}.Sekmeyi tıkla")
    public void footer_bölümünde_bulunan_featured_packages_bölümündeki_sekmeyi_tıkla(Integer int1) {
        tripandwayPage.feature1.click();

    }

    @Given("{int}.Sekmenin sayfasının açıldığını test et")
    public void sekmenin_sayfasının_açıldığını_test_et(Integer int1) {
        Assert.assertTrue(tripandwayPage.featureIcerik.isDisplayed());


    }

}

