package pages;

import Suporte.CheckboxCommands;
import Suporte.CliqueCommands;
import maps.CheckboxMaps;

public class CheckboxPage {

    CheckboxMaps checkboxMaps = new CheckboxMaps();

    public void clicarCheckbox1(){
        CliqueCommands.clique(checkboxMaps.checkbox1);
    }


    public void verificarSeOCheckbox1EstaMarcado(){
        CheckboxCommands.validarCheckboxMarcado(checkboxMaps.checkbox1);
    }


}
