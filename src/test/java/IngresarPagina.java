import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IngresarPagina extends BaseClass{

    //Inicializando las variables de WebElement
    @FindBy (xpath = "//input[@id='user-name']")
            private WebElement nombreUsuario;
    @FindBy (xpath = "//input[@id='password']")
    private WebElement passwordUsuario;
    @FindBy (xpath = "//input[@id='login-button']")
    private WebElement botonIngresar;
    @FindBy (xpath = "//div[@id='login_credentials']")
    private WebElement credencialesIngreso;

    //Uso de Page Factory para inicializar los elementos de la página web actual
    public IngresarPagina(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Método para ingresar las credenciales
    public void ingresarCredenciales(String standardUser, String secret){
        esperarElementoWEB(credencialesIngreso);
        nombreUsuario.sendKeys(standardUser);
        passwordUsuario.sendKeys(secret);
    }

    //Método para hacer clic en el botón de "Ingresar"
    public void clicBotonIngresar(){
        botonIngresar.click();
    }

}
