import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass{

    //Inicializando las variables de WebElement

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
    private WebElement backPackProducto;
    @FindBy (xpath = "//button[@id='add-to-cart-sauce-labs-bike-light']")
    private WebElement bikeProducto;
    @FindBy (xpath = "//div[@id='shopping_cart_container']")
    private WebElement carritoBoton;

    //Uso de Page Factory para inicializar los elementos de la página web actual
    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void agregarProductoCarrito(){
        esperarElementoWEB(bikeProducto);
        backPackProducto.click();
        bikeProducto.click();
    }

    //Método para hacer clic en el botón del "Carrito de Compras"
    public void irACarrito(){
        carritoBoton.click();
    }


}
