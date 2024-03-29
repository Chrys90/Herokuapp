package pages;

import Suporte.Driver;
import Suporte.Utils;
import maps.AddRemoveElementsMaps;

public class AddRemoveElementsPage {

    AddRemoveElementsMaps addRemoveElementsMaps = new AddRemoveElementsMaps();

    public void clicarlinkAddRemoveElements(){
        Utils.clique(addRemoveElementsMaps.linkAddRemoveElements);
    }

    public void clicarAddElements(){
        Utils.clique(addRemoveElementsMaps.btnAddElement);
        Utils.clique(addRemoveElementsMaps.btnAddElement);
        Utils.clique(addRemoveElementsMaps.btnAddElement);
    }

    public void clicarDelete(){
        Utils.clique(addRemoveElementsMaps.btnDelete);
        Utils.clique(addRemoveElementsMaps.btnDelete);
        Utils.clique(addRemoveElementsMaps.btnDelete);
    }

    public void validarTituloPagina(){
        Utils.validarMensagem(addRemoveElementsMaps.txtTituloPagina,"Add/Remove Elements");
    }

    public void validarExclusaoBtnDelete(){
        Driver.invisibilityOf(addRemoveElementsMaps.btnDelete);
    }
}
