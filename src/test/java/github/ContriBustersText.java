package github;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static org.openqa.selenium.By.cssSelector;


public class ContriBustersText {


    @Test
    void homework5() {

        Configuration.browserSize="1920x1080";
        open("https://github.com/");
        $("[data-test-selector=nav-search-input").setValue("selenide").pressEnter();
        $$(cssSelector("ul.repo-list li")).first().$( cssSelector("a")).click();
        $( "#repository-container-header").shouldHave(text("selenide / selenide"));


        $("#wiki-tab").click();
        $(".wiki-more-pages-link button").scrollTo().click();
        $("#wiki-pages-box").find(byText("SoftAssertions")).click();
        $(".markdown-body").scrollTo().shouldHave(text("Using JUnit5 extend test class:"));



    }


    }






