import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PrimerCheckOut extends BaseClass{

    //Inicializando las variables de WebElement

    @FindBy(xpath = "//input[@id='first-name']")
    private WebElement nombreUsuario;
    @FindBy (xpath = "//input[@id='last-name']")
    private WebElement apellidoUsuario;
    @FindBy (xpath = "//input[@id='postal-code']")
    private WebElement codigoPostalUsuario;
    @FindBy (xpath = "//input[@id='continue']")
    private WebElement botonContinuar;
    @FindBy (xpath = "//button[@id='cancel']")
    private WebElement botonCancelar;

    //Uso de Page Factory para inicializar los elementos de la página web actual
    public PrimerCheckOut(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Método para ingresar la información del usuario
    public void llenarFormulario(String nombre, String apellido, String codigoPostal){
        esperarElementoWEB(botonCancelar);
        nombreUsuario.sendKeys(nombre);
        apellidoUsuario.sendKeys(apellido);
        codigoPostalUsuario.sendKeys(codigoPostal);
    }

    //Método para hacer clic en el botón de "Continuar"
    public void clicEnContinuarOrder(){
        botonContinuar.click();
    }

}
