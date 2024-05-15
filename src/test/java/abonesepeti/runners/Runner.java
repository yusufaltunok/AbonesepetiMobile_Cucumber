package abonesepeti.runners;

import   io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
    @RunWith(Cucumber.class)
    @CucumberOptions(
            plugin = "html:raporlar/CucumberRapor.html",
            features = "src/test/resources/features",
            glue = {"abonesepeti/stepdefs","abonesepeti/hooks"},
<<<<<<< HEAD
            tags = "  @US23_TC01",
=======
            tags = "@us20_02",
>>>>>>> master
            dryRun = false,
            monochrome = true
    
)

        
public class Runner {
}


