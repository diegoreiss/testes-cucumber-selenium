package features;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/features/sistemassenac/Componentes.feature", glue = "", tags = "@validar_elemento_radio_checkbox")
public class TestRunner {
}
