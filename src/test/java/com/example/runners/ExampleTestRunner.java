package com.example.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/calculadora.feature",
        glue = "com.example.steps",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        plugin = "pretty",
        tags = "@Test1"
)
public class ExampleTestRunner {
}
