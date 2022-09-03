package Pages;

import Utilities.Gwd;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
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
        wait.until(ExpectedConditions.elementToBeClickable(element));
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
}