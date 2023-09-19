package co.com.proyectobase.tu.runners;



import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/AutomatizacionDemoBlaze.feature",
        glue = {"co.com.proyectobase.tu.stepdefinitions", "co.com.proyectobase.tu.util"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class DemoBlaze {
}
