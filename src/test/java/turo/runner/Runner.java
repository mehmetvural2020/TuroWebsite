package turo.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(glue ={"turo.stepdef"},
        // Glue path must start after java folder. (after this -> src/test/java)
        features = "src/test/resources/features",
//        dryRun = false,
//        strict = false,
//        tags = "",
        plugin = {"pretty",
                "html:target/default-cucumber-reports",
                "json:target/cucumber.json"})
public class Runner {

}
