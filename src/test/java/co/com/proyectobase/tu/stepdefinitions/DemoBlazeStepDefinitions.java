package co.com.proyectobase.tu.stepdefinitions;

import co.com.proyectobase.tu.questions.VerificarCompra;
import co.com.proyectobase.tu.tasks.VisualizarCarroDeCompras;
import co.com.proyectobase.tu.tasks.AbrirPagina;
import co.com.proyectobase.tu.tasks.AgregarProductos;
import co.com.proyectobase.tu.tasks.CompletarCompra;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

import static co.com.proyectobase.tu.util.Constantes.NOMBRE_ACTOR;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.core.IsEqual.equalTo;

public class DemoBlazeStepDefinitions {


    @Dado("^que quiero ingresar a la pagina demo blaze$")
    public void queQuieroIngresarALaPaginaDemoBlaze() {
        theActorCalled(NOMBRE_ACTOR).wasAbleTo(AbrirPagina.demoBlaze());
    }
    @Cuando("^agrego un producto (.*) al carro de compras$")
    public void agregoUnProductoAlCarroDeCompras(String producto) {
        theActorInTheSpotlight().attemptsTo(AgregarProductos.alCarroDeCompras(producto));
    }

    @Cuando("^visualizo el producto en el carro de compras$")
    public void visualizoElProductoEnElCarroDeCompras() {
        theActorInTheSpotlight().attemptsTo(VisualizarCarroDeCompras.paraVerificarProducto());
    }

    @Cuando("^completo el formulario de compra con los sgts datos$")
    public void completoElFormularioDeCompra(DataTable data) {
        theActorInTheSpotlight().attemptsTo(CompletarCompra.deLosProductos(data));
    }

    @Entonces("^verifico el mensaje (.*)$")
    public void verificoLaFinalizacionDeLaCompra(String mensajeEsperadp) {
        theActorInTheSpotlight().should(seeThat(VerificarCompra.completada(), equalTo(mensajeEsperadp)));
    }

}
