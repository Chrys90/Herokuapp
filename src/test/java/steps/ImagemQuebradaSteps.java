package steps;

import Suporte.Driver;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.ImagemQuebradaPage;

public class ImagemQuebradaSteps {

    ImagemQuebradaPage imagemQuebradaPage = new ImagemQuebradaPage();

    @Dado("que esteja na pagina inicial")
    public void queEstejaNaPaginaInicial() {
        Driver.acessarSite("https://the-internet.herokuapp.com/");
    }

    @Quando("clicar no link Broken Images")
    public void clicarNoLinkBrokenImages() {
        imagemQuebradaPage.clicarLinkBrokenImages();
    }

    @Entao("verifico se a primeira imagem esta quebrada")
    public void verificoQueAPrimeiraImagemEstaQuebrada() {
        imagemQuebradaPage.validarImagem1();
    }

    @Entao("verifico que a segunda imagem esta quebrada")
    public void verificoQueASegundaImagemEstaQuebrada() {
        imagemQuebradaPage.validarImagem2();
    }

    @Entao("verifico que a terceira imagem esta disponivel")
    public void verificoQueATerceiraImagemEstaDisponivel() {
        imagemQuebradaPage.validarImagem3();
    }

}
