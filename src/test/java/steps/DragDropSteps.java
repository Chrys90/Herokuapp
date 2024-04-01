package steps;

import Suporte.Driver;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.DragDropPage;

public class DragDropSteps {

    DragDropPage dragDropPage = new DragDropPage();


    @Dado("que esteja no site herokuapp no link Drag and Drop")
    public void queEstejaNoSiteHerokuappNoLinkDragAndDrop() {
        Driver.acessarSite("https://the-internet.herokuapp.com/drag_and_drop");
    }
    @Quando("mover o elemento A para o lugar do elemento B")
    public void moverOElementoAParaOLugarDoElementoB() {
        dragDropPage.executarDragDrop();
    }
    @Entao("o elemento A devera ficar no lugar do elemento B")
    public void oElementoADeveraFicarNoLugarDoElementoB() {
        dragDropPage.verificarSeOCampoFoiMovido();
    }
}
