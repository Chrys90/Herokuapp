package Suporte;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Suporte.Driver.getDriver;

public class CliqueCommands {

    private static WebDriverWait wait;

    public static void waitElementBeClicable(WebElement element, Integer tempo) {
        wait = new WebDriverWait(getDriver(), Duration.ofSeconds(tempo));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }


    public static void clique(WebElement element) {
        System.out.println("##############################");

        try {
            System.out.println(" vai clicar no elemento" + element);
            waitElementBeClicable(element, 10000);
            element.click();
            System.out.println(" clicou no elemento" + element);
        } catch (Exception error) {
            System.out.println("********** aconteceu um erro ao tentar clicar no elemento" + element);
            System.out.println(error);
        }
        System.out.println("##############################");
    }



    public static void cliqueBotaoDireito(WebElement element) {

        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("var evt = document.createEvent('MouseEvents');" +
                "evt.initMouseEvent('contextmenu', true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 2, null);" +
                "arguments[0].dispatchEvent(evt);", element);
    }


}
