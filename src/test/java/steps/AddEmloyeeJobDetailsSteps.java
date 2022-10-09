package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.*;
import utils.CommonMethods;
import utils.Constants;

public class AddEmloyeeJobDetailsSteps extends CommonMethods {

    @When("admin user navigates to Employee List")
    public void admin_user_navigates_to_employee_list() {
        click(dash.employeeListOption);
    }

    @When("admin user clicks on searched employee")
    public void admin_user_clicks_on_searched_employee() throws InterruptedException {
        for (int i = 0; i < employeeListPage.EmployeeInfoTable.size(); i++) {
            String textRow = employeeListPage.EmployeeInfoTable.get(i).getText();
            System.out.println(textRow);
            if (textRow.contains(AddEmployeeSteps.empName)) {
                click(employeeListPage.IdInTable);
                break;
            }
        }
    }

    @When("admin user searches an employee by employee name")
    public void admin_user_searches_an_employee_by_employee_name() throws InterruptedException {
        Thread.sleep(2000);
        sendText(employeeListPage.employeeNameField, AddEmployeeSteps.empName, Keys.ENTER);
        Thread.sleep(2000);
        jsClick(employeeListPage.searchButton);
    }

    @Then("personal details page is displayed")
    public void personal_details_page_is_displayed() {
        Assert.assertTrue(pDetails.personalDetailsBtn.isDisplayed());
    }

    @When("admin user clicks on Job tab")
    public void admin_user_clicks_on_job_tab() {
        click(job.JobTab);
    }

    @And("admin user clicks on Edit button")
    public void admin_user_clicks_on_edit_button() {
        jsScroll();
        click(job.editBtn);
    }


    @Then("admin user selects  Job Title from dropdown")
    public void admin_user_selects_job_title_from_dropdown() {
    	 selectDdValue(job.job_title_DDF,11);
    }


    @Then("admin user selects Employment Status from dropdown")
    public void admin_user_selects_employment_status_from_dropdown() {
    	 selectDdValue(job.emp_status_DDF,6);
    }

    @Then("admin user selects Job Category from dropdown")
    public void admin_user_selects_job_category_from_dropdown() {
        selectDdValue(job.job_category_DDF,11);
    }

    @Then("admin user selects Joined Date {string} from calendar")
    public void admin_user_selects_joined_date_from_calendar(String date) {
        sendText(job.joined_date_Field, date);
        click(job.joined_date_Close);
    }

    @Then("admin user selects  Sub Unit from dropdown")
    public void admin_user_selects_sub_unit_from_dropdown() {
    	 selectDdValue(job.sub_unit_DDF,2);
    }

    @Then("admin user selects Location from dropdown")
    public void admin_user_selects_location_from_dropdown() {
    	 selectDdValue(job.location_DDF,5);
    }

    @Then("admin user selects Start Date {string} from calendar")
    public void admin_user_selects_start_date_from_calendar(String startDate) {
        sendText(job.start_date_Field, startDate);
        click(job.start_date_Close);
        jsScroll();
    }

    @Then("admin user selects End Date {string} from calendar")
    public void admin_user_selects_end_date_from_calendar(String endDate) {
        sendText(job.end_date_Field, endDate);
        click(job.end_date_Close);
    }

    @Then("admin user selects file to upload and uploads this file")
    public void admin_user_selects_file_to_uploads_and_upload_this_file() throws InterruptedException {
        if (!job.contract_details_Field.isDisplayed()) {
            click(job.ReplaceInfoBtn);
            sendText(job.contract_details_Field, Constants.BUG_BUSTERS_PICTURE_FILEPATH);
            Thread.sleep(2000);
        } else {
            sendText(job.contract_details_Field, Constants.BUG_BUSTERS_PICTURE_FILEPATH);
            jsScroll();
        }
    }

    @Then("admin user clicks on save button")
    public void admin_user_clicks_on_save_button() throws InterruptedException {
        click(job.saveBtn);
        Assert.assertTrue("assertion failed",job.MessageVerification.isDisplayed());
        System.out.println("Job details data was successfully saved");
        jsScroll();
        Thread.sleep(5000);
    }
}
