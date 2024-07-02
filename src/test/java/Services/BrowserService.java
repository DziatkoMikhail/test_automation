package Services;

import configuration.ReadProperties;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserService {
    private WebDriver driver = null;

    public BrowserService() {
        switch (ReadProperties.browserName().toLowerCase()){
            case "chrome":
                DriverManagerType driverManagerType = DriverManagerType.CHROME;
                WebDriverManager.getInstance(driverManagerType).clearDriverCache().setup();

                driver = new ChromeDriver();
                break;
            case "firefox":
                DriverManagerType driverManagerTypeTwo = DriverManagerType.FIREFOX;
                WebDriverManager.getInstance(driverManagerTypeTwo).clearDriverCache().setup();
                break;
            default:
                System.out.println("Browser " + ReadProperties.browserName() + "is not supported");
        }
    }
    private ChromeOptions getChromeOptions() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-gpu");
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--silent");
        options.addArguments("--start-maximized");
        return options;
    }
}
