package pages;

import Suporte.Driver;
import Suporte.Utils;
import maps.AddRemoveElementsMaps;
import org.junit.Assert;

public class AddRemoveElementsPage {

    AddRemoveElementsMaps addRemoveElementsMaps = new AddRemoveElementsMaps();

    public void clicarlinkAddRemoveElements(){
        addRemoveElementsMaps.linkAddRemoveElements.click();
    }

    public void clicarAddElements(){
        addRemoveElementsMaps.btnAddElement.click();
        addRemoveElementsMaps.btnAddElement.click();
        addRemoveElementsMaps.btnAddElement.click();
    }

    public void clicarDelete(){
        addRemoveElementsMaps.btnDelete.click();
        addRemoveElementsMaps.btnDelete.click();
        addRemoveElementsMaps.btnDelete.click();
    }

    public void validarTituloPagina(){
        String resultadoAtual = addRemoveElementsMaps.txtTituloPagina.getText();
        String resultadoEsperado = "Add/Remove Elements";
        Assert.assertEquals(resultadoEsperado, resultadoAtual);
    }

    public void validarExclusaoBtnDelete(){
        Driver.invisibilityOf(addRemoveElementsMaps.btnDelete);
    }
}
