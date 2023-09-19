package co.com.proyectobase.tu.tasks;

import co.com.proyectobase.tu.model.DatosUsuario;
import co.com.proyectobase.tu.userinterface.PaginaCarroCompras;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CompletarCompra implements Task {

    DataTable data;
    public CompletarCompra (DataTable data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<Map<String,String>> a = data.asMaps(String.class,String.class);
        DatosUsuario datosUsuario = new DatosUsuario(a.get(0).get("producto"),a.get(0).get("nombre"),a.get(0).get("pais"),a.get(0).get("ciudad"),a.get(0).get("numTarjeta"),a.get(0).get("mes"),a.get(0).get("anno"));

        actor.attemptsTo(
                WaitUntil.the(PaginaCarroCompras.REALIZAR_PEDIDO, isVisible()).forNoMoreThan(60).seconds(),
                Click.on(PaginaCarroCompras.REALIZAR_PEDIDO),
                Enter.theValue(datosUsuario.getNombre()).into(PaginaCarroCompras.NOMBRE),
                Enter.theValue(datosUsuario.getPais()).into(PaginaCarroCompras.PAIS),
                Enter.theValue(datosUsuario.getCiudad()).into(PaginaCarroCompras.CIUDAD),
                Enter.theValue(datosUsuario.getNumTarjeta()).into(PaginaCarroCompras.TARJETA),
                Enter.theValue(datosUsuario.getMes()).into(PaginaCarroCompras.MES),
                Enter.theValue(datosUsuario.getAnno()).into(PaginaCarroCompras.ANNO),
                Click.on(PaginaCarroCompras.COMPRA)
        );
    }
    public static CompletarCompra deLosProductos( DataTable data){return Tasks.instrumented(CompletarCompra.class, data);}
}
