package steps;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;

public class EmergencyContactsSteps extends CommonMethods {

    @When("admin user click on Emergency Contacts and on add button")
    public void admin_user_click_on_emergency_contacts_and_on_add_button() {
        click(pDetails.emergencyContactsBtn);
        click(emergencyContact.AddBtn);
    }

    @When("admin user enters {string} and {string} and {string} and {string} and {string}")
    public void admin_user_enters_and_and_and_and(String name, String relationship, String hometel, String mobile, String worktel) {
        sendText(emergencyContact.name_Field, name);
        sendText(emergencyContact.relationship_Field, relationship);
        sendText(emergencyContact.homePhone_Field, hometel);
        sendText(emergencyContact.mobilePhone_Field, mobile);
        sendText(emergencyContact.workPhone_Field, worktel);
    }

    @When("admin user clicks on save button on Emergency Contacts page")
    public void admin_user_clicks_on_save_button_on_emergency_contacts_page() {
        click(emergencyContact.SaveBtn);
        Assert.assertTrue("Emergency contact has not been added", emergencyContact.successMessage.isDisplayed());
        Assert.assertTrue("Emergency contact has not been added", emergencyContact.successMessage.getText().contains("Successfully Saved"));
    }

    @Then("employees Emergancy Contact {string} added successfully")
    public void employees_emergancy_contact_added_successfully(String name) {
        boolean added = false;
        for (WebElement row : emergencyContact.emContactsTable
        ) {
            if (row.getText().contains(name)) {
                System.out.println("Emergency Contact " + name + " has benn added");
                added = true;
                break;
            }

        }

        Assert.assertTrue("Emergency Contact has not been added",added);
    }
}
