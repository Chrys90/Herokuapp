package steps;

import Suporte.Driver;
import Suporte.JavaScriptAlerta;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.ContextMenuPage;

public class ContextMenuSteps {
    ContextMenuPage contextMenuPage = new ContextMenuPage();

    @Dado("que estou na pagina do herokuapp no link Context Menu")
    public void queEstouNaPaginaDoHerokuappNoLinkContextMenu() {
        Driver.acessarSite("https://the-internet.herokuapp.com/context_menu");
    }
    @Quando("clicar com o botao direito no box")
    public void clicarComOBotaoDireitoNoBox() {
        contextMenuPage.clicarComBotaoDireitoBox();
    }

    @Entao("deve ser apresentado o alerta na pagina")
    public void deveSerApresentadoOAlertaNaPagina() {
        JavaScriptAlerta.verificarAlertaNaTela();
    }
}
