package ru.betboom;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class JUnit5ToSoftAssertionsInSelenide {
    @Test
    void selenideSoftAssertionsHaveJunit5Example() {
        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $("#wiki-pages-filter").setValue("SoftAssertions").pressEnter();
        $("#wiki-pages-box").shouldHave(text("Soft")).shouldHave(text("Assertions"));

        $("#wiki-pages-box").$(byText("SoftAssertions")).click();
        $("#user-content-3-using-junit5-extend-test-class").parent().shouldHave(text("Using JUnit5 extend test class"));
    }
}
