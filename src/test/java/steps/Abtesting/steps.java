package steps.Abtesting;

import Suporte.Driver;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.AbtestingPage;

public class steps {

    AbtestingPage abtestingPage = new AbtestingPage();

    @Dado("que estou na pagina inicial")
    public void que_estou_na_pagina_inicial() {
        Driver.acessarSite("https://the-internet.herokuapp.com/");
    }
    @Quando("clicar no link AB Testing")
    public void clicar_no_link_ab_testing() {
        abtestingPage.clicarLinkAbTesting();

    }
    @Entao("devo ser direcionado para a pagina referente ao assunto AB Testing")
    public void devo_ser_direcionado_para_a_pagina_referente_ao_assunto_ab_testing() {
        String resultado = abtestingPage.verificarResultado();
        System.out.println(resultado);
    }



}
