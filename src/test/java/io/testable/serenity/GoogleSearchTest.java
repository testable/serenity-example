package io.testable.serenity;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class GoogleSearchTest {

    @Managed(driver="chrome")
    WebDriver driver;

    @Steps
    SearchSteps searchSteps;

    @Test
    public void searchForKeyword() {
        searchSteps.opens_home_page();
        searchSteps.searches_by_keyword("firefly");
    }
}