import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutCompleto extends BaseClass{
    //Inicializando las variables de WebElement
    @FindBy(xpath = "//h2[@class='complete-header']")
    private WebElement validarCompraTexto;
    @FindBy(xpath = "//button[@id='back-to-products']")
    private WebElement botonVolver;

    //Uso de Page Factory para inicializar los elementos de la página web actual
    public CheckOutCompleto(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Método para validar que la orden ha sido completada
    public String validarCompra(){
        esperarElementoWEB(botonVolver);
        return validarCompraTexto.getText();
    }
}
