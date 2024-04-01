package Suporte;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Suporte.Driver.getDriver;

public class VisibilidadeElementosPagina {

    static WebDriverWait wait;

    public static void waitElementBeVisible(WebElement element, Integer tempo) {
        wait = new WebDriverWait(getDriver(), Duration.ofSeconds(tempo));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitElementBeInvisible(WebElement element, Integer tempo) {
        wait = new WebDriverWait(getDriver(), Duration.ofSeconds(tempo));
        wait.until(ExpectedConditions.invisibilityOf(element));
    }



    public static void validarElementoPresenteNaPagina(WebElement element) {

        int maxTentativas = 3;
        boolean elementoPresente = false;

        // Tentativa de localizar o elemento sem recarregar a página
        for (int tentativa = 0; tentativa < maxTentativas; tentativa++) {
            try {
                // Se o elemento é encontrado, marcamos como presente e saímos do loop
                if (element.isDisplayed()) {
                    elementoPresente = true;
                    break;
                }
            } catch (NoSuchElementException e) {
                // Se o elemento não é encontrado, espera-se um pouco antes de tentar novamente
                try {
                    Thread.sleep(1000); // Espera 1 segundo
                } catch (InterruptedException ie) {
                    ie.printStackTrace();
                }
            }
        }

        // Verificação final e ação com base na presença do elemento
        if (elementoPresente) {
            System.out.println("O elemento está presente na página.");
        } else {
            System.out.println("O elemento não foi encontrado após " + maxTentativas + " tentativas.");
        }


    }


}
