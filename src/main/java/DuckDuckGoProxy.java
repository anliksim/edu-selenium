import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author Simon Anliker
 */
public class DuckDuckGoProxy {

    private static final String SEARCH_INPUT_ID = "search_form_input_homepage";

    private final WebDriver driver;

    public DuckDuckGoProxy(WebDriver driver) {
        this.driver = driver;
    }

    public void start() {
        driver.get("https://duckduckgo.com/");
    }

    public void submitSearch(String keysToSend) {
        WebElement searchBar = driver.findElement(By.id(SEARCH_INPUT_ID));
        searchBar.sendKeys(keysToSend);
        searchBar.submit();
    }
}
