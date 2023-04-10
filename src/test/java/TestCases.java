import org.junit.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCases extends BaseClass {

    private IngresarPagina ingresarPagina;
    private HomePage homePage;
    private Carrito carrito;
    private PrimerCheckOut primerCheckOut;
    private SegundoCheckOut segundoCheckOut;
    private CheckOutCompleto checkOutCompleto;

    @BeforeClass
    public void init() {
        driver.get("https://www.saucedemo.com/");
        ingresarPagina = new IngresarPagina(driver);
        homePage = new HomePage(driver);
        carrito = new Carrito(driver);
        primerCheckOut = new PrimerCheckOut(driver);
        segundoCheckOut = new SegundoCheckOut(driver);
        checkOutCompleto = new CheckOutCompleto(driver);
    }
    @Test(priority = 1)
    public void ingresar_sauceDemo() {
        ingresarPagina.ingresarCredenciales("standard_user", "secret_sauce");
        ingresarPagina.clicBotonIngresar();
    }

    @Test(priority = 2)
    public void agregar_producto_carrito() {
        homePage.agregarProductoCarrito();
        homePage.irACarrito();
    }

    @Test(priority = 3)
    public void validar_producto_carrito() {
        carrito.checkOutProducto();
    }

    @Test(priority = 4)
    public void ingresar_informacion_usuario() {
        primerCheckOut.llenarFormulario("standard_user", "secret_sauce", "1234");
        primerCheckOut.clicEnContinuarOrder();
    }

    @Test(priority = 5)
    public void completar_orden() {
        segundoCheckOut.clicEnFinalizarOrden();
    }

    @Test(priority = 6)
    public void validar_compra() {
        Assert.assertEquals("La orden no fue completada", "Thank you for your order!", checkOutCompleto.validarCompra());
    }


}

