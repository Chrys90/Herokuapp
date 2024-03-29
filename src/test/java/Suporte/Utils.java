package Suporte;

import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.HttpResponse;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



import java.io.IOException;
import java.time.Duration;

import static Suporte.Driver.getDriver;

public class Utils {

    public static void waitElementBeClicable(WebElement element, Integer tempo) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(tempo));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void waitElementBeVisible(WebElement element, Integer tempo) {
        WebDriverWait wait = new WebDriverWait(getDriver(),Duration.ofSeconds(tempo));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void clique(WebElement element){
        System.out.println("##############################");

        try{
            System.out.println(" vai clicar no elemento" + element);
            waitElementBeClicable(element, 10000);
            element.click();
            System.out.println(" clicou no elemento" + element );
        }

        catch (Exception error) {
            System.out.println("********** aconteceu um erro ao tentar clicar no elemento" + element);
            System.out.println(error);
        }
        System.out.println("##############################");
    }

    public static void preencherCampo(WebElement element, String value){
        System.out.println("##############################");

        try{
            System.out.println(" vai preencher o campo" + element);
            waitElementBeVisible(element, 10000);
            element.sendKeys(value);
            System.out.println(" preencheu o campo" + element );
        }

        catch (Exception error) {
            System.out.println("********** aconteceu um erro ao tentar preencher o campo" + element);
            System.out.println(error);
        }
        System.out.println("##############################");
    }

    public static void validarMensagem(WebElement element, String expectedMessage ){
        String actualMessage = "";
        System.out.println("##############################");
        System.out.println(" vai validar a mensagem" + expectedMessage);
        waitElementBeVisible(element,10000);
        actualMessage = element.getText();
        // Quando não der certo, vai quebrar o teste!!!
        Assert.assertEquals("Erro ao validar mensagens!",expectedMessage, actualMessage);
        System.out.println(" validou a mensagem" + expectedMessage);
        System.out.println("##############################");
    }


        private static boolean validarDisponibilidadeImagem(String imageUrl) throws IOException {

            CloseableHttpClient httpClient = HttpClients.createDefault();
            HttpGet request = new HttpGet(imageUrl);

            try {
                HttpResponse response = httpClient.execute(request);
                int statusCode = response.getCode();

                // Verifica se o código de status é 200 (OK)
                return statusCode == 200;
            } finally {
                // Certifique-se de fechar o cliente HTTP
                httpClient.close();
            }
        }

            public static void validarImagem (String imageUrl) {

                try {
                    if (validarDisponibilidadeImagem(imageUrl)) {
                        System.out.println("A imagem está disponível.");
                    } else {
                        System.out.println("A imagem está quebrada ou não existe.");
                    }
                } catch (IOException e) {
                    System.err.println("Erro ao validar a imagem: " + e.getMessage());
                }
            }




        }
