package steps;

import Suporte.Driver;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.AddRemoveElementsPage;

public class AddRemoveElementsSteps {

    AddRemoveElementsPage addRemoveElementsPage = new AddRemoveElementsPage();

    @Dado("eu estou na pagina inicial")
    public void eu_estou_na_pagina_inicial() {
        Driver.acessarSite("https://the-internet.herokuapp.com/");
    }
    @Quando("clicar em Add Remove Elements")
    public void clicar_em_add_remove_elements() {
    addRemoveElementsPage.clicarlinkAddRemoveElements();
    }
    @Quando("clicar em AddElement")
    public void clicar_em_add_element() {
    addRemoveElementsPage.clicarAddElements();
    }
    @Quando("clicar em Delete")
    public void clicar_em_delete() {
    addRemoveElementsPage.clicarDelete();

    }
    @Entao("o botao Delete deve ser removido")
    public void o_botao_delete_deve_ser_removido() {
    addRemoveElementsPage.validarTituloPagina();
    addRemoveElementsPage.validarExclusaoBtnDelete();
    }
}
