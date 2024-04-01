package maps;

import Suporte.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckboxMaps {

    public CheckboxMaps() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy (xpath = "//*[@id=\"checkboxes\"]/input[1]")
    public WebElement checkbox1;

    @FindBy (xpath ="//*[@id=\"checkboxes\"]/input[2]")
    public WebElement checkbox2;


}
