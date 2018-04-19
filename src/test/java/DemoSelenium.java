import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoSelenium {
    private WebDriver webDriver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        webDriver = new ChromeDriver();
    }

    @Test
    public void simpleTestCase(){
        String url = "https://www.google.com";

        webDriver.get(url);

        WebDriverWait webDriverWait= new WebDriverWait(webDriver, 20);

        Assert.assertEquals("Google", webDriver.getTitle());
    }

    @After
    public void cleanUp(){
        System.setProperty("webdriver.chrome.driver","");
        webDriver.quit();
    }
}
