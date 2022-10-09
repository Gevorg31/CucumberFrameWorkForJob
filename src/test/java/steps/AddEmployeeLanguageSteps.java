package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.QualificationsPage;
import utils.CommonMethods;

import java.util.Arrays;
import java.util.List;

public class AddEmployeeLanguageSteps extends CommonMethods {
    @When("admin user clicks on Add button in Languages block")
    public void admin_user_clicks_on_add_button_in_languages_block() {
        click(qualification.addLanguageBtn);
    }

    @When("admin user fills the Add Language window form with {string} {string} {string} {string}")
    public void admin_user_fills_the_add_language_window_form_with(String language, String fluency, String competency, String comments) {
        selectDdValue(qualification.language_DDF, language);
        selectDdValue(qualification.fluency_DDF, fluency);
        selectDdValue(qualification.competency_DDF, competency);
        sendText(qualification.language_comments_Field, comments);
    }

    @When("admin user click on Save button in Language block")
    public void admin_user_click_on_save_button_in_language_block() {
        click(qualification.languageSaveBtn);
    }

    @Then("added information {string} {string} {string} {string} is displayed in the Language data table")
    public void added_information_is_displayed_in_the_language_data_table(String language, String fluency, String competency, String comments) {
        List<String> testData = Arrays.asList(language, fluency, competency, comments);
        List<WebElement> langTable = qualification.lang_data_table_Cells;
        for (int expected = 0, actual = 0; expected < testData.size(); expected++, actual++) {
            Assert.assertEquals("Assertion on adding language: Failed", testData.get(expected), langTable.get(actual).getText());
        }
    }
}
