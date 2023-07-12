package runner;

import com.vimalselvam.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import java.io.File;

@RunWith(Cucumber.class)
@CucumberOptions(features="./src/main/java/features",tags={}
        ,plugin= {"pretty","html:target"}
        ,monochrome=true
        ,glue= {"stepDefs"}
        ,strict=true
        ,dryRun=false)
public class RunnerTest {

}