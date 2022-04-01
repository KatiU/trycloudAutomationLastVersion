package com.trucloud.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

public class CykesRunner {
    @RunWith(Cucumber.class)
    @CucumberOptions(
            plugin = {"pretty",
                    "html:target/cucumber-report.html",
                    "rerun:target/rerun.txt",
                    "me.jvt.cucumber.report.PrettyReports:target/cucumber",
            },
            features = "src/test/resources/features",
            glue = "com/TryCloud/step_definitions",
            dryRun = false,
            tags = "",
            publish = false
    )
    public class CukesRunner {
    }
}
