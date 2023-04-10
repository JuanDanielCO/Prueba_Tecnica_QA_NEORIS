import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import java.time.Duration;

public class BaseClass {

    //Declarar la variable WebDriver
    protected WebDriver driver;

    //Inicializar la variable del path de la ubicación del driver del navegador
    String driverPath = ".\\src\\main\\resources\\drivers\\msedgedriver.exe";

    //Anotación del metodo a ejecutar antes de las pruebas
    @BeforeClass
    public void abrirNavegador(){
        System.setProperty("webdriver.edge.driver", driverPath);
        driver = new EdgeDriver();
        driver.manage().window().maximize();
    }

    //Anotación del metodo a ejecutar después de las pruebas
    @AfterClass
    public void CerrarNavegador(){
        driver.quit();
    }

    //Método para esperar hasta que un elemento sea visible en la página web
    public void esperarElementoWEB(WebElement elemento){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(elemento));
    }
}
