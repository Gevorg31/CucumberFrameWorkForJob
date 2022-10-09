package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.DashboardPage;
import pages.LanguagesPage;
import pages.SkillsPage;
import utils.CommonMethods;

import java.util.List;
import java.util.Map;

public class AddLanguagesInQualificationsSteps extends CommonMethods {
    @When("admin user clicks on Admin tab")
    public void admin_user_clicks_on_admin_tab() {
        click(dash.AdminTabBtn);
    }

    @Then("admin user selects Languages Tab")
    public void admin_user_clicks_on_languages_in_qualification_tab() {
        click(dash.QualificationTabBtn);
        click(dash.LanguagesTabBtn);

    }

    @Then("admin user see Language page is displayed")
    public void admin_user_see_language_page_is_displayed() {
   /*     String LanguagePageVerification = languagesPage.LanguageTabVerification.getText();
        System.out.println(LanguagePageVerification);*/
        Assert.assertTrue(language.LanguageTabVerification.isDisplayed());
    }

    @When("admin user adds languages in qualifications and verify them that data is added successfully")
    public void admin_user_adds_languages_in_qualifications_and_verify_them_that_data_is_added_successfully(DataTable languages) throws InterruptedException {
        List<Map<String, String>> languageNames = languages.asMaps();
        for (Map<String, String> languageName : languageNames) {
            String valueLanguage = languageName.get("language");
            for (WebElement row : language.languageTable) {
                if (row.getText().contains(valueLanguage)) {
                    System.out.println("Language " + valueLanguage + " is already exist in the list. Deleting this language from the list first, then adding again to check functionality");
                    click(driver.findElement(By.xpath("//a[text()='" + valueLanguage + "']/parent::td/preceding-sibling::td/input")));
                    click(language.deleteButton);
                    break;
                }
            }
            click(language.AddBtn);
            Assert.assertTrue(language.LanguageNameTextBox.isDisplayed());
            sendText(language.LanguageNameTextBox, valueLanguage);
            click(language.SaveBtn);
            Assert.assertTrue("Language has not been added", language.MessageVerification.isDisplayed());
            jsScroll();
        }
    }
}




