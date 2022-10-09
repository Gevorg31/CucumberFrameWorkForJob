package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.QualificationsPage;
import utils.CommonMethods;

public class AddEmployeesSkillsSteps extends CommonMethods {

    @When("admin user clicks on Add button in Skills block")
    public void admin_user_clicks_on_add_button_in_skills_block() {
        click(qualification.addSkillBtn);
    }
    @When("admin user select skill from DD, enters years and comments {string} {string} {string}")
    public void admin_user_select_skill_from_dd_enters_years_and_comments(String skill, String years, String comments) throws InterruptedException {
        selectDdValue(qualification.sskill_DDF, skill);
        sendText(qualification.skillYearsExperience, years);
        sendText(qualification.skill_comments_Field, comments);
        Thread.sleep(2000);
    }

    @When("admin user select skill2 from DD, enters years and comments {string} {string} {string}")
    public void admin_user_select_skill2_from_dd_enters_years_and_comments(String skill2, String years2, String comments2) throws InterruptedException {
        selectDdValue(qualification.sskill_DDF, skill2);
        sendText(qualification.skillYearsExperience, years2);
        sendText(qualification.skill_comments_Field, comments2);
        Thread.sleep(2000);
    }

    @When("admin user click on Save button in Skills block")
    public void admin_user_click_on_save_button_in_skills_block() {
        click(qualification.skillSaveBtn);
        Assert.assertTrue("Skill has not been added to Employee", qualification.successMessage.isDisplayed());
        Assert.assertTrue("Skill has not been added to Employee", qualification.successMessage.getText().contains("Successfully Saved"));
    }
    @Then("skill has been added successfully {string} {string} {string}")
    public void skill_has_been_added_successfully(String skill, String years, String comments) {
        for (WebElement row : qualification.skillTable
             ) {
            if(row.getText().contains(skill)) {
                Assert.assertTrue("Row "+skill+" does not contain skill name", row.getText().contains(skill));
                Assert.assertTrue("Row "+skill+" does not contain skill years", row.getText().contains(years));
                Assert.assertTrue("Row "+skill+" does not contain skill comments", row.getText().contains(comments));
            }
        }
    }
}
