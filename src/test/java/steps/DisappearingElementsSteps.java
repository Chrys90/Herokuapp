package steps;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.DisappearingElementsPage;

public class DisappearingElementsSteps {

    DisappearingElementsPage disappearingElementsPage = new DisappearingElementsPage();

    @Quando("clicar em Disappearing Elements")
    public void clicarEmDisappearingElements() {
        disappearingElementsPage.clicarLinkDisappearingElements();
    }
    @Entao("sou direcionado para o link Disappearing Elements")
    public void souDirecionadoParaOLinkDisappearingElements() {
        disappearingElementsPage.validarPaginaDisappearingELements();
    }
    @Entao("verifico se o botao Gallery esta presente na tela")
    public void verificoSeOBotaoGalleryEstaPresenteNaTela() {
        disappearingElementsPage.validarSeBotaoEstaPresente();
    }


}
