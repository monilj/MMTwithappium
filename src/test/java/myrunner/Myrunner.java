package myrunner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = false,
        features="src/test/java/features/",format = {"pretty"},
        glue={"steps"})
public class Myrunner {
}