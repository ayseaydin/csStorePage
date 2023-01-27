package Pages;
import Util.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import static Util.ElementHelper.waitFor;

public class StorePage {
    static WebDriver driver;
    static ElementHelper elementHelper;
    WebDriverWait wait;
    static By oneTrust=By.id("onetrust-accept-btn-handler");
    static By productDetail = By.id("productDetailSend");
    static By gonderimYeri = By.cssSelector(".js-district-search-button-text");
    static By productElement = By.xpath("/html/body/main/div/div[8]/div[1]/div/div/a/div[1]/img");
    static By gonderimYeriInput= By.xpath("//*[@id=\"district-search-0\"]/div[1]/span[1]/input");
    static By gonderimYeriAdresi=By.xpath("//*[@id=\"district-search-0\"]/div[2]/ul/li[1]/a");
    static By gonderimYeriAdresiZ=By.xpath("/html/body/div[7]/div/div/div/div/div[1]/div/div[2]/div[1]/div[1]/div[2]/div");
    static By kategoriFilter=By.xpath("/html/body/main/div/div[2]/div[1]/div[1]/div/div[1]/div/a");

    static By kategoriKolSaati=By.xpath("/html/body/main/div/div[2]/div[1]/div[1]/div/div[1]/div/div/div[1]/ul/li[2]/label");
    static By filterUygula=By.xpath("/html/body/main/div/div[2]/div[1]/div[1]/div/div[1]/div/div/div[2]/button");
    static By filterResult=By.xpath("/html/body/main/div/div[2]/div[2]/div[1]/div");
    static By filterDelete=By.xpath("/html/body/main/div/div[2]/div[2]/div[2]/a");

    static By saticiKuponlu=By.xpath("/html/body/main/div/div[2]/div/div[1]/div/div[2]/div/div/div[1]/div/div/div/div[1]/div[2]/a/div");
    static By kuponTopla = By.xpath("/html/body/main/div/div[4]/div[2]/div/div/div/div/div/div/div[2]/div[2]");
    static By kuponcheckText = By.xpath("/html/body/main/div/div[4]/div[3]");
    static By giris = By.xpath("/html/body/main/div/div[1]/div/h2");




    public StorePage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver,10);
        this.elementHelper = new ElementHelper(driver);
    }


    public static void changeTab(){
        for (String winHandle : driver.getWindowHandles())
            driver.switchTo() .window (winHandle);
    }
    public static void clickProduct(){
        driver.getWindowHandle();
        elementHelper.click(oneTrust);
        elementHelper.findElement(productElement);
        elementHelper.click(productElement);
        }

    public static void checkProduct(){
        changeTab();
        elementHelper.checkVisible(productDetail);
    }
    public static void gonderimYeriClick(){
        elementHelper.click(oneTrust);
        elementHelper.click(gonderimYeri);
    }
    public static void gonderimYeriInput(){
        elementHelper.sendKey(gonderimYeriInput,"Zeynep");
    }
    public static void gonderimYeriSelect() {
            elementHelper.click(gonderimYeriAdresi);
        }


    public static void checkgonderimYeri(){

        elementHelper.findElement(gonderimYeriAdresiZ);
        elementHelper.checkText(gonderimYeriAdresiZ,"Zeynep Kamil, Zeynep Kamil Hastanesi Doğum Acil Servisi, Üsküdar/İstanbul, Türkiye");
    }

    public static void productCheck(){
        elementHelper.findElement(productElement);
        elementHelper.checkText(productElement,"Guess GUGW0058G4 Erkek Kol Saati");
    }

    public static void kategoriFilterclick() {
        elementHelper.click(oneTrust);
        elementHelper.findElement(kategoriFilter);
        elementHelper.click(kategoriFilter);
    }
    public static void filterselect() {
        elementHelper.findElement(kategoriKolSaati);
        elementHelper.click(kategoriKolSaati);
    }
    public static void filterclick() {
        elementHelper.findElement(filterUygula);
        elementHelper.click(filterUygula);
    }
    public static void checktext(){

        elementHelper.checkText(filterResult," Bilezik, Bileklik ");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ciceksepeti.com/tum-urunler?c=13294&storeid=30180");

    }

    public static void Temizle(){
        elementHelper.click(filterDelete);
    }

    public static void urlkontrol(){
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ciceksepeti.com/tum-urunler?storeid=30180","Not matched");
    }

    public static void pagescroll(){
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, 7000);");
    }
        public static void pageurlcontrol() {
            Assert.assertEquals(driver.getCurrentUrl(), "https://www.ciceksepeti.com/tum-urunler?storeid=30180&page=2","Not matched");
        }
        public static void StorePageKupon(){
            driver.navigate().to("https://www.ciceksepeti.com/kupon");

        }
        public static void kuponclick(){
        elementHelper.click(saticiKuponlu);
        }

        public static void checkKupon(){
            elementHelper.findElement(kuponTopla);
            elementHelper.checkText(kuponcheckText,"Kuponun Geçerli Olduğu Ürünler");
        }

    public static void topla(){
        elementHelper.click(kuponTopla);
    }
    public static void loginPage(){
        elementHelper.checkText(giris,"Giriş");
    }



}
