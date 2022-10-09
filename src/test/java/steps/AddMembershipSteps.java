package steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;

public class AddMembershipSteps extends CommonMethods {

    @When("admin user selects Membership")
    public void admin_user_selects_membership() {
        click(dash.membershipOption);
    }

    @When("admin user adding new {string}")
    public void admin_user_adding_new(String MembershipName) {

        for (WebElement row : membership.membershipTable
        ) {
            if (row.getText().contains(MembershipName)) {
                System.out.println("Membership Name "+MembershipName+" is already exist in the list. Deleting this Membership in order to verify functionality of adding Membership");
                click(driver.findElement(By.xpath("//a[text()='"+MembershipName+"']/parent::td/preceding-sibling::td/input")));
                click(membership.deleteButton);
                click(membership.confirmDeleteButton);
                break;
            }
        }

        click(membership.addMembershipBtn);
        sendText(membership.MembershipNameField, MembershipName);
        click(membership.btnSaveMembership);

    }
    @Then("verify new membership is created")
    public void verify_new_membership_is_created() {
        String expectedMessage = "Successfully Saved";
        String actualMessage = membership.successMessage.getText();
        Assert.assertTrue("Membership has not been added", actualMessage.contains(expectedMessage));
    }
}
