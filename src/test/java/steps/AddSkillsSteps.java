package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.DashboardPage;
import pages.SkillsPage;
import utils.CommonMethods;

public class AddSkillsSteps extends CommonMethods {


    @When("admin user add new skills {string} {string}")
    public void admin_user_add_new_skills(String skillName, String skillDescription) throws InterruptedException {
        for (WebElement row : skills.skillTable
        ) {
            if (row.getText().contains(skillName)) {
                System.out.println("Skill "+skillName+" is already exist in the list. Deleting this skill in order to verify functionality of adding skill");
                click(driver.findElement(By.xpath("//a[text()='"+skillName+"']/parent::td/preceding-sibling::td/input")));
                click(skills.deleteButton);
                break;
            }
        }
        click(skills.addButton);
        sendText(skills.skillName, skillName);
        sendText(skills.skillDescription, skillDescription);
        click(skills.saveButton);
        Assert.assertTrue("Skill has not been added", skills.successMessage.isDisplayed());
    }

    @Then("all new skills has been added successfully {string} {string}")
    public void all_new_skills_has_been_added_successfully(String skillName, String skillDescription) {
        jsScroll();
        for (WebElement row : skills.skillTable
        ) {
            if (row.getText().contains(skillName) && row.getText().contains(skillDescription)) {
                System.out.println("Skill "+skillName+" has been added");
                break;
            }
        }
    }
}

