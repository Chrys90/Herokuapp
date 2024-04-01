package Suporte;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Suporte.Driver.getDriver;

public class PreencherCampos {

    private static WebDriverWait wait;



    public static void preencherCampo(WebElement element, String value) {
        System.out.println("##############################");

        try {
            System.out.println(" vai preencher o campo" + element);
            VisibilidadeElementosPagina.waitElementBeVisible(element, 10000);
            element.sendKeys(value);
            System.out.println(" preencheu o campo" + element);
        } catch (Exception error) {
            System.out.println("********** aconteceu um erro ao tentar preencher o campo" + element);
            System.out.println(error);
        }
        System.out.println("##############################");
    }


    public static void validarMensagem(WebElement element, String expectedMessage) {
        String actualMessage = "";
        System.out.println("##############################");
        System.out.println(" vai validar a mensagem" + expectedMessage);
        VisibilidadeElementosPagina.waitElementBeVisible(element, 10000);
        actualMessage = element.getText();
        // Quando não der certo, vai quebrar o teste!!!
        Assert.assertEquals("Erro ao validar mensagens!", expectedMessage, actualMessage);
        System.out.println(" validou a mensagem" + expectedMessage);
        System.out.println("##############################");
    }
}
