package Suporte;

import enums.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import runner.RunnerTest;

import java.time.Duration;

public class Driver {

    private static WebDriver driver;
    private static WebDriverWait wait;

    private static void iniciarChrome() {
        driver = new ChromeDriver();
        System.setProperty("webdriver.chromedriver.driver", "src/test/resources/webdriver/chromedriver.exe");
    }

    private static void iniciarEdge() {
        driver = new EdgeDriver();
        System.setProperty("webdriver.msedgedriver.driver", "src/test/resources/webdriver/msedgedriver.exe");
    }

    private static void iniciarFirefox() {
        driver = new FirefoxDriver();
        System.setProperty("webdriver.geckodriver.driver", "src/test/resources/webdriver/geckodriver.exe");
    }


    public static WebDriver getDriver() {
        if (driver == null) {
            return navegador(RunnerTest.browser);
        } else {
            return driver;
        }
    }


    public static WebDriver navegador(Browser browser) {
        if (driver != null) {
            driver.quit();
        }

        switch (browser) {
            case CHROME:
                iniciarChrome();
                break;

            case FIREFOX:
                iniciarFirefox();
                break;

            case EDGE:
                iniciarEdge();
                break;

            default:
                throw new IllegalArgumentException("Informe um navegador valido");

        }
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        return driver;
    }


    public static void acessarSite(String site) {
        getDriver().get(site);
    }

    public static void fecharNavegador() {
        getDriver().quit();
    }

}
