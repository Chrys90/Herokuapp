package Suporte;

import org.openqa.selenium.Alert;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Suporte.Driver.getDriver;

public class JavaScriptAlerta {

    private static WebDriverWait wait;

    public static void verificarAlertaNaTela() {

        try {

            // Aguarde até que o alerta esteja presente na página
            wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());

            // Verifique o texto do alerta
            String alertText = alert.getText();
            System.out.println("Texto do alerta: " + alertText);

            // Aceite o alerta (clique em "OK")
            alert.accept();
        } catch (UnhandledAlertException e) {
            // Se ocorrer uma UnhandledAlertException, isso significa que o alerta já foi tratado
            System.out.println("Alerta já tratado.");

        }
    }

}
