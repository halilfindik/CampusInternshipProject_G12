package StepDefinitions;

import Utilities.Gwd;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Hooks {

    @Before
    public void before() {
        System.out.println("Scenario is started...");
    }
    @After
    public void after(Scenario scenario) {

        System.out.println("Scenario is over...");
        System.out.println("Scenario result : "+scenario.getStatus());
        System.out.println("Scenario isFailed? : "+scenario.isFailed());

        LocalDateTime date=LocalDateTime.now();
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd.MM.yy");

        if (scenario.isFailed()) {
            // klasöre
            TakesScreenshot screenshot= (TakesScreenshot) Gwd.getDriver();
            File ssFile=screenshot.getScreenshotAs(OutputType.FILE);

            // Extent Report'a ekliyor
            // ExtentTestManager.getTest().addScreenCaptureFromBase64String(getBase64Screenshot());

            try {
                FileUtils.copyFile(ssFile,
                        new File("target/FailedScreenShots/" + scenario.getId() + date.format(formatter)+".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // ekran görüntüsü al senaryo hatalı ise koyacağız
        Gwd.quitDriver();
    }
    public String getBase64Screenshot()
    {
        return ((TakesScreenshot) Gwd.getDriver()).getScreenshotAs(OutputType.BASE64);
    }
}
