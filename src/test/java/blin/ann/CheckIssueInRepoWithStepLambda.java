package blin.ann;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class CheckIssueInRepoWithStepLambda {

private static final String REPOSITORY = "eroshenkoam/allure-example";
    private static final int issue_number  = 74;

    @Test
    @DisplayName("Проверяем Issues в репозитории|Step lambda (name, () -> {})")

    public void checkIssue () {
        step("Открываем главную страницу Github", () ->{
            open("https://github.com/");
        });

        step("Ищем репозиторий" +REPOSITORY, () ->{
            $(".header-search-input").click();
            $(".header-search-input").setValue(REPOSITORY).pressEnter();
        });

        step("Переходим в репозиторий" +REPOSITORY, () ->{
            $(By.linkText(REPOSITORY)).click();
        });

        step("Открываем Issues", () ->{
            $(By.partialLinkText("Issues")).click();
        });

        step("Проверяем, что существует Issue с номером" + issue_number, () ->{
            $(withText("#"+issue_number)).should(Condition.visible);
        });




    }
}
