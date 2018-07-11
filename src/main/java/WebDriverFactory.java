import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.net.URL;

/**
 * @author Simon Anliker
 */
public class WebDriverFactory {

    public WebDriver create() {
        URL rawDriver = Thread.currentThread().getContextClassLoader().getResource("geckodriver_v0_21_0.exe");
        if (rawDriver == null) {
            throw new IllegalStateException("No web driver available");
        }
        System.setProperty("webdriver.gecko.driver", rawDriver.getPath());
        return new FirefoxDriver();
    }
}
