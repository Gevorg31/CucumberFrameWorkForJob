package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.DependantsPage;
import pages.PersonalDetailsPage;
import utils.CommonMethods;
import java.util.*;

public class MultipleDependentsSteps extends CommonMethods {
    @When("admin user clicks on Dependents and on add btn")
    public void admin_user_clicks_on_dependents_and_on_add_btn() {
        click(pDetails.dependentsBtn);
    }

    @And("admin user enters {string} selects Relationship and DOB and clicks on save btn")
    public void admin_user_enters_selects_relationship_and_dob_and_clicks_on_save_btn(String name) {
        for (int i = 0; i < 3; i++) {
            String date = getRandomDate();
            click(dependant.addBtn);
            sendText(dependant.name_Field, name + (i + 1));
            selectDdValue(dependant.relationship_DDF, "Child");
            sendText(dependant.dateOfBirth_Field, date);
            click(dependant.saveBtn);
        }
        getWait();
    }

    @Then("added information is displayed and editable {string}")
    public void added_information_is_displayed_and_editable(String name) {
        Assert.assertTrue("Dependent has not been added", dependant.successMessage.isDisplayed());
        Assert.assertTrue("Dependent has not been added", dependant.successMessage.getText().contains("Successfully Saved"));
        boolean added = false;
        for(WebElement row : dependant.dependent_list){
            if (row.getText().contains(name)) {
                System.out.println("Dependent " + name + " has been added");
                added = true;
                break;
            }
        }
        Assert.assertTrue("has not been added", added);
    }
}