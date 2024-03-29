package pages;

import Suporte.Utils;
import dados.DadosTeste;
import maps.AbtestingMaps;

import java.io.IOException;

public class AbtestingPage {

    AbtestingMaps abtestingMaps = new AbtestingMaps();

    public void clicarLinkAbTesting(){
        Utils.clique(abtestingMaps.linkAbTesting);
    }

    public void validarTituloPagina(String resultadoEsperado) {
        Utils.validarMensagem(abtestingMaps.tituloPagina, resultadoEsperado );
    }

    public boolean validarResultadoTesteA() {
        try {
            validarTituloPagina("A/B Test Variation 1");
            return true;
        } catch (AssertionError e) {
            return false;
        }
    }

    public boolean validarResultadoTesteB() {
        try {
            validarTituloPagina("A/B Test Control");
            return true;
        } catch (AssertionError e) {
            return false;
        }
    }


    public String verificarResultado() {
        // Chama os métodos para validar os resultados
        boolean resultadoA = validarResultadoTesteA();
        boolean resultadoB = validarResultadoTesteB();

        // Verifica o resultado do teste A
        if (resultadoA) {
            // Retorna a mensagem se o teste A passou
            return "Variação do Título com o Teste A";
        } else if (resultadoB) {
            // Retorna o resultado do teste B se o teste A falhou
            return "Variação do Título com o Teste B";
        }
            return "O teste falhou";
    }

    public void validarTxtParagrafo() throws IOException {
        Utils.validarMensagem(abtestingMaps.textoParagrafo,DadosTeste.getAbTestingParagrafo() );
    }
}
