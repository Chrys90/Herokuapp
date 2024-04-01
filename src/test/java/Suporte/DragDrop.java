package Suporte;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

    public static void executarDragDrop( WebElement origem, WebElement destino) {
        new Actions(Driver.getDriver()).dragAndDrop(origem, destino).perform();
    }

    public static Point obterPosicaoElemento(WebElement elemento) {
        return elemento.getLocation();
    }

    public static boolean verificarMudancaPosicao(Point posicaoInicial, Point posicaoFinal) {
        return !posicaoInicial.equals(posicaoFinal);
    }


}
