package co.com.proyectobase.tu.tasks;

import co.com.proyectobase.tu.interactions.SeleccionarProducto;
import co.com.proyectobase.tu.userinterface.PaginaInicialDemoBlaze;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AgregarProductos implements Task {

    private String producto;

    private final WebDriver driver = Serenity.getWebdriverManager().getCurrentDriver();

    public AgregarProductos(String producto) {
        this.producto = producto;
    }

    public static AgregarProductos alCarroDeCompras(String producto) {
        return Tasks.instrumented(AgregarProductos.class, producto);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PaginaInicialDemoBlaze.CATEGORIA_PHONE),
                SeleccionarProducto.desdeLaPagina(PaginaInicialDemoBlaze.LISTA_PRODUCTOS, producto),
                Click.on(PaginaInicialDemoBlaze.AGREGAR_AL_CARRO)
                );
        try{
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.alertIsPresent()).dismiss();
        }
        catch (Exception e){
            System.out.println("Alert not Displayed");
        }
        actor.attemptsTo(Click.on(PaginaInicialDemoBlaze.VOLVER_INICIO));
    }
}
