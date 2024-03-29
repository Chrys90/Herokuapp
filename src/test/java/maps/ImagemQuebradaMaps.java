package maps;

import Suporte.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ImagemQuebradaMaps {

    public ImagemQuebradaMaps() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (css = "a[href='/broken_images']")
    public WebElement linkBrokenImages;

    @FindBy (xpath = "//img[@src='asdf.jpg']")
    public WebElement imagem1;

    @FindBy (xpath = "//img[@src='hjkl.jpg']")
    public WebElement imagem2;

    @FindBy (xpath = "//img[@src='img/avatar-blank.jpg']")
    public WebElement imagem3;

}
