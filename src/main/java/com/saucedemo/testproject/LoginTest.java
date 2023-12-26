package com.saucedemo.testproject;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/main/java/com.saucedemo.testproject/features",
        glue = {"src/main/java/TestDefinitions"},
        plugin = {"pretty", "html:target/cucumber-reports","json-cucumber.json"}
)
public class LoginTest extends AbstractTestNGCucumberTests {
}