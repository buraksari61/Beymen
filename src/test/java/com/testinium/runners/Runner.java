package com.testinium.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(

            features = "src/test/resources/beymen.feature",
            glue = "com/testinium/step_definitions",
            dryRun = false,
            tags = "@wip"
)

public class Runner {

}
