package abonesepeti.runners;

import   io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:raporlar/CucumberRapor.html",
        features = "src/test/resources/features",
        glue = {"abonesepeti/stepdefs","abonesepeti/hooks"},
        tags = "@us49",
        dryRun = false,
        monochrome = true

)


public class Runner {
}


