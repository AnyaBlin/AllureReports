package blin.ann;

import blin.ann.steps.WebSteps;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CheckIssueInRepoWithAnnotation {

    private static final String REPOSITORY = "eroshenkoam/allure-example";
    private static final int issue_number = 74;

    private WebSteps steps = new WebSteps();

    @Test
    @DisplayName("Проверяем Issues в репозитории|Аннотации @Steps")

    public void checkIssue() {
        steps.openMainPage();
        steps.searchRepo(REPOSITORY);
        steps.goToRepo(REPOSITORY);
        steps.openIssue();
        steps.checkIssueWithNumber(issue_number);


    }
}
