package maps;

import Suporte.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DragDropMaps {

    public DragDropMaps() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (css = "#column-a")
    public WebElement colunaA;

    @FindBy (css = "#column-b")
    public WebElement colunaB;

}
