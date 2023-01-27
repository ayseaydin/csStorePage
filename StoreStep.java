package StepDefinitions;

import Util.DriverFactory;
import Util.DriverFactory;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import Pages.StorePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static Util.ElementHelper.waitFor;

public class StoreStep {
    WebDriver driver = DriverFactory.getDriver();
    StorePage storePage = new StorePage(driver);

    @Given("Navigate to Web Site")
    public void navigateToWebSite() {
    }

    @When("Product Click")
    public void productClick() {
        StorePage.clickProduct();
    }

    @Then("Product Detail Open Check")
    public void productDetailOpenCheck() { StorePage.checkProduct(); }

    @When("Address click")
    public void gonderimYeriClick() { StorePage.gonderimYeriClick(); }

    @When("Address input")
    public void gonderimYeriInput() {
        storePage.gonderimYeriInput();
    }

    @When("Select Address")
    public void selectGonderimYeri() {
        storePage.gonderimYeriSelect();
    }


    @Then("Product list control")
    public void productListControl() {
        storePage.productCheck();
    }

    @And("check Address")
    public void checkGonderimYeri() { storePage.checkgonderimYeri();}

    @When("category filter click")
    public void kategoriFilterClick() { storePage.kategoriFilterclick();}

    @When("Filter Select")
    public void filterSelect() { storePage.filterselect();}

    @When("Apply Click")
    public void uygulaClick() {
        storePage.filterclick();
    }

    @Then("Listing Control")
    public void listingControl() {
        storePage.checktext();
    }

    @When("Temizle")
    public void temizle() {
        storePage.Temizle();
    }

    @Then("Url kontrol")
    public void urlKontrol() {
        storePage.urlkontrol();
    }

    @When("Scroll Page")
    public void scroll() {
        storePage.pagescroll();
    }

    @Then("Url Control")
    public void urlControl() {
        storePage.pageurlcontrol();
    }

    @When("Change url go kupon page")
    public void changeUrlGoKuponPage() {
        storePage.StorePageKupon();
    }

    @And("Kupon click")
    public void kuponClick() {
        storePage.kuponclick();
    }

    @Then("Kupon check and kupon add")
    public void kuponCheckAndKuponAdd() {
        storePage.checkKupon();
    }

    @And("Topla buton click")
    public void toplaButonClick() {
        storePage.topla();
    }

    @Then("Login control")
    public void loginControl() {
        storePage.loginPage();
    }
}
