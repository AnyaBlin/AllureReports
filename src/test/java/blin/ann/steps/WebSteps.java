package blin.ann.steps;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class WebSteps {

    @Step("Открываем главную страницу")
    public void openMainPage () {
        open("https://github.com/");
    }
    @Step("Ищем репозиторий {repository}")
    public void searchRepo (String repository) {
        $(".header-search-input").click();
        $(".header-search-input").setValue(repository).pressEnter();
    }
    @Step("Переходим в репозиторий {repository}")
    public void goToRepo (String repository) {
        $(By.linkText(repository)).click();
    }
    @Step("Открываем Issues")
    public void openIssue () {
        $(By.partialLinkText("Issues")).click();
    }
    @Step("Проверяем, что существует Issue с номером {number}")
    public void checkIssueWithNumber (Integer number) {
        $(withText("#"+number)).should(Condition.visible);
    }
}

