package steps;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;
import utils.Constants;

public class AddEmployeeSteps extends CommonMethods {
   
	public static String empID;
    public static String empName;

    @Given("user navigates to AddEmployeePage")
	public void user_navigates_to_AddEmployeePage() {
    	dash.navigateToAddEmployee();
	}

    @When("admin user enters {string} {string} and {string}")
    public void admin_user_enters_and(String firstName, String middleName, String lastName) {
        sendText(addEmployee.firstName, firstName);
        sendText(addEmployee.middleName, middleName);
        sendText(addEmployee.lastName, lastName);
        sendText(addEmployee.photograph, Constants.BUG_BUSTERS_PICTURE_FILEPATH);
        empID = addEmployee.empID.getAttribute("value");
        empName = addEmployee.firstName.getAttribute("value")+" "+ addEmployee.middleName.getAttribute("value");
    }

    @When("admin user click on save button")
    public void admin_user_click_on_save_button() {
        click(addEmployee.saveBtn);
    }

    @Then("employee added successfully")
    public void employee_added_successfully() {
        Assert.assertEquals("Assertion Failed!", empID, pDetails.actual_employeeID.getAttribute("value"));
    }
    
    @Then("employee added successfully in Employee List")
    public void employee_added_successfully_in_employee_list() {
        click(dash.pimOption);
        boolean flag = false;
        for (WebElement obj : empList.EmployeeInfoTable) {
            if (obj.getText().contains(empID)){
                flag=true;
                break;
            }
        }
        Assert.assertTrue("Assertion Failed!",flag);
    }
}
