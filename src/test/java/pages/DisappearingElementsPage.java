package pages;

import Suporte.CliqueCommands;
import Suporte.PreencherCampos;
import Suporte.VisibilidadeElementosPagina;
import maps.DisappearingElementsMaps;

public class DisappearingElementsPage {

    DisappearingElementsMaps disappearingElementsMaps = new DisappearingElementsMaps();

    public void clicarLinkDisappearingElements(){
        CliqueCommands.clique(disappearingElementsMaps.disapearingElementLink);
    }

    public void validarPaginaDisappearingELements(){
        PreencherCampos.validarMensagem(disappearingElementsMaps.tituloPagina, "Disappearing Elements");
    }

    public void validarSeBotaoEstaPresente(){
        VisibilidadeElementosPagina.validarElementoPresenteNaPagina(disappearingElementsMaps.btnGallery);
    }



}
