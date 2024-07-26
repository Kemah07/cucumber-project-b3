package io.loop.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",  // it is where our test scenario is stored
        glue = "io/loop/step_definitions",   // it is where step definitions cod stored
        dryRun = false, // generating code snippet "DryRun = true" means do not run scenario just check it
        tags = "@smoke and @Regression",
        monochrome = true
)

public class CukesRunner {


}
