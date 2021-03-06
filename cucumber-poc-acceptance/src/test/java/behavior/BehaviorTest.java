package behavior;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        format = {
                "pretty",
                "html:target/html/BehaviorTestFeatures"
        },
        features = {
                "src/test/resources/features"
        },
        glue = {
                "steps"
        },
        monochrome = true,
        tags = {
                "@Feature-Molecular-Weight"
        }
)
public class BehaviorTest {
    
}
