package io.testable.serenity;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Assertions.assertThat;

@DefaultUrl("https://www.google.com")
public class HomePage extends PageObject {

    @FindBy(name="q")
    WebElementFacade searchBox;

    public void enterSearchTerms(String keyword) {
        searchBox.typeAndEnter(keyword);
        withTimeoutOf(10, TimeUnit.SECONDS).waitForTitle("firefly - Google Search");
        assertThat(getTitle()).isEqualTo("firefly - Google Search");
    }
}