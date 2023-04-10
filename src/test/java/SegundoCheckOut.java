import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SegundoCheckOut extends BaseClass{

    //Inicializando las variables de WebElement
    @FindBy(xpath = "//button[@id='finish']")
    private WebElement finalizarOrdenBoton;

    @FindBy (xpath = "//button[@id='cancel']")
    private WebElement botonCancelar;

    //Uso de Page Factory para inicializar los elementos de la página web actual
    public SegundoCheckOut(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Método para hacer clic en botón "Finalizar"
    public void clicEnFinalizarOrden(){
        esperarElementoWEB(botonCancelar);
        finalizarOrdenBoton.click();
    }
}
