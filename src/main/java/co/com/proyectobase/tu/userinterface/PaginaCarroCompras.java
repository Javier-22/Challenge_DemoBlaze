package co.com.proyectobase.tu.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class PaginaCarroCompras {
    public static final Target REALIZAR_PEDIDO =Target.the("").located(By.xpath("//button[normalize-space()='Place Order']"));
    public static final Target NOMBRE =Target.the("").located(By.id("name"));
    public static final Target PAIS =Target.the("").located(By.id("country"));
    public static final Target CIUDAD =Target.the("").located(By.id("city"));
    public static final Target TARJETA =Target.the("").located(By.id("card"));
    public static final Target MES =Target.the("").located(By.id("month"));
    public static final Target ANNO =Target.the("").located(By.id("year"));
    public static final Target COMPRA =Target.the("").located(By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]"));
    public static final Target GRACIAS_POR_COMPRA =Target.the("").located(By.xpath("//h2[contains(text(),'Thank you for your purchase!')]"));
}
