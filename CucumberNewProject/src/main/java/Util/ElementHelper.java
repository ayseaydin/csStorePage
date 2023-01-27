package Util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class ElementHelper {
    WebDriver driver;
    WebDriverWait wait;
    Actions action;

    public ElementHelper(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver,10);
        this.action = new Actions(driver);
    }

    public static void waitFor(int sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public WebElement presenceElement(By key){
        return
                wait.until(ExpectedConditions.presenceOfElementLocated(key));
    }
    public WebElement findElement(By key){
        WebElement element = presenceElement(key);
        return element;
    }
    public void click(By key){
        wait.until(ExpectedConditions.elementToBeClickable(findElement(key))).click();
        //findElement(key).click();
    }
    public void sendKey(By key, String text){
        findElement(key).sendKeys(text);
    }
    public void checkVisible(By key){
        wait.until(ExpectedConditions.visibilityOf(findElement(key)));
    }

    public void checkText(By key,String text){findElement(key).getText();}


}
