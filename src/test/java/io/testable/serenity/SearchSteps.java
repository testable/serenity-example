package io.testable.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class SearchSteps extends ScenarioSteps {

    HomePage homePage;

    @Step
    public void opens_home_page() {
        homePage.open();
    }

    @Step
    public void searches_by_keyword(String keyword) {
        homePage.enterSearchTerms(keyword);
    }
}
