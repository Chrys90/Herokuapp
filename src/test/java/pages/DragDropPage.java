package pages;

import Suporte.DragDrop;
import Suporte.Driver;
import maps.DragDropMaps;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

public class DragDropPage {

    DragDropMaps dragDropMaps = new DragDropMaps();

    public void executarDragDrop( ) {
        WebElement elementoOrigem = dragDropMaps.colunaA;
        WebElement elementoDestino = dragDropMaps.colunaB;

        DragDrop.executarDragDrop(elementoOrigem,elementoDestino);
    }

    public boolean verificarSeOCampoFoiMovido() {

        Point posicaoInicial = DragDrop.obterPosicaoElemento(dragDropMaps.colunaA);
        Point posicaoFinal = DragDrop.obterPosicaoElemento(dragDropMaps.colunaB);
        
        if (DragDrop.verificarMudancaPosicao(posicaoInicial, posicaoFinal)){
            System.out.println("O elemento foi movido corretamente.");
        } else {
            System.out.println("O elemento não foi movido.");
        }
        return DragDrop.verificarMudancaPosicao(posicaoInicial, posicaoFinal);
        }
    }

