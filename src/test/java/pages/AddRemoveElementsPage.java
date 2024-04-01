package pages;

import Suporte.Driver;
import Suporte.PreencherCampos;
import Suporte.CliqueCommands;
import Suporte.VisibilidadeElementosPagina;
import maps.AddRemoveElementsMaps;

public class AddRemoveElementsPage {

    AddRemoveElementsMaps addRemoveElementsMaps = new AddRemoveElementsMaps();

    public void clicarlinkAddRemoveElements(){
        CliqueCommands.clique(addRemoveElementsMaps.linkAddRemoveElements);
    }

    public void clicarAddElements(){
        CliqueCommands.clique(addRemoveElementsMaps.btnAddElement);
        CliqueCommands.clique(addRemoveElementsMaps.btnAddElement);
        CliqueCommands.clique(addRemoveElementsMaps.btnAddElement);
    }

    public void clicarDelete(){
        CliqueCommands.clique(addRemoveElementsMaps.btnDelete);
        CliqueCommands.clique(addRemoveElementsMaps.btnDelete);
        CliqueCommands.clique(addRemoveElementsMaps.btnDelete);
    }

    public void validarTituloPagina(){
        PreencherCampos.validarMensagem(addRemoveElementsMaps.txtTituloPagina,"Add/Remove Elements");
    }

    public void validarExclusaoBtnDelete(){
        VisibilidadeElementosPagina.waitElementBeInvisible(addRemoveElementsMaps.btnDelete,10);
    }
}
