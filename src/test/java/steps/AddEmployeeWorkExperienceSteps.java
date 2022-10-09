package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PersonalDetailsPage;
import pages.QualificationsPage;
import utils.CommonMethods;

public class AddEmployeeWorkExperienceSteps extends CommonMethods {


    @When("admin user clicks on Qualifications button in employee sidebar")
    public void admin_user_clicks_on_qualifications_button_in_employee_sidebar() {
        click(pDetails.qualificationsBtn);

    }
    @When("admin user clicks on Add button in Work Experience block")
    public void admin_user_clicks_on_add_button_in_work_experience_block() {
     click(qualification.addWorkExperienceBtn);
    }

    @Then("admin user enters Company name")
    public void admin_user_enters_company_name() {
        sendText(qualification.company_Field,"Bug Busters Pro");
    }

    @Then("admin user enters Job tittle")
    public void admin_user_enters_job_tittle() {
        sendText(qualification.experience_jobtitle_Field, "Tester");
    }

    @Then("admin user selects From Date from calendar")
    public void admin_user_selects_from_date_from_calendar() {
        sendText(qualification.from_Field, "2017-08-11");
        click(qualification.from_date_Close);

    }

    @Then("admin user selects To Date from calendar")
    public void admin_user_selects_to_date_from_calendar() {
       sendText(qualification.to_Field, "2021-10-21");
       click(qualification.to_date_Close);
    }

    @Then("admin user adding comments in comment box")
    public void admin_user_adding_comments_in_comment_box() {
        sendText(qualification.experience_comments_Field, "The best working experience ever!");
    }

    @Then("admin user clicks on Save button")
    public void admin_user_clicks_on_save_button() {
        click(qualification.workExpSaveBtn);
    }
}
