package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.AddLicensePage;
import pages.DashboardPage;
import utils.CommonMethods;


public class AddLicensesSteps extends CommonMethods {

    @When("admin user navigates to Qualifications")
    public void admin_user_navigates_to_qualifications() {
        click(dash.adminOption);
        click(dash.qualificationOption);
    }
    
    @When("admin user selects Licenses")
    public void admin_user_selects_licenses() {
        click(dash.licenseOption);
    }
    
    @When("admin user add new {string}")
    public void admin_user_add_new(String licenseName) {

        for (WebElement row: addEmpLicense.licenseTable) {
            if (row.getText().contains(licenseName)) {
                System.out.println("License "+licenseName+" is already exist in the list. Deleting this license in order to verify functionality of adding license");
                click(driver.findElement(By.xpath("//a[text()='"+licenseName+"']/parent::td/preceding-sibling::td/input")));
                click(addEmpLicense.deleteBtn);
                break;
            }
        }

        click(addEmpLicense.addLicenceButton);
        sendText(addEmpLicense.licenseNameField, licenseName);
        click(addEmpLicense.saveBtn);
        Assert.assertTrue("License has not been added", addEmpLicense.successMessage.isDisplayed());
        Assert.assertTrue("License has not been added", addEmpLicense.successMessage.getText().contains("Successfully Saved"));

    }
    @Then("verify new {string} is created")
    public void verify_new_license_is_created(String licenseName) {
        boolean added = false;
        for (WebElement row : addEmpLicense.licenseTable) {
            if (row.getText().contains(licenseName)) {
                System.out.println("License " + licenseName + " has benn added");
                added = true;
                break;
            }
        }
        Assert.assertTrue("License has not been added", added);
    }
}
