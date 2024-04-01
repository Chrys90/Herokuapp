package steps;

import Suporte.Driver;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.CheckboxPage;

public class CheckboxSteps {

    CheckboxPage checkboxPage = new CheckboxPage();

    @Dado("que esteja no herokuapp no link Checkboxes")
    public void queEstejaNoHerokuappNoLinkCheckboxes() {
        Driver.acessarSite("https://the-internet.herokuapp.com/checkboxes");
    }
    @Quando("clicar em checkbox1")
    public void clicarEmCheckbox1() {
        checkboxPage.clicarCheckbox1();
    }

    @Entao("devera ser exibido o checkbox marcado")
    public void deveraSerExibidoOCheckboxMarcado() {
        checkboxPage.verificarSeOCheckbox1EstaMarcado();
    }

    @Dado("que esteja na pagina com checkbox marcado")
    public void queEstejaNaPaginaComCheckboxMarcado() {
        queEstejaNoHerokuappNoLinkCheckboxes();
        clicarEmCheckbox1();
        deveraSerExibidoOCheckboxMarcado();
    }

    @Entao("devera ser exibido o checkbox desmarcado")
    public void deveraSerExibidoOCheckboxDesmarcado() {
        checkboxPage.verificarSeOCheckbox1EstaMarcado();
    }
}
