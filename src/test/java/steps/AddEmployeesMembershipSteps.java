package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.MembershipsPage;
import pages.PersonalDetailsPage;
import utils.CommonMethods;

public class AddEmployeesMembershipSteps extends CommonMethods {
    @When("admin user clicks on Memberships button in employee sidebar")
    public void admin_user_clicks_on_memberships_button_in_employee_sidebar() {
        jsScroll();
        jsScroll();
        click(pDetails.membershipsBtn);
    }

    @When("admin user clicks on Add button in Assigned Memberships block")
    public void admin_user_clicks_on_add_button_in_assigned_memberships_block() {
        click(membership.addMembershipButton);
    }
    @When("admin user select {string}, {string}, {string}, {string}, {string}, enters {string}")
    public void admin_user_select_enters(String memberships, String paidBy, String currency, String commenceDate, String renewalDate, String amount) {
        selectDdValue(membership.membership, memberships);
        selectDdValue(membership.membershipPaidBy, paidBy);
        selectDdValue(membership.membershipCurrency, currency);
        sendText(membership.membershipCommenceDate, commenceDate);
        sendText(membership.membershipRenewalDate, renewalDate);
        sendText(membership.membershipAmount, amount);
    }
    @When("admin user click on Save button in Add Membership block")
    public void admin_user_click_on_save_button_in_add_membership_block() {
        click(membership.btnSaveMembership);
        Assert.assertTrue("Skill has not been added to Employee", membership.successMessage.isDisplayed());
        Assert.assertTrue("Skill has not been added to Employee", membership.successMessage.getText().contains("Successfully Saved"));
    }
    @Then("membership has been added successfully {string} {string} {string} {string} {string} {string}")
    public void membership_has_been_added_successfully(String memberships, String paidBy, String currency, String commenceDate, String renewalDate, String amount) {
        for (WebElement row : membership.membershipTable) {
            if(row.getText().contains(memberships)) {
                Assert.assertTrue("Row "+membership+" does not contain membership membership", row.getText().contains(memberships));
                Assert.assertTrue("Row "+membership+" does not contain membership paidBy", row.getText().contains(paidBy));
                Assert.assertTrue("Row "+membership+" does not contain membership currency", row.getText().contains(currency));
                Assert.assertTrue("Row "+membership+" does not contain membership commenceDate", row.getText().contains(commenceDate));
                Assert.assertTrue("Row "+membership+" does not contain membership renewalDate", row.getText().contains(renewalDate));
                Assert.assertTrue("Row "+membership+" does not contain membership amount", row.getText().contains(amount));
            }
        }
    }
}
