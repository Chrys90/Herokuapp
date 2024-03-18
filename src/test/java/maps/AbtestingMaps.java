package maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Suporte.Driver;

public class AbtestingMaps {

    public AbtestingMaps() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (css = "a[href ='/abtest']")
    public WebElement linkAbTesting;

    @FindBy (css = "#content > div> h3")
    public WebElement tituloPagina;

    @FindBy (css = "#content > div >p")
    public  WebElement textoParagrafo;

}
