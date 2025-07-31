package steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;

public class Common_steps {

    private static WebDriver dr;

    @BeforeAll
    public static void before_all() throws InterruptedException{
        dr = new ChromeDriver();
        dr.manage().window().maximize();
    }

    @After
    public static void takeScreenshot(Scenario sc){
        if (sc.isFailed()){
            final byte[] scr = ((TakesScreenshot)dr).getScreenshotAs(OutputType.BYTES);
            sc.attach(scr, "image/png", sc.getName());
        }
    }

    @AfterAll
    public static void after_all(){
        dr.quit();
    }

    public WebDriver getDriver(){
        return dr;
    }

}
