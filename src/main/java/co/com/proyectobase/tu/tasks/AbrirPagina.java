package co.com.proyectobase.tu.tasks;



import co.com.proyectobase.tu.userinterface.PaginaInicialDemoBlaze;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;


public class AbrirPagina extends PageObject implements Task{

    PaginaInicialDemoBlaze paginaInicialDemoBlaze;

    public static AbrirPagina demoBlaze() {
        return Tasks.instrumented(AbrirPagina.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(paginaInicialDemoBlaze));
    }
}
