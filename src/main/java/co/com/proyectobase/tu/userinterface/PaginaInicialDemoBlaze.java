package co.com.proyectobase.tu.userinterface;

import co.com.proyectobase.tu.util.Constantes;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl(Constantes.URL_DEMO_BLAZE)
public class PaginaInicialDemoBlaze extends PageObject {

    public static final Target CATEGORIA_PHONE = Target.the("Click en categoria phone")
            .located(By.xpath("//div[@id='contcont']/div/div/div/a[1]"));

    public static final Target LISTA_PRODUCTOS = Target.the("Click en categoria phone")
            .located(By.xpath("//a[@class='hrefch']"));

    public static final Target AGREGAR_AL_CARRO = Target.the("Click en categoria phone")
            .located(By.xpath("//a[@class='btn btn-success btn-lg']"));
    public static final Target VOLVER_INICIO = Target.the("Click en categoria phone")
            .located(By.xpath("//*[@id='navbarExample']/ul/li[1]/a"));

    public static final Target CARRO_DE_COMPRAS = Target.the("Click en categoria phone")
            .located(By.xpath("//*[@id=\"cartur\"]"));

}
