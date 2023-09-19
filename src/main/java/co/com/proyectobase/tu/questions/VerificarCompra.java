package co.com.proyectobase.tu.questions;

import co.com.proyectobase.tu.userinterface.PaginaCarroCompras;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class VerificarCompra implements Question<String> {
    public static VerificarCompra completada() {
        return new VerificarCompra();
    }

    @Override
    public String answeredBy(Actor actor) {{
            return actor.asksFor(Text.of(PaginaCarroCompras.GRACIAS_POR_COMPRA).asString());
        }
    }
}
