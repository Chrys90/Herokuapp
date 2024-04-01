package Suporte;

import org.openqa.selenium.WebElement;

public class CheckboxCommands {

    public static void validarCheckboxMarcado(WebElement checkbox) {
        boolean isChecked = checkbox.isSelected();

        // Verifique se o checkbox está marcado e imprima o resultado
        if (isChecked) {
            System.out.println("O checkbox está marcado.");
        } else {
            System.out.println("O checkbox não está marcado.");
        }

    }
}
