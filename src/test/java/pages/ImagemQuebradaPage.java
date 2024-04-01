package pages;

import Suporte.ImagemCommands;
import Suporte.CliqueCommands;
import maps.ImagemQuebradaMaps;


public class ImagemQuebradaPage {

    ImagemQuebradaMaps imagemQuebradaMaps = new ImagemQuebradaMaps();

    public void clicarLinkBrokenImages(){
        CliqueCommands.clique(imagemQuebradaMaps.linkBrokenImages);
    }

    public void validarImagem1(){
        String urlImage1 = "https://the-internet.herokuapp.com/asdf.jpg";
        ImagemCommands.validarImagem(urlImage1);
    }

    public void validarImagem2(){
       String urlImage2 = "https://the-internet.herokuapp.com/hjkl.jpg";
       ImagemCommands.validarImagem(urlImage2);
    }

    public void validarImagem3(){
        String urlImage3 = "https://the-internet.herokuapp.com/img/avatar-blank.jpg";
        ImagemCommands.validarImagem(urlImage3);
    }


}
