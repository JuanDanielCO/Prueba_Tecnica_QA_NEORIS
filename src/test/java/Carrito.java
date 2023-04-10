import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Carrito extends BaseClass{

    //Inicializando las variables de WebElement

    @FindBy(xpath = "//button[@id='checkout']")
    private WebElement checkOutBoton;

    //Uso de Page Factory para inicializar los elementos de la página web actual
    public Carrito(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Método para hacer clic en el botón "CheckOut"

    public void checkOutProducto(){
        checkOutBoton.click();
    }

}
