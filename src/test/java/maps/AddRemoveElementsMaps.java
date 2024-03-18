package maps;

import Suporte.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddRemoveElementsMaps {

    public AddRemoveElementsMaps() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "a[href ='/add_remove_elements/']")
    public WebElement linkAddRemoveElements;

    @FindBy(css = "#content >h3")
    public WebElement txtTituloPagina;

    @FindBy (css = ".example > button")
    public WebElement btnAddElement;

    @FindBy (css = "#elements > button")
    public WebElement btnDelete;

}
