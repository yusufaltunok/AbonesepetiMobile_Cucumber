package abonesepeti.runners;

import   io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

<<<<<<< HEAD
    @RunWith(Cucumber.class)
    @CucumberOptions(
            plugin = "html:raporlar/CucumberRapor.html",
            features = "src/test/resources/features",
            glue = {"abonesepeti/stepdefs","abonesepeti/hooks"},
            tags = "@US23_TC01",
            dryRun = false,
            monochrome = true
    )
=======
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:raporlar/CucumberRapor.html",
        features = "src/test/resources/features",
        glue = {"abonesepeti/stepdefs","abonesepeti/hooks"},
        tags = "@US07",
        dryRun = false,
        monochrome = true
)
>>>>>>> master


public class Runner {
}


