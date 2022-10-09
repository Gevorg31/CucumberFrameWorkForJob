package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.PersonalDetailsPage;
import pages.QualificationsPage;
import utils.CommonMethods;

public class AddLicenseToEmployeeSteps extends CommonMethods {

    @When("admin user clicks on Qualifications tab")
    public void admin_user_clicks_on_qualifications_tab() {
        click(pDetails.qualificationsBtn);
    }
    @When("admin user clicks on Add button in License block")
    public void admin_user_clicks_on_add_button_in_license_block() {
        click(qualification.addLicenseBtn);
    }
    @Then("admin user checks licenses fields are displayed")
    public void admin_user_checks_licenses_fields_are_displayed() {
        Assert.assertTrue("License type field is not displayed", qualification.license_type_DDF.isDisplayed());
        Assert.assertTrue("License number field is not displayed", qualification.license_number_Field.isDisplayed());
        Assert.assertTrue("Issue data field is not displayed", qualification.issue_date_Field.isDisplayed());
        Assert.assertTrue("Expiry data field is not displayed", qualification.expiry_date_Field.isDisplayed());
    }
    @Then("admin user selects {string} and enters {string} {string} {string} for checking editable")
    public void admin_user_selects_and_enters_for_checking_editable(String licenseType, String licenseNumber, String issuedDate, String expiryDate) {
        selectDdValue(qualification.license_type_DDF, licenseType);
        sendText(qualification.license_number_Field, licenseNumber);
        sendText(qualification.issue_date_Field, issuedDate);
        sendText(qualification.expiry_date_Field, expiryDate);
        click(qualification.licenseSaveBtn);
        Assert.assertTrue("License has not been added", qualification.successMessage.isDisplayed());
        Assert.assertTrue("License has not been added", qualification.successMessage.getText().contains("Successfully Saved"));
    }
}
