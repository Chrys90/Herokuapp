package maps;

import Suporte.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContextMenuMaps {

    public ContextMenuMaps() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (css = "#hot-spot")
    public WebElement boxContext;
}
