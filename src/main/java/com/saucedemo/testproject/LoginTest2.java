package com.saucedemo.testproject;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"your.package.stepdefinitions"},
        plugin = {"pretty", "html:target/cucumber-reports"}
)
public class LoginTest2 extends AbstractTestNGCucumberTests {
}