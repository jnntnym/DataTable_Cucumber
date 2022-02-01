import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        //  features = "src/test/java/features",    // manually type for feature file location
        features = "src/test/java/features/loginusers.feature",
        glue = "stepDef",                       // manually type make relation between features file with stepDef by glue
        tags = "@loginTable",
        plugin = {                              // manually type for report
                "json:target/cucumber.json"
        }
)

public class TestRunner extends AbstractTestNGCucumberTests {
    // extends AbstractTestNGCucumberTests for Automate
}
