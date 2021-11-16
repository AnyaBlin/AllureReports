package blin.ann;

import blin.ann.steps.WebSteps;
import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class CheckIssueInRepoWithAnnotation {

private static final String REPOSITORY = "eroshenkoam/allure-example";
    private static final int issue_number  = 74;

    private WebSteps steps = new WebSteps();

    @Test
    @DisplayName("Проверяем Issues в репозитории|Аннотации @Steps")

    public void checkIssue () {
        steps.openMainPage();
        steps.searchRepo(REPOSITORY);
        steps.goToRepo(REPOSITORY);
        steps.openIssue();
        steps.checkIssueWithNumber(issue_number);




    }
}
