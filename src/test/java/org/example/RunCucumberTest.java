package org.example;

import io.cucumber.testng.*;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import org.testng.annotations.*;


@CucumberOptions(plugin = {"summary", "json:target/cucumber-report.json"},
        tags = {"@adresse", "@modification"},
        features = "src/test/resources/features/adresse.feature"

)
//@RunWith(CucumberWithSerenity.class)
public class RunCucumberTest {
    private TestNGCucumberRunner testNGCucumberRunner;

    @BeforeClass(alwaysRun = true)
    public void setUpClass() {

        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());

    }


    @Test(groups = "cucumber", description = "Runs Cucumber Scenarios", dataProvider = "scenarios")
    public void scenario(PickleWrapper pickle, FeatureWrapper cucumberFeature) throws Throwable {

        testNGCucumberRunner.runScenario(pickle.getPickle());

    }


    @DataProvider

    public Object[][] scenarios() {

        return testNGCucumberRunner.provideScenarios();

    }


    @AfterClass(alwaysRun = true)
    public void tearDownClass() {

        testNGCucumberRunner.finish();

    }


}