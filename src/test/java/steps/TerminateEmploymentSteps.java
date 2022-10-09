package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.JobPage;
import utils.CommonMethods;

public class TerminateEmploymentSteps extends CommonMethods {
	
    @When("admin user click on Terminate Employment button")
    public void admin_user_click_on_terminate_employment_button() {
        click(job.terminateEmployementBtn);
    }
    
    @When("admin user fills the Termination window form with {string} and {string} and {string}")
    public void admin_user_fills_the_termination_window_form_with_and_and(String reason, String date, String note) {
        selectDdValue(job.reason_DDF, reason);
        sendText(job.date_Field, date);
        sendText(job.note_Field, note);
    }
    @When("click on Confirm button")
    public void click_on_confirm_button() {
        click(job.confirmBtn);
    }
    
    @Then("specified employee is terminated")
    public void specified_employee_is_terminated() {
        Assert.assertTrue("Assertion on Employee Termination: FAILED", job.terminated_on_Stamp.isDisplayed());
    }
    
    @Then("following data is displayed in Termination window stamp {string} {string} {string}")
    public void following_data_is_displayed_in_termination_window_stamp(String reason, String date, String note) {
        click(job.terminated_on_Stamp);
        Select select = new Select(job.reason_DDF);
        String flag = "";
        for (WebElement obj : select.getOptions()) {
            if (obj.getText().equals(reason)) {
                flag = obj.getText();
            }
        }
        Assert.assertEquals(reason, flag);
        Assert.assertEquals(date, job.date_Field.getAttribute("value"));
        Assert.assertEquals(note, job.note_Field.getText());
    }
}
