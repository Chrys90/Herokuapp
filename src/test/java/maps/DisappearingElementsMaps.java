package maps;

import Suporte.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DisappearingElementsMaps {




    public DisappearingElementsMaps() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (css = "a[href=\"/gallery/\"]")
    public WebElement btnGallery;

    @FindBy (css = "a[href = \"/disappearing_elements\"]")
    public WebElement disapearingElementLink;

    @FindBy (css = ".example > h3")
    public WebElement tituloPagina;

}
