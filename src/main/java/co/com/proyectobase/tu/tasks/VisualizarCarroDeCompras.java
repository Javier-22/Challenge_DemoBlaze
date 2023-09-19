package co.com.proyectobase.tu.tasks;

import co.com.proyectobase.tu.userinterface.PaginaInicialDemoBlaze;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class VisualizarCarroDeCompras implements Task {
    public static VisualizarCarroDeCompras paraVerificarProducto() {
        return Tasks.instrumented(VisualizarCarroDeCompras.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(PaginaInicialDemoBlaze.CARRO_DE_COMPRAS, isVisible()).forNoMoreThan(15).seconds(),
                Click.on(PaginaInicialDemoBlaze.CARRO_DE_COMPRAS));
    }
}
