package Suporte;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Driver {

    private static WebDriver driver;
    private static WebDriverWait wait;


    private static void iniciarChrome() {
        driver = new ChromeDriver();

    }

    private static void iniciarEdge() {
        driver = new EdgeDriver();

    }

    private static void iniciarFirefox() {
        driver = new FirefoxDriver();

    }

    public static WebDriver getDriver() {
        if (driver == null) {
        String browser = System.getProperty("browser");
        driver = navegador(browser);
        }

        return driver;
    }

    public static WebDriver navegador(String browser) {
        if (driver != null) {
            driver.quit();
        }

        switch (browser) {
            case "chrome":
                iniciarChrome();
                break;

            case "firefox":
                iniciarFirefox();
                break;

            case "edge":
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
