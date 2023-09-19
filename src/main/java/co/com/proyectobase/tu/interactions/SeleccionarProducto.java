package co.com.proyectobase.tu.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;

import java.util.List;

public class SeleccionarProducto implements Interaction {

    private Target listaProductosPagina;
    private String productoEsperado;

    public SeleccionarProducto(Target listaProductosPagina, String productoEsperado) {
        this.listaProductosPagina = listaProductosPagina;
        this.productoEsperado = productoEsperado;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        int posicion=0;
        List<WebElementFacade> listaProductos = listaProductosPagina.resolveAllFor(actor);
        for (int i =0; i < listaProductos.size(); i++){
            if (listaProductos.get(i).getText().equals(productoEsperado)){
                posicion=i;
            }
        }
        listaProductos.get(posicion).click();
    }
    public static SeleccionarProducto desdeLaPagina(Target listaProductosPagina, String productoEsperado) {
        return new SeleccionarProducto(listaProductosPagina, productoEsperado);
    }
}
