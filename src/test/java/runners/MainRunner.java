package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = {"classpath:Features"},
        glue = {"stepDefinition"},
        tags = "@regression",
        monochrome = true,
        dryRun = false,
        plugin = {"pretty", "html:target/cucumber"})

public class MainRunner extends AbstractTestNGCucumberTests {
}

