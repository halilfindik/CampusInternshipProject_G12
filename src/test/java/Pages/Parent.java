package Pages;

import Utilities.Gwd;
import junit.framework.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Parent {
    Duration dr=Duration.ofSeconds(30);
    public void sendKeysFunction(WebElement element, String value)
    {
        waitUntilVisible(element);
        scrollToElement(element);
        element.clear();
        element.sendKeys(value);
    }
    public void clickFunction(WebElement element)
    {
        //waitUntilStaleElement(element);
        waitUntilClickable(element);
        scrollToElement(element);
        element.click();
    }
    public void waitUntilVisible(WebElement element) {
        /*try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/
        WebDriverWait wait=new WebDriverWait(Gwd.getDriver(), dr);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void scrollToElement(WebElement element) {
        JavascriptExecutor js=(JavascriptExecutor) Gwd.getDriver();
        js.executeScript("arguments[0].scrollIntoView();",element);
    }
    public void returnToElement(WebElement element) {
        JavascriptExecutor js=(JavascriptExecutor) Gwd.getDriver();
        js.executeScript("return document.body.innerHTML",element);
    }

    public void waitUntilClickable(WebElement element) {
        WebDriverWait wait = new WebDriverWait(Gwd.getDriver(), dr);
        for (int i=0; i<2; i++) {
            try {
                wait.until(ExpectedConditions.elementToBeClickable(element));
            }
            catch (StaleElementReferenceException e) {
                //PageFactory.initElements(driver, this);
                //wait.until(ExpectedConditions.elementToBeClickable(element));
            }
        }
    }



    public void waitUntilStaleElement(WebElement element) {
        WebDriverWait wait = new WebDriverWait(Gwd.getDriver(), dr);
        wait.until(ExpectedConditions.stalenessOf(element));
    }

    public void verifyContainsText(WebElement element, String text) {
        waitUntilVisible(element);
        Assert.assertTrue(element.getText().toLowerCase().contains(text.toLowerCase()));
    }
    public void waitUntilLoading() {
        WebDriverWait wait = new WebDriverWait(Gwd.driver,dr);
        By fuseBar=By.cssSelector("fuse-progress-bar > *");
        wait.until(ExpectedConditions.numberOfElementsToBe(fuseBar,0));
    }
    public void waitUntilAllElementsLoadedFunction() {
        WebDriverWait wait = new WebDriverWait(Gwd.driver,dr);
        By elements=By.cssSelector("tbody[role='rowgroup']>*");
        wait.until(ExpectedConditions.numberOfElementsToBeLessThan(elements,11));
    }

    public void waitUntilStalenessAndClickFunction(WebElement element) {
        waitUntilStaleElement(element);
        scrollToElement(element);
        element.click();
    }
}