package Services;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleDriverTest {
    public WebDriver getDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\miked\\IdeaProjects\\junit_part\\src\\test\\resources\\chromedriver.exe");
        return new ChromeDriver();
    }
}
