package github;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.files.DownloadActions.click;

import static org.openqa.selenium.By.cssSelector;
import static org.openqa.selenium.remote.tracing.EventAttribute.setValue;

public class SelenideRepository {




    @Test
    void shouldFindSelenideAsRepository(){
        Selenide.open("https://github.com/");
        Selenide.$("[data-test-selector=nav-search-input").setValue("selenide").pressEnter();

$$(cssSelector("ul.repo-list li")).first().$( cssSelector("a")).click();

$( "#repository-container-header").shouldHave(text("selenide / selenide"));


        sleep(4000);
    }
}
